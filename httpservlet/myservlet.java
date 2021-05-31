/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author mitali dubey
 */
public class myservlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        System.out.println("this is get method");
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.print("<h1>this is get method of my servlet</h1>");
    }
    
    
}
