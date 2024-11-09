package com.lucasalves.projeto_dev_varejo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemOrcamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Produto produto;
    private int quantidadePecas;
    private int valorUnitario;
    private int desconto;
    private int valorTotal;

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidadePecas() {
        return quantidadePecas;
    }
    public void setQuantidadePecas(int quantidadePecas) {
        this.quantidadePecas = quantidadePecas;
    }
    public int getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public int getDesconto() {
        return desconto;
    }
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
    public int getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
