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
}
