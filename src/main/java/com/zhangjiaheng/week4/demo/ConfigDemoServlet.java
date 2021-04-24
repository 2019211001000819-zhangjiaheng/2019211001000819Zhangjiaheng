package com.zhangjiaheng.week4.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConfigDemoServlet", value = "/Config" ,initParams = {
        @WebInitParam(name = "name", value = "zhangjiaheng"),
        @WebInitParam(name = "studentid", value = "2019211001000819")
})
public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         PrintWriter writer =response.getWriter();
         writer.println("name"+getServletConfig().getInitParameter("name"));
         writer.println("studentid"+getServletConfig().getInitParameter("studentid"));

    }
    }




