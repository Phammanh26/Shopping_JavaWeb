package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manh
 */
@WebServlet(urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

  String ERROR = "error.jsp";
    String ADDNEW_PRODUCT = "addNewProduct";
    String VIEW = "viewController";
    String VIEW_DETAIL = "viewProductDetail";
    String UPDATE_PRODUCT = "updateProduct";
    String DELETE_PRODUCT = "deleteProduct";
    



    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
         try{
             PrintWriter out = response.getWriter();
             String action = request.getParameter("action");
             if(action.equals("addNewProduct")){
                 System.out.println("running add product");
                 url = ADDNEW_PRODUCT;
             }
             
              if(action.equals("view")){
                 System.out.println("running view");
                 url = VIEW;
             }
              
            if(action.equals("viewDetail")){
                 System.out.println("running view detail");
                 url = VIEW_DETAIL;
             }
            
            //update product
            if(action.equals("updateProduct")){
                 System.out.println("running update Product");
                 url = UPDATE_PRODUCT;
             }
            
            
           
             if(action.equals("deleteProduct")){
                 System.out.println("running delete Product");
                 url = DELETE_PRODUCT;
             }
            
        }catch(Exception e){
            log("Error: " + e.toString());
        }
        finally{
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
