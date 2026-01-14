package com.Petflow.PetFlow.model;

public class Cliente extends Pessoa{

    private String email;
    private String enderenco;


    public Cliente(){
        email = "";
        enderenco = "";
    }

    public Cliente(String email, String enderenco){
        this.email = email;
        this.enderenco = enderenco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnderenco() {
        return enderenco;
    }

    public void setEnderenco(String enderenco) {
        this.enderenco = enderenco;
    }
}
