/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoviotti;

import java.sql.SQLException;

/**
 *
 * @author Wellington
 */
public class ProjetoViotti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
        try {
            System.out.println("Abrindo Conexao");
            BancoDerby.abrir();
            System.out.println("Fechando Conexao");
            BancoDerby.fechar();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    
}
