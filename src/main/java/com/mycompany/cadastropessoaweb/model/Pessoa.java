
package com.mycompany.cadastropessoaweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pessoa {
    @Id
    private Long cpf;
    private String nome;
    private String email;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
