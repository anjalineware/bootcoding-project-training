package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME = "customer";
    public void createTable(){
        try {
         //1. load jdbc driver
         Class.forName("org.postgresql.Driver");

         //2. establish connection with your local host
            Connection con;
            con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres" , "postgres" , "anjali@247");
            //3. create statement object
            Statement stmt = con.createStatement();

            //4. execute query (statement)
            String sql = "select * from" + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);

            //5. traverse resultset (data)
            while(rs.next()){
                System.out.println(" name = " + rs.getString("name"));
                System.out.println(" address  = " + rs.getString("address"));
                System.out.println(" phone number = " + rs.getString("phone_number"));
                System.out.println(" city = " + rs.getString("city"));


            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
