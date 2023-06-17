/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study.in;

import java.sql.*;

/**
 *
 * @author Prathamesh
 */
public class Connectionz {
    private Connectionz() {
        // Private constructor to prevent instantiation
    }
    public static Connection getConnection() {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinerateruser", "root", "1234");
        }
        catch(Exception e){     
            System.out.println(""+e);
        }
        return con;
    }
}
