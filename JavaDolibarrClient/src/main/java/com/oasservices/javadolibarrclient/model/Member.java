/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oasservices.javadolibarrclient.model;

import java.util.List;

/**
 * Represent an HBC Member
 * @author oandrade
 */

public class Member {
    List<String> mesgs;
    String login;
    String pass;
    String pass_indatabase;
    String pass_indatabase_crypted;
    String societe;
    String company;
    String address;
    String zip;
    String town;
    String state_id;
    String state_code;
    String state;
    String email;
    String skype;    
    String phone;
    String phone_perso;
    String phone_mobile;
    String morphy;
//    String public;
    String statut;
    String photo;
    int datec;
    int datem;
    int datefin;
    int datevalid;
    String birth;
    //"note_public": null,
    //"note_private": null,
    String typeid;
    String type;
    String need_subscription;
    //int user_id": null,
    //"user_login": null,
    String fk_soc;
    String first_subscription_date;
    String first_subscription_amount;
    String last_subscription_date;
    String last_subscription_date_start;
    String last_subscription_date_end;
    String last_subscription_amount;
    String entity;
    String id;
    //"import_key": null,
    //"array_options": [],
    //"linkedObjectsIds": null,
    //"canvas": null,
    //"fk_project": null,
    //"contact": null,
    //"contact_id": null,
    //"thirdparty": null,
    //"user": null,
    //"origin": null,
    //"origin_id": null,
    String ref;
    //"ref_ext": null,
    String country;
    String country_id;
    String country_code;
    //"barcode_type": null,
    //"barcode_type_code": null,
    //"barcode_type_label": null,
    //"barcode_type_coder": null,
    //"mode_reglement_id": null,
    //"cond_reglement_id": null,
    //"cond_reglement": null,
    //"fk_delivery_address": null,
    //"shipping_method_id": null,
    //"modelpdf": null,
    //"fk_account": null,
    //"note": null,
    //"total_ht": null,
    //"total_tva": null,
    //"total_localtax1": null,
    //"total_localtax2": null,
    //"total_ttc": null,
    //"fk_incoterms": null,
    //"libelle_incoterms": null,
    //"location_incoterms": null,
    //"name": null,
    String lastname;
    String firstname;
    String civility_id;
//    "model_pdf": "standard:5160"

    public List<String> getMesgs() {
        return mesgs;
    }

    public void setMesgs(List<String> mesgs) {
        this.mesgs = mesgs;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass_indatabase() {
        return pass_indatabase;
    }

    public void setPass_indatabase(String pass_indatabase) {
        this.pass_indatabase = pass_indatabase;
    }

    public String getPass_indatabase_crypted() {
        return pass_indatabase_crypted;
    }

    public void setPass_indatabase_crypted(String pass_indatabase_crypted) {
        this.pass_indatabase_crypted = pass_indatabase_crypted;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone_perso() {
        return phone_perso;
    }

    public void setPhone_perso(String phone_perso) {
        this.phone_perso = phone_perso;
    }

    public String getPhone_mobile() {
        return phone_mobile;
    }

    public void setPhone_mobile(String phone_mobile) {
        this.phone_mobile = phone_mobile;
    }

    public String getMorphy() {
        return morphy;
    }

    public void setMorphy(String morphy) {
        this.morphy = morphy;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getDatec() {
        return datec;
    }

    public void setDatec(int datec) {
        this.datec = datec;
    }

    public int getDatem() {
        return datem;
    }

    public void setDatem(int datem) {
        this.datem = datem;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getCivility_id() {
        return civility_id;
    }

    public void setCivility_id(String civility_id) {
        this.civility_id = civility_id;
    }

    public int getDatefin() {
        return datefin;
    }

    public void setDatefin(int datefin) {
        this.datefin = datefin;
    }

    public int getDatevalid() {
        return datevalid;
    }

    public void setDatevalid(int datevalid) {
        this.datevalid = datevalid;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNeed_subscription() {
        return need_subscription;
    }

    public void setNeed_subscription(String need_subscription) {
        this.need_subscription = need_subscription;
    }

    public String getFk_soc() {
        return fk_soc;
    }

    public void setFk_soc(String fk_soc) {
        this.fk_soc = fk_soc;
    }

    public String getFirst_subscription_date() {
        return first_subscription_date;
    }

    public void setFirst_subscription_date(String first_subscription_date) {
        this.first_subscription_date = first_subscription_date;
    }

    public String getFirst_subscription_amount() {
        return first_subscription_amount;
    }

    public void setFirst_subscription_amount(String first_subscription_amount) {
        this.first_subscription_amount = first_subscription_amount;
    }

    public String getLast_subscription_date() {
        return last_subscription_date;
    }

    public void setLast_subscription_date(String last_subscription_date) {
        this.last_subscription_date = last_subscription_date;
    }

    public String getLast_subscription_date_start() {
        return last_subscription_date_start;
    }

    public void setLast_subscription_date_start(String last_subscription_date_start) {
        this.last_subscription_date_start = last_subscription_date_start;
    }

    public String getLast_subscription_date_end() {
        return last_subscription_date_end;
    }

    public void setLast_subscription_date_end(String last_subscription_date_end) {
        this.last_subscription_date_end = last_subscription_date_end;
    }

    public String getLast_subscription_amount() {
        return last_subscription_amount;
    }

    public void setLast_subscription_amount(String last_subscription_amount) {
        this.last_subscription_amount = last_subscription_amount;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
    
    
}
