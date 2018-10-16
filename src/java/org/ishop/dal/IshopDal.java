/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ishop.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author shitalk
 */
public class IshopDal {
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ishop", "root", "");
            return con;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet executeSqlReader(Connection con, String sql) {
        try {
    
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public int executeSqlWriter(Connection conn, String sql) {
        try {
            try {
              
                Statement stmt = conn.createStatement();
                int resultCount= stmt.executeUpdate(sql);
                conn.close();
                return resultCount;
            } catch (Exception e) {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }
}
