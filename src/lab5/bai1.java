/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author ldbl
 */
public class bai1 {
    public static void main(String[] args) {
        try{
            String user="sa";
            String pass="";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=students;integratedSecurity=true;";
            Connection con = DriverManager.getConnection(url,user,pass);
            String query = "select * from studens";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                System.out.print(rs.getString("MaSV")+", ");
                System.out.print(rs.getString("Hoten")+", ");
                System.out.print(rs.getString("Email")+", ");
                System.out.print(rs.getString("SoDT")+", ");
                System.out.println(rs.getString("Gioitinh")+", ");
                System.out.println(rs.getString("diachi"));
            }
            con.close();
        } catch (Exception e){
            System.out.println(e);
                    
        }
    }
}
