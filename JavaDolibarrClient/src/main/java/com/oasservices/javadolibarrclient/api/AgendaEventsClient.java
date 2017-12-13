/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oasservices.javadolibarrclient.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.oasservices.javadolibarrclient.model.AgendaEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author oandrade
 */
public class AgendaEventsClient {
    DolibarrClient rootClient;
    
    public AgendaEventsClient(DolibarrClient rootClient){
        this.rootClient = rootClient;
    }
    
    public List<AgendaEvent> getEvents(){
        //get /agendaevents
        WebTarget resource = rootClient.getWebTarget().path("agendaevents");
        String jsonResponse = resource.request(MediaType.APPLICATION_JSON).get(String.class);
//        GenericType<List<AgendaEvent>> listMembersType = new GenericType<List<AgendaEvent>>(){};
        List<AgendaEvent> events=null;
        try {
            events = rootClient.getObjectMapper().readValue(jsonResponse,new TypeReference<List<AgendaEvent>>() {});
        } catch (IOException ex) {
            Logger.getLogger(DolibarrClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return events;
    }
}
