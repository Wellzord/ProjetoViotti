/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author Wellington
 */
public class Usuario {
    public static int IDUSER;
    private String usuario;
    private String senha;
    private boolean tipoUser;
    
    public Usuario(String user, String pass, boolean tp){
        this.usuario = user;
        this.senha = pass;
        this.tipoUser = tp;
    }
    
    public Usuario(int codigo, String user, String pass, boolean tp){
        IDUSER = codigo;
        this.usuario = user;
        this.senha = pass;
        this.tipoUser = tp;
    }
    
    public Usuario(){
        
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(boolean tipoUser) {
        this.tipoUser = tipoUser;
    }
    
}
