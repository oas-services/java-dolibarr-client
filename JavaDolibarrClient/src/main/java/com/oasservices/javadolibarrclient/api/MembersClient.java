/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oasservices.javadolibarrclient.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.oasservices.javadolibarrclient.model.ApiAnswer;
import com.oasservices.javadolibarrclient.model.Member;
import com.oasservices.javadolibarrclient.model.Subscription;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author oandrade
 */
public class MembersClient {
    DolibarrClient rootClient;
    
    public MembersClient(DolibarrClient rootClient){
        this.rootClient = rootClient;
    }
    
    
    public List<Member> getMembers(){
        //get /members
        WebTarget resource = rootClient.getWebTarget().path("members");
        String jsonResponse = resource.request(MediaType.APPLICATION_JSON).get(String.class);
//        GenericType<List<Member>> listMembersType = new GenericType<List<Member>>(){};
        List<Member> members=null;
        try {
            members = rootClient.getObjectMapper().readValue(jsonResponse,new TypeReference<List<Member>>() {});
        } catch (IOException ex) {
            Logger.getLogger(DolibarrClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return members;
    }
    public Member getMember(int memberId){
        //get /members/{id}
        return null;
    }
    public List<Subscription> getSubscriptions(Member member){
        //get /members/{id}/subscriptions
        return null;
    }
    public void createMember(Member member){
        //post /members
    }
    public void createSubscription(Member member, Subscription subscription){
        //post /members/{id}/subscriptions
    }
    public void updateMember(Member member){
        //put /members/{id}
    }
    public void deleteMember(Member member){
        //delete /members/{id}
    }
}
