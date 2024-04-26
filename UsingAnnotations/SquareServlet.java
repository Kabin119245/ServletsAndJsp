/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kabin;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Kabin Giri
 */
@WebServlet("/sq")
public class SquareServlet extends HttpServlet  {
    
     @Override
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException  {
     
         PrintWriter out = res.getWriter();
         
         out.println("From Square Servlet");
         
          int k = 0;

        Cookie cookies[] = req.getCookies();

        for (Cookie c : cookies) {
          c.getName().equals("k");
            k = Integer.parseInt(c.getValue());
        }
        
         k = k * k;

        out.println("Square of sum is " + k);
        out.print("Hello Again is it working, just checking");
         
     
     }
    
}
