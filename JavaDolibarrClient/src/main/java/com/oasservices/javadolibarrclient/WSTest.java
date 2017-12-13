/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oasservices.javadolibarrclient;

import com.oasservices.javadolibarrclient.api.DolibarrClient;
import com.oasservices.javadolibarrclient.model.AgendaEvent;
import com.oasservices.javadolibarrclient.model.Member;
import java.util.List;

/**
 *
 * @author oandrade
 */
public class WSTest {
    
    public static void main(String[] args){
        DolibarrClient dc = new DolibarrClient(null);
        dc.initFromProperties();
        dc.login();
        System.out.println("Token : "+dc.getToken());
        if (dc.getToken()!=null){
            List<Member> members = dc.getMembers();
            for (Member member : members) {
                System.out.println("Member : "+member.getFirstname()+" "+member.getLastname());
                System.out.println("Adress : "+member.getAddress()+" "+member.getZip()+" "+member.getTown());
            }
            List<AgendaEvent> events = dc.getEvents();
            for (AgendaEvent event : events) {
                System.err.println("Evt : "+event.getLabel());
                System.err.println("Type : "+event.getType());
                System.err.println("");
            }
        }
    }
}
