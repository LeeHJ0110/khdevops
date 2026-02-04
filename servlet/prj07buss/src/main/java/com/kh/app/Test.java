package com.kh.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Test extends HttpServlet {
   
   @Override
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      int age = Integer.parseInt(req.getParameter("age")); 
      
      int x = 0;
      if(age < 20) {
         x = 500;
      }else if(age < 65) {
         x = 1000;
      }else {
         x = 300;
      }
      
      req.setAttribute("age", age);
      req.setAttribute("x", x);
      req.getRequestDispatcher("/test.jsp").forward(req, resp);
      
   }

}











