/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manoel Henrique
 */
public class ConectaBanco {

    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5433/Advocacia";
    private String usuario = "postgres";  //postgress em outros PC's
    private String senha = "post";
    public Connection con;
    
    
    public void conecta(){
    
        try {
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(caminho, usuario, senha);
            
            
        } catch (SQLException ex) {
            
        }
    }
    
    
    public void desconecta(){
        try {
            con.close();
        } catch (SQLException ex) {
            
        }
    }
    
    
    public void executaSQL(String sql){
    
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            
        }
    
    }
}
