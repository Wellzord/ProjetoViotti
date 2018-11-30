/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caixa;

import projetoviotti.DAO;

/**
 *
 * @author Wellington
 */
public class CaixaDAO implements DAO<Caixa> {
    
    //Variaveis auxiliares
    private Caixa cx; //model para dados
    //recebera comandos DML
    private java.sql.PreparedStatement stmt; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    
    @Override
    public boolean inserir(Caixa obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "INSERT INTO CLIENTES (IDCLIENTE, CPF, NOME, DATANASC, APOSENTADO, SEXO) values (?, ?, ?, ?, ?, ?)";
        //Cria o pst com base na conexao e no comando DML
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        stmt.setInt(1, obj.getIdCliente());
        stmt.setString(2, obj.getCpf());
        stmt.setString(3, obj.getNome());
        stmt.setDate(4, new java.sql.Date(obj.getDateNasc().getTime()));
        stmt.setInt(5, obj.isAposentado() ? 1 : 0);
        stmt.setString(6, String.valueOf(obj.getSexo()));
        
        //vamos executar o comando
        if(stmt.executeUpdate() > 0) {
            BancoDerby.fechar();
            return true;
        }
        else {
            BancoDerby.fechar();
            return false;
        }
    }
}
