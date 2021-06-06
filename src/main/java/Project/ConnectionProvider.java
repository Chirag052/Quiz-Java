/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author HP
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            System.out.println("success1");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("success2");
 
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/qems","root","Chirag@2001");
            System.out.println("success");
            return con;
        }
        catch(Exception e){
            System.out.print(e);
            return null;
        }
    }
}
