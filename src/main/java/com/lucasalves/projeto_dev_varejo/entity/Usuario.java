package com.lucasalves.projeto_dev_varejo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;

    private String nome;
    private String senha;
    private Boolean gerente;

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Boolean getGerente() {
        return gerente;
    }
    public void setGerente(Boolean gerente) {
        this.gerente = gerente;
    }

    
    
}
