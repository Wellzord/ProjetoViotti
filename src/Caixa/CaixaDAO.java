/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caixa;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetoviotti.BancoDerby;
/**
 *
 * @author Wellington
 */
public class CaixaDAO {
    
    //Variaveis auxiliares
    private Caixa cx; //model para dados
    //recebera comandos DML
    private java.sql.PreparedStatement stmt; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    
    public boolean abreCaixa(Caixa obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "INSERT INTO CAIXAS (IDCAIXA, VALORINICIAL, DATAABERTURA, VALORFINAL, STATUS) values (?, ?, CURRENT_TIMESTAMP, ?, ?)";
        //Cria o pst com base na conexao e no comando DML
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        stmt.setInt(1, obj.getIdCaixa());
        stmt.setDouble(2, obj.getValorInicial());
        stmt.setDouble(3, obj.getValorFinal());
        stmt.setBoolean(4, obj.isStatus());
        
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
    
    public boolean fechaCaixa(Caixa obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "UPDATE CAIXAS SET DATAFECHAMENTO=CURRENT_TIMESTAMP, VALORFINAL=?, STATUS=? WHERE STATUS=true";
        //Cria o pst com base na conexao e no comando DML
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        stmt.setDouble(1, obj.getValorFinal());
        stmt.setBoolean(2, obj.isStatus());
        
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
    
    public int carregaCodigo() throws SQLException, ClassNotFoundException {
        //função para ir preenchendo o IDCAIXA no banco de dados
        int retorno;
        String sql = "SELECT IDCAIXA FROM CAIXAS ORDER BY IDCAIXA DESC";
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        rs = stmt.executeQuery();
        if(!rs.next()) {
            rs.close();
            BancoDerby.fechar();
            return 1;
        }
        else {
            retorno = rs.getInt("IDCAIXA");
            rs.close();
            BancoDerby.fechar();
            return retorno+1;
        }
    }
    
    public boolean verificaStatus() throws ClassNotFoundException, SQLException{
        boolean aux;
        String sql = "SELECT STATUS FROM CAIXAS ORDER BY IDCAIXA DESC";
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        rs = stmt.executeQuery();
        rs.next();
        aux = rs.getBoolean("STATUS");
        if (aux)
            return true;
        else
            return false;
    }

    public boolean checkGerente(String user, String pass) throws ClassNotFoundException, SQLException{
        //cria a Query
        String sql = "SELECT IDUSUARIO, USUARIO, SENHA, TIPOUSER FROM USUARIOS WHERE (USUARIO = ? AND SENHA = ?) AND TIPOUSER = true";
        //Abre a conexão e joga e cria a Query Parametrizada
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //seta os parametros
        stmt.setString(1, user);
        stmt.setString(2, pass);
        //executa
        rs = stmt.executeQuery();
        //testa condições
        if (!rs.next()){
            JOptionPane.showMessageDialog(null, "Credenciais de Gerente não encontradas", "ERRO", JOptionPane.ERROR_MESSAGE);
            rs.close();
            BancoDerby.fechar();
            return false;
        }
        else return true;
    }
}