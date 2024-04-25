/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kabin.mavenproject1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 *
 * @author girik
 */
public class AddServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        
        int i = Integer.parseInt(req.getParameter("num1"));
         int j = Integer.parseInt(req.getParameter("num2"));
         
         int k = i + j;
        //when we want to send data from one servlet to another servlet
        //we use session management
        
         //res.getWriter().println("Result is " + k);
         
         req.setAttribute("k", k);
        
         //to call another servlet we have two methods
         //Req Dis and redirect
         
         RequestDispatcher rd = req.getRequestDispatcher("sq");
         rd.forward(req, res);
         
    }
}
