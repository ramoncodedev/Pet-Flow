package com.Petflow.PetFlow.model;

public class Pessoa {

    private String nome;
    private String cpf;
    private int telefone;
    private char sexo;


    public Pessoa(){
        nome = "";
        cpf = "";
        telefone = 0;
        sexo = 'M';
    }

    public Pessoa(String nome, String cpf, int telefone, char sexo){

        this.nome = nome;
        this.cpf =  cpf;
        this.telefone = telefone;
        this.sexo = sexo;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
