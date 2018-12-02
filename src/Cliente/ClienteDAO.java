/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Views.menuPrincipal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projetoviotti.BancoDerby;
import projetoviotti.DAO;


/**
 *
 * @author Wellington
 */
public class ClienteDAO implements DAO<Cliente> {
    //Variaveis auxiliares
    private Cliente cliente; //model para dados
    //recebera comandos DML
    private java.sql.PreparedStatement stmt; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    
    @Override
    public boolean inserir(Cliente obj) throws SQLException, ClassNotFoundException {
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
    
    @Override
    public boolean alterar(Cliente obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "UPDATE CLIENTES SET CPF = ?, NOME = ?, DATANASC = ?, APOSENTADO = ?, SEXO = ? WHERE IDCLIENTE = ?)";
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
    
    @Override
    public boolean excluir(Cliente obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "DELETE FROM CLIENTES WHERE IDCLIENTE = ?";
        //Cria o pst com base na conexao e no comando DML
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        stmt.setInt(1, obj.getIdCliente());
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
    public Cliente buscar(Cliente obj) throws SQLException, ClassNotFoundException {
        cliente = null;
        String sql = "SELECT * FROM CLIENTES WHERE IDCLIENTE = ?";
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o stmt
        stmt.setInt(1, obj.getIdCliente());
        //Executa a PESQUISA no banco
        rs = stmt.executeQuery();
        //le o proximo registro
        if(rs.next()) { //achou alguem 
            //mover os dados do resultSet para o objeto filme
            cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("IDCLIENTE"));
            cliente.setCpf(rs.getString("CPF"));
            cliente.setNome(rs.getString("NOME"));
            cliente.setDateNasc(rs.getDate("DATANASC"));
            cliente.setAposentado(rs.getInt("APOSENTADO") == 1 ? true : false);
            cliente.setSexo(rs.getString("SEXO").charAt(0));
        }
        //fecha o resultSet
        rs.close();
        BancoDerby.fechar();
        return cliente;
    }
    
    @Override
    public List<Cliente> listar(String criterio) throws SQLException, ClassNotFoundException {
        //cria uma coleção para filmes
        ArrayList<Cliente> lstClientes = new ArrayList<>();
        cliente = null;
        String sql = "SELECT * FROM CLIENTES ";
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
            cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("IDCLIENTE"));
            cliente.setCpf(rs.getString("CPF"));
            cliente.setNome(rs.getString("NOME"));
            cliente.setDateNasc(rs.getDate("DATANASC"));
            cliente.setAposentado(rs.getInt("APOSENTADO")==1 ? true : false);
            cliente.setSexo(rs.getString("SEXO").charAt(0));
            //adiciona o objeto Filme dentro da colecao
            lstClientes.add(cliente);
        }
        //fecha o resultSet
        rs.close();
        BancoDerby.fechar();
        //devolve a colecao
        return lstClientes;        
    }
    
    public int carregaCodigo () throws SQLException, ClassNotFoundException {
        //função para ir preenchendo o ID Cliente no banco de dados
        int retorno;
        String sql = "SELECT IDCLIENTE FROM CLIENTES ORDER BY IDCLIENTE DESC";
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        rs = stmt.executeQuery();
        if(!rs.next()) {
            rs.close();
            BancoDerby.fechar();
            return 1;
        }
        else {
            retorno = rs.getInt("IDCLIENTE");
            rs.close();
            BancoDerby.fechar();
            return retorno+1;
        }
    }
    
    public boolean busca2(Cliente obj) throws SQLException, ClassNotFoundException{
        cliente = null;
        String sql = "SELECT * FROM CLIENTES WHERE CPF = ?";
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o stmt
        stmt.setString(1, obj.getCpf());
        //Executa a PESQUISA no banco
        rs = stmt.executeQuery();
        //le o proximo registro
        if(rs.next()) { //achou alguem 
            //mover os dados do resultSet para o objeto filme
            menuPrincipal.cli.setIdCliente(rs.getInt("IDCLIENTE"));
            menuPrincipal.cli.setNome(rs.getString("NOME"));
            menuPrincipal.cli.setDateNasc(rs.getDate("DATANASC"));
            menuPrincipal.cli.setAposentado(rs.getInt("APOSENTADO") == 1 ? true : false);
            menuPrincipal.cli.setSexo(rs.getString("SEXO").charAt(0));
            rs.close();
            BancoDerby.fechar();
            return true;
        }
        rs.close();
        BancoDerby.fechar();
        return false;
    }
}
