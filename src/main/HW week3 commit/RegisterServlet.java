package com;

import javax.print.DocFlavor;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

//
@WebServlet(name = "Servlet", value = "/Servlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String Email = request.getParameter("Email");
        String Gander = request.getParameter("Gander");
        String birthDate = request.getParameter("Data of birth");

        PrintWriter writer = response.getWriter();
        writer.println("<br>username:"+username);
        writer.println("<br>password:"+password);
        writer.println("<br>Email:"+Email);
        writer.println("<br>Gander:"+Gander);
        writer.println("<br>Data of birth:"+birthDate);
        writer.close();
    }
}
