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
@WebServlet("/add")
public class AddServlet extends HttpServlet {
    
     @Override
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        
        int k = i + j;
        
        PrintWriter out = res.getWriter();
        out.println("Sum is: " +k );
        
         
        Cookie cookie = new Cookie("k" , k +""); //(string name, string value)
        //then we add cookie to the response object
        res.addCookie(cookie);
        

        res.sendRedirect("sq");
        
    }
    
}
