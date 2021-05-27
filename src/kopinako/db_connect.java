/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopinako;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author arlan
 */
public class db_connect {
    private static Connection koneksimysql;
    public static Connection koneksiDB() {
        if (koneksimysql==null){
            try {
                String DB="jdbc:mysql://localhost:3306/kopi_nako"; // nama database
                String user="root"; // user database
                String pass="ArlanBB270899"; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksimysql = (Connection)DriverManager.getConnection(DB,user,pass);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            }
        }
        return koneksimysql;
    }

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Statement createstatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
