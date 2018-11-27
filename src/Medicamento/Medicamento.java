/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicamento;

import java.util.Date;

/**
 *
 * @author Wellington
 */
public class Medicamento {
    private int idMed;
    private String nome;
    private Tarja tj;
    private Date fabricacao;
    private Date validade;
    private double preco;

    public enum Tarja { 
        SEMTARJA, AMARELA, VERMELHA, PRETA 
    };
    
    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tarja getTj() {
        return tj;
    }

    public void setTj(Tarja tj) {
        this.tj = tj;
    }

    public Date getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
