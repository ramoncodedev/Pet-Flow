package com.Petflow.PetFlow.model;

public class Funcionario extends Pessoa{

    private String salario;
    private String funcao;

    public Funcionario(){
        salario = "";
        funcao = "";
    }

    public Funcionario(String salario, String funcao){
        this.salario = salario;
        this.funcao = funcao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
