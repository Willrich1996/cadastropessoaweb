package com.mycompany.cadastropessoaweb.controller;

import com.mycompany.cadastropessoaweb.model.Pessoa;
import com.mycompany.cadastropessoaweb.repository.PessoaRepository;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;

import java.io.Serializable;
import java.util.List;
@Named(value = "pessoaBean")
@ViewScoped
public class PessoaBean implements Serializable { 
    private Pessoa pessoa = new Pessoa();
    private List <Pessoa> lista;
    private PessoaRepository repository = new PessoaRepository();

    public void cadastrar() {
        repository.salva(pessoa);
        pessoa = new Pessoa();
        lista = null;
    }
    public void excluir(Pessoa p) {
        repository.exclui(p);
        lista = null;
    }
    public void atualizar() {
        repository.salva(pessoa);
    }
    
    public List<Pessoa> getLista(){
        if (lista == null) {
            lista = repository.listaTodos();
        }
        return lista;
    }
    
    
    
    public Pessoa getPessoa() {
        return pessoa;
    }
    
    
}