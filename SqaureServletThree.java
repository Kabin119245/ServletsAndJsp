/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kabin.mavenproject1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author girik
 */
public class SqaureServletThree extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        //we have given data to the session , so we have to get data from session
        HttpSession session = req.getSession();

        int k = (int) session.getAttribute("k");

        PrintWriter out = res.getWriter();

        out.println("Sum  is: " + k);

        k = k * k;

        out.println("Square of sum is "+k);

    }

}
