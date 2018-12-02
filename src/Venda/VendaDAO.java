/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venda;

import Cliente.Cliente;
import java.sql.SQLException;
import projetoviotti.BancoDerby;

/**
 *
 * @author Wellington
 */
public class VendaDAO {
    //Variaveis auxiliares
    private Cliente cliente; //model para dados
    //recebera comandos DML
    private java.sql.PreparedStatement stmt; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    
    public boolean inserir(Cliente obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "INSERT INTO VENDAS (IDCLIENTE, CPF, NOME, DATANASC, APOSENTADO, SEXO) values (?, ?, ?, ?, ?, ?)";
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
