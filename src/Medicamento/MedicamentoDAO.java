/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medicamento;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projetoviotti.BancoDerby;
import projetoviotti.DAO;

/**
 *
 * @author Wellington
 */
public class MedicamentoDAO implements DAO<Medicamento> {
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
        stmt.setString(3, obj.getTarja());
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
        stmt.setString(1, obj.getNome());
        stmt.setString(2, obj.getTarja());        
        stmt.setDate(3, new java.sql.Date(obj.getValidade().getTime()));
        stmt.setDate(4, new java.sql.Date(obj.getFabricacao().getTime()));
        stmt.setDouble(5, obj.getPreco());
        stmt.setInt(6, obj.getIdMed());
        
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
    public boolean excluir(Medicamento obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "DELETE FROM MEDICAMENTOS WHERE IDMEDICAMENTO = ?";
        //Cria o pst com base na conexao e no comando DML
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        stmt.setInt(1, obj.getIdMed());
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
    public Medicamento buscar(Medicamento obj) throws SQLException, ClassNotFoundException {
        Medicamento med = null;
        String sql = "SELECT * FROM MEDICAMENTOS WHERE IDMEDICAMENTO = ?";
        String tarja;
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst

        stmt.setInt(1, obj.getIdMed());
        //Executa a PESQUISA no banco
        rs = stmt.executeQuery();
        //le o proximo registro
        if(rs.next()) { //achou alguem 
            //mover os dados do resultSet para o objeto filme
            med = new Medicamento();
            med.setIdMed(rs.getInt("IDMEDICAMENTO"));
            med.setNome(rs.getString("NOME"));
            med.setTarja(rs.getString("TARJA"));
            med.setValidade(rs.getDate("VALIDADE"));
            med.setFabricacao(rs.getDate("FABRICACAO"));
            med.setPreco(rs.getDouble("PRECO"));
        }
        //fecha o resultSet
        rs.close();
        BancoDerby.fechar();
        return med;
    }
    
    @Override
    public List<Medicamento> listar(String criterio) throws SQLException, ClassNotFoundException {
        //cria uma coleção para filmes
        ArrayList<Medicamento> lstMeds = new ArrayList<>();
        Medicamento med = null;
        String sql = "SELECT * FROM NEDICAMENTOS ";
        //verifica se tem criterio
        if(criterio.length() > 0)
            sql += "WHERE " + criterio;
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Executa a PESQUISA no banco
        rs = stmt.executeQuery();
        //le os proximos registros
        while(rs.next()) { 
            //mover os dados do resultSet para o objeto filme
            med = new Medicamento();
            med.setIdMed(rs.getInt("IDMEDICAMENTO"));
            med.setNome(rs.getString("NOME"));
            med.setTarja(rs.getString("TARJA"));
            med.setValidade(rs.getDate("VALIDADE"));
            med.setFabricacao(rs.getDate("FABRICACAO"));
            med.setPreco(rs.getDouble("PRECO"));
            //adiciona o objeto Filme dentro da colecao
            lstMeds.add(med);
        }
        //fecha o resultSet
        rs.close();
        BancoDerby.fechar();
        //devolve a colecao
        return lstMeds;        
    }
    
    public int carregaCodigo () throws SQLException, ClassNotFoundException {
        //função para ir preenchendo o ID Cliente no banco de dados
        int retorno;
        String sql = "SELECT IDMEDICAMENTO FROM MEDICAMENTOS ORDER BY IDMEDICAMENTO DESC";
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        rs = stmt.executeQuery();
        //pega o último/maior número da tabela e retorna +1;
        if(!rs.next()) {
            rs.close();
            BancoDerby.fechar();
            return 1;
        }
        else {
            rs.next();
            retorno = rs.getInt("IDMEDICAMENTO");
            rs.close();
            BancoDerby.fechar();
            return retorno+1;
        }

    }
}
