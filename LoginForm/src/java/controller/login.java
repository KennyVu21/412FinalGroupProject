/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ligth
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String _username = request.getParameter("username");
            String _password = request.getParameter("password");
            String _username1 = request.getParameter("username");
            String _password1 = request.getParameter("password");
            if((_username!= null & _password!= null) || (_username1!= null & _password1!= null)){
               if((_username.equals("Krysta") && _password.equals("12345")) || (_username.equals("Kenny") && _password.equals("12345")))
                response.sendRedirect("welcome.jsp");
               else if((!_username.equals("Krysta") && !_password.equals("12345")) || (!_username.equals("Kenny") && !_password.equals("12345")))
                  response.sendRedirect("form.jsp");
               else{
                out.println("Reenter your info");
                response.sendRedirect("form.jsp");
                
               }
            
        }else{
              out.println("Empty Username or Password");
            }
            
            
        }
    }

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    

}



































