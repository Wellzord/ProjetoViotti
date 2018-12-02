/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venda;

import Medicamento.Medicamento;
import java.util.ArrayList;

/**
 *
 * @author Wellington
 */
public class Venda {
    private int idVenda;
    private int cliente;
    private double valorTotal;
    private ArrayList<Medicamento> lstMeds = new ArrayList<>();
    private String tipoPag;
    private int user;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<Medicamento> getLstMeds() {
        return lstMeds;
    }

    public void setLstMeds(ArrayList<Medicamento> lstMeds) {
        this.lstMeds = lstMeds;
    }

    public String getTipoPag() {
        return tipoPag;
    }

    public void setTipoPag(String tipoPag) {
        this.tipoPag = tipoPag;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }


}
