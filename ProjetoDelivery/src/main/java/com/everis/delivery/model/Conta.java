package com.everis.delivery.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@EntityScan
@Table(name = "conta")
public class Conta {

    private Integer id;

    private String nome;

    private String comanda;

    private String conta;

    @OneToOne(mappedBy = "conta")
    private Pagamento pagamento;


    private Double saldoDebito;

    public Conta(String nome, String comanda, String conta, double saldoDebito, double saldoCredito) {
        super();
        this.nome = nome;
        this.comanda = comanda;
        this.conta = conta;
        this.saldoDebito = saldoDebito;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComanda() {
        return comanda;
    }

    public void setComanda(String comanda) {
        this.comanda = comanda;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldoDebito() {
        return saldoDebito;
    }

    public void setSaldoDebito(double saldoDebito) {
        this.saldoDebito = saldoDebito;
    }



}


