/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_1_2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author wesle
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://185.182.56.63/crmproj_test", "crmproj_cass", "0nd3rz33b00t!");
        } catch (Exception ex) {
         System.out.println(ex.getMessage());
        }return con;
        
    }
}
