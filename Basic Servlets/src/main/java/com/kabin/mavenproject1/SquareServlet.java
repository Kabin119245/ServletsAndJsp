/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kabin.mavenproject1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author girik
 */
public class SquareServlet extends HttpServlet {
    
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
      PrintWriter out = res.getWriter(); 
      int k = (int)req.getAttribute("k");
      out.println("Sum  is " + k);
      k = k*k;
      
      out.println("Sqaured after sum is " + k);
  
  }
}
