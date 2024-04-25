/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kabin.mavenproject1;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author girik
 */
public class SquareServletCookies extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //as there can be multiple cookies so there is method getCookies() not getCookie so we have to store in array
        int k = 0;

        Cookie cookies[] = req.getCookies();

        for (Cookie c : cookies) {
            c.getName().equals("k");
            k = Integer.parseInt(c.getValue());
        }

        PrintWriter out = res.getWriter();

        out.println("Sum  is: " + k);

        k = k * k;

        out.println("Square of sum is " + k);

    }

}
