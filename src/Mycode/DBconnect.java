/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mycode;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author darshana
 */
public class DBconnect {
    
    public static Connection Connect()
    {
       Connection Conn = null;
       
        try {
            
           Class.forName("com.mysql.jdbc.Driver");
           Conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","");
        } 
        
        catch (Exception e) {
            
            System.out.println(e);  
        }
        
        return Conn;
    }
    
}

    

