/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oasservices.javadolibarrclient.model;

/**
 *
 * @author oandrade
 */
public class ApiAnswer {
    private Success success;
    private com.oasservices.javadolibarrclient.model.Error error;
    private Debug debug;

    public Success getSuccess() {
        return success;
    }

    public void setSuccess(Success success) {
        this.success = success;
    }
    
}
