package com.alien.dao;
import java.sql.*;

import com.kabin.learning.model.Alien;

public class AlienDAO {

    public Alien getAlien(int id) {
    //just for Dummy data
        Alien a = new Alien();
//        a.setId(1);
//        a.setUname("kabin");
//        a.setUpwd("kabin");
//        a.setUemail("girikabin505@gmail.com");
//        a.setUmobile("9850");



        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Users", "postgres", "2078");
            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery("select * from users where id = " + id);

            while(rs.next()) {
                a.setId(rs.getInt(1));
                a.setUname(rs.getString(2));
                a.setUpwd(rs.getString(3));
                a.setUemail(rs.getString(4));
                a.setUmobile(rs.getString(5));
            }


        }
        catch (Exception e)
        {
            System.out.println("Error  " + e.getMessage());
        }




        return  a;
    }

}
