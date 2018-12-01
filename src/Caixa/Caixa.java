/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caixa;

import java.util.Date;

/**
 *
 * @author Wellington
 */
public class Caixa {
    private int idCaixa;
    private double valorInicial;
    private double valorFinal;
    private Date dataAbertura;
    private Date dataFechamento;
    private boolean status;  

    //Construtor para pegar as informações inputadas qdo o cara clicar no botao abre caixa
    public Caixa(int id, double vlIni, double vlFim){
        this.valorInicial = vlIni;
    }
    
    public Caixa(){
        
    }
    
    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }  
}
