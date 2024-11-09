package com.lucasalves.projeto_dev_varejo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orcamento {
    @Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;
    private long validade;
    private Cliente cliente;
    private Endereco endereco;
    private List<ItemOrcamento> colecaoItens = new ArrayList<>();

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getValidade() {
        return validade;
    }
    public void setValidade(long validade) {
        this.validade = validade;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public List<ItemOrcamento> getColecaoItens() {
        return colecaoItens;
    }
    public void setColecaoItens(List<ItemOrcamento> colecaoItens) {
        this.colecaoItens = colecaoItens;
    }

}
