/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetoviotti.BancoDerby;
/**
 *
 * @author Wellington
 */
public class UsuarioDAO {
    //Variaveis auxiliares
    private Usuario usuario; //model para dados
    //recebera comandos DML
    private java.sql.PreparedStatement stmt; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    
    public boolean fazLogin(String user, String password) throws SQLException, ClassNotFoundException {
        //cria a Query
        String sql = "SELECT IDUSUARIO, USUARIO, SENHA, TIPOUSER FROM USUARIOS WHERE USUARIO = ? AND SENHA = ?";
        //Abre a conexão e joga e cria a Query Parametrizada
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //seta os parametros
        stmt.setString(1, user);
        stmt.setString(2, password);
        //executa
        rs = stmt.executeQuery();
        //testa condições
        if (!rs.next()){
            JOptionPane.showMessageDialog(null, "Credenciais incorretas, tente novamente!", "SENHA INCORRETA", JOptionPane.ERROR_MESSAGE);
            rs.close();
            BancoDerby.fechar();
            return false;
        }
        //joga os valores do usuário pra Model
        else {
            usuario = new Usuario();
            usuario.setUsuario(rs.getString("USUARIO"));
            usuario.setSenha(rs.getString("SENHA"));
            usuario.setTipoUser(rs.getBoolean("TIPOUSER"));
            Usuario.IDUSER = rs.getInt("IDUSUARIO");
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            rs.close();
            BancoDerby.fechar();
            return true;
        }
    }
    
    public boolean inserir(Usuario obj) throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "INSERT INTO USUARIOS (IDUSUARIO, USUARIO, SENHA, TIPOUSER) values (?, ?, ?, ?)";
        //Cria o pst com base na conexao e no comando DML
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        stmt.setInt(1, obj.IDUSER);
        stmt.setString(2, obj.getUsuario());
        stmt.setString(3, obj.getSenha());
        stmt.setBoolean(4, obj.isTipoUser());
        
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
        //função para ir preenchendo o ID Cliente no banco de dados
        int retorno;
        String sql = "SELECT IDUSUARIO FROM USUARIOS ORDER BY IDUSUARIO DESC";
        BancoDerby.abrir();
        stmt = BancoDerby.getConexao().prepareStatement(sql);
        rs = stmt.executeQuery();
        if(!rs.next()) {
            rs.close();
            BancoDerby.fechar();
            return 1;
        }
        else {
            retorno = rs.getInt("IDUSUARIO");
            rs.close();
            BancoDerby.fechar();
            return retorno+1;
        }
    }
}
