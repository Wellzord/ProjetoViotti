/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicamento;


import java.sql.SQLException;
import projetoviotti.BancoDerby;
import projetoviotti.DAO;

/**
 *
 * @author Wellington
 */
public class MedicamentoDAO implements DAO {
        //Variaveis auxiliares
    private Medicamento med; //model para dados
    //recebera comandos DML
    private java.sql.PreparedStatement stmt; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    
    @Override
    public boolean inserir(Medicamento obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "INSERT INTO MEDICAMENTOS (IDMEDICAMENTO, NOME, TARJA, VALIDADE, FABRICACAO, PRECO) values (?, ?, ?, ?, ?, ?)";
        //Cria o pst com base na conexao e no comando DML
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        stmt.setInt(1, obj.getIdMed());
        stmt.setString(2, obj.getNome());
        stmt.setString(3, obj.getTj().toString());
        stmt.setDate(4, new java.sql.Date(obj.getValidade().getTime()));
        stmt.setDate(5, new java.sql.Date(obj.getFabricacao().getTime()));
        stmt.setDouble(6, obj.getPreco());
        
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
    
    @Override
    public boolean alterar(Medicamento obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "UPDATE MEDICAMENTOS SET NOME = ?, TARJA = ?, VALIDADE = ?, FABRICACAO = ?, PRECO = ? WHERE IDMEDICAMENTO = ?)";
        //Cria o pst com base na conexao e no comando DML
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        stmt.setString(1, obj.getCpf());
        stmt.setString(2, obj.getNome());        
        stmt.setDate(3, new java.sql.Date(obj.getDateNasc().getTime()));
        stmt.setInt(4, obj.isAposentado() ? 1 : 0);
        stmt.setString(5, String.valueOf(obj.getSexo()));
        stmt.setInt(6, obj.getIdCliente());
        
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
