package com.zhangjiaheng.controller;

import com.zhangjiaheng.dao.ProductDao;
import com.zhangjiaheng.model.Category;
import com.zhangjiaheng.model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductDetailsServlet", value = "/ProductDetails")
public class ProductDetailsServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
        con = (Connection) getServletContext().getAttribute("con");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=request.getParameter("id")!=null?Integer.parseInt(request.getParameter("id")):0;
        ProductDao dao=new ProductDao();
        if(id==0) return;
        List<Category> categoryList= null;
        try {
            categoryList = Category.findAllCategory(con);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.setAttribute("categoryList",categoryList);

        Product product=dao.findById(id,con);
        request.setAttribute("p",product);
        String path="/WEB-INF/views/productDetails.jsp";
        request.getRequestDispatcher(path).forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
