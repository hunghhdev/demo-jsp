/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author thinkpad
 */
public class connect {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_demo?useUnicode=true&characterEncoding=utf-8","root","");
        } catch (Exception ex){
            ex.printStackTrace();
        } 
        return conn;
    }

    public static void main(String[] args){
        System.out.print(getConnection());
    }
}
