package com.mycompany.cadastropessoaweb.controller;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

import java.io.Serializable;
@Named(value = "pessoaBean")
@RequestScoped
public class PessoaBean implements Serializable { 
    private String nome;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public void cadastrar() {
        System.out.println("CADASTROU: " + nome);
    }
}