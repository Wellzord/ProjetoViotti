/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoviotti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Wellington
 */
public class BancoDerby {
    public static java.sql.Connection con = null;
    //essa rotina é executada quando a classe
    //é carregada na memoria
    public static void abrir() throws ClassNotFoundException, SQLException {
        //carrega o driver
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            System.out.println("Falhou na hora de pegar o driver");
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmacia", "root", "");
    }
    
    public static void fechar() throws SQLException {
        con.close();
    }
    
    public static Connection getConexao() {
        return con;
    }
}
