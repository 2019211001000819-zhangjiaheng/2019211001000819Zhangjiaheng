package com.zhangjiaheng.controller;

import com.zhangjiaheng.model.Category;
import com.zhangjiaheng.model.Product;
import com.zhangjiaheng.dao.ProductDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.sql.*;
import java.util.List;



@WebServlet(value = "/admin/addProduct")
@MultipartConfig(maxFileSize = 16177215)
public class AddProductServlet extends HttpServlet {
    private Connection con =null;
    //private static final Logger log= Logger.getLogger(AddProductServlet.class);

    @Override
    public void destroy(){
        super.destroy();
    }
    @Override
    public void init() throws ServletException{
        con=(Connection) getServletContext().getAttribute("con");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Category category =new Category();
        List<Category> categoryList= null;
       try {
           categoryList =Category.findAllCategory(con);
           request.setAttribute("categoryList",categoryList);
           String path ="WEB-INF/views/admin/addProduct.jsp";
           request.getRequestDispatcher(path).forward(request,response);
       }
       catch (SQLException throwables){throwables.printStackTrace();}

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName = request.getParameter("productName");
        Double price = request.getParameter("price")!=null?Double.parseDouble(request.getParameter("price")):0.0;
        int categoryId = request.getParameter("categoryId")!=null?Integer.parseInt(request.getParameter("categoryId")):0;
        String productDescription = request.getParameter("productDescription");
        InputStream inputStream = null;
        Part filePart = request.getPart("picture");
        if(filePart!=null){
            System.out.println("file name :"+filePart.getName()+" size"+filePart.getSize()+"file type"+filePart.getContentType());
            inputStream = filePart.getInputStream();
        }
        Product product = new Product();
        product.setProductName(productName);
        product.setPrice(price);
        product.setProductDescription(productDescription);
        product.setCategoryId(categoryId);
        product.setPicture(inputStream);

        ProductDao dao = new ProductDao();
        int i = 0;
        try {
            i = dao.save(product,con);
        }catch (SQLException e){
            e.printStackTrace();
        }
        if(i>0){

        }

    }
}
