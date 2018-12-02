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
    
    public boolean inserir(Venda obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "INSERT INTO VENDAS (IDVENDA, DATAVENDA, VALORTOTAL, TIPOPAG, QTDITEM, FK_IDCLIENTE) values (?, NOW(), ?, ?, ?, ?)";
        //Cria o pst com base na conexao e no comando DML
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        stmt.setInt(1, obj.getIdVenda());
        stmt.setDouble(2, obj.getValorTotal());
        stmt.setString(3, obj.getTipoPag());
        stmt.setInt(4, obj.getQtdItens());
        stmt.setInt(5, obj.getCliente());
        
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
    
    public int carregaCodigo () throws SQLException, ClassNotFoundException {
        //função para ir preenchendo o ID Venda no banco de dados
        int retorno;
        String sql = "SELECT IDVENDA FROM VENDAS ORDER BY IDVENDA DESC";
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        rs = stmt.executeQuery();
        if(!rs.next()) {
            rs.close();
            BancoDerby.fechar();
            return 1;
        }
        else {
            retorno = rs.getInt("IDVENDA");
            rs.close();
            BancoDerby.fechar();
            return retorno+1;
        }
    }
    
    public boolean insereItem (int idVenda, int idMed) throws ClassNotFoundException, SQLException{
        //cria o comando DML
        String sql = "INSERT INTO VENDASITENS (FK_IDVENDA, FK_IDMEDICAMENTO) values (?, ?)";
        //Cria o pst com base na conexao e no comando DML
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        stmt.setInt(1, idVenda);
        stmt.setInt(2, idMed);       
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
