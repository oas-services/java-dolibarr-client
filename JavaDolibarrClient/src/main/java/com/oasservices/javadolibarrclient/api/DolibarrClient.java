/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oasservices.javadolibarrclient.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oasservices.javadolibarrclient.model.AgendaEvent;
import com.oasservices.javadolibarrclient.model.ApiAnswer;
import com.oasservices.javadolibarrclient.model.Member;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.WebTarget;
import org.glassfish.jersey.client.ClientConfig;

/**
 * DolibarrClient
 * <br>
 * USAGE:
 * <pre>
 *        DolibarrClient client = new DolibarrClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author oandrade
 */
public class DolibarrClient {
    DolibarrClient rootClient=null;
    private final static Properties config = new Properties();
    private String token=null;
    private String url=null;
    private String user=null;
    private String password=null;
    private final Client client;
    private WebTarget webTarget;
    private WebTarget resource;
//    private Map<String,DolibarrClient> dolibarrClients=new HashMap<>();
    private ObjectMapper objectMapper = new ObjectMapper();
    private MembersClient membersClient;
    private AgendaEventsClient agendaEventsClient;
    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    public WebTarget getWebTarget(){
        return webTarget;
    }
    public ObjectMapper getObjectMapper(){
        return objectMapper;
    }
    
    public DolibarrClient(String url) {
        this.url = url;
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ClientConfig clientConfig = new ClientConfig();
        ClientRequestFilter clientRequestFilter = new ClientRequestFilter() {
            public void filter(ClientRequestContext clientRequestContext) throws IOException {
                if (token!=null){
                    clientRequestContext.getHeaders().add("DOLAPIKEY", token);
                }
            }
        };
        clientConfig.register(clientRequestFilter);
        client = ClientBuilder.newBuilder().withConfig(clientConfig).sslContext(getSSLContext()).build();
        if (url != null){
            webTarget = client.target(url);
        }
    }
    
    public void initFromProperties(){
        try {
            config.load(new FileReader("config.properties"));
            user = config.getProperty("DOLIBARR_API_USER");
            password = config.getProperty("DOLIBARR_API_PWD");
            url = config.getProperty("DOLIBARR_API_URL");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DolibarrClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DolibarrClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        webTarget = client.target(url);        
    }
    
    public void login(){
        if (user !=null && password!=null){
            this.login(user, password);
        }
    }
    
    public void login(String login, String password){
        resource = webTarget.path("login");
        resource = resource.queryParam("login", login);
        resource = resource.queryParam("password", password);
        String jsonResponse;
        ApiAnswer apiAnswer = null;
        jsonResponse = resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
        try {
            apiAnswer = objectMapper.readValue(jsonResponse, ApiAnswer.class);
        } catch (IOException ex) {
            Logger.getLogger(DolibarrClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (apiAnswer!=null){
            token = apiAnswer.getSuccess().getToken();
        }
    }
    
    public void close() {
        client.close();
    }

    private HostnameVerifier getHostnameVerifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession) {
                return true;
            }
        };
    }

    private SSLContext getSSLContext() {
        // for alternative implementation checkout org.glassfish.jersey.SslConfigurator
        javax.net.ssl.TrustManager x509 = new javax.net.ssl.X509TrustManager() {
            @Override
            public void checkClientTrusted(java.security.cert.X509Certificate[] arg0, String arg1) throws java.security.cert.CertificateException {
                return;
            }

            @Override
            public void checkServerTrusted(java.security.cert.X509Certificate[] arg0, String arg1) throws java.security.cert.CertificateException {
                return;
            }

            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        SSLContext ctx = null;
        try {
            ctx = SSLContext.getInstance("SSL");
            ctx.init(null, new javax.net.ssl.TrustManager[]{x509}, null);
        } catch (java.security.GeneralSecurityException ex) {
        }
        return ctx;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    //Public API of client FACADE
    
    //MEMBERS
    public List<Member> getMembers() {
        if (membersClient==null){
            membersClient = new MembersClient(this);
        }
        return membersClient.getMembers();
    }
    //EVENTS
    public List<AgendaEvent> getEvents(){
        if (agendaEventsClient==null){
            agendaEventsClient = new AgendaEventsClient(this);
        }
        return agendaEventsClient.getEvents();
    }
    
    
    

    
}
