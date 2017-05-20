package com.northshore.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 150101002 on 3/26/2017.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       PrintWriter out = response.getWriter();



     String username = request.getParameter("username");
     String password = request.getParameter("password");

       String sysUsername = "Northshore";
       String sysPass = "1111";
        if(username.equalsIgnoreCase(sysUsername) && password.equals(sysPass)){
            out.println("<html>");
            out.println("<title> Northshore </title>");
            out.println("<h1> Welcome </h1>");
            out.println("Login successful");
            out.println("</html>");

            System.out.println(username +" "+ password);
        }
        else out.print("Login failed!");



    }
}
