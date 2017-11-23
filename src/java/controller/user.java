/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/user"})
public class user extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
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

    // User u = new User("user", "password", "login");
    //processRequest(request, response);
    //  response.setContentType("application/json");
    //   try (PrintWriter out = response.getWriter()) {
    /* TODO output your page here. You may use following sample code. */
    //out.println(u.toJsonObject());
    //   } 

    this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( request, response );
    
    
    //processRequest(request, response);
//    response.setContentType("text/html");
//    try (PrintWriter out = response.getWriter()) {
//
//      out.println("<form action='user' method='post'></br>");
//      out.println("<input type='text' name='user' value='user' /></br>");
//      out.println("<input type='text' name='pass' value='pass' /></br>");
//      // out.println("<input type='text' name='login' value='login' />");
//      out.println("<input type='submit' />");
//      out.println("</form>");
//    }

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

    String user = request.getParameter("user");
    String password = request.getParameter("pass");
    String login = request.getParameter("login");

    String userInit = "antony";
    String passInit = "azerty";
    String loginInit = "anto";
    User u = new User(user, password, login);
    String stringToOutput = "Les identifiants​ ​sont​ ​erronés";
    //processRequest(request, response);
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    if (u.authorisedUser(userInit, passInit)){
      response.addCookie(new Cookie("Authenticated", "vrai"));
      stringToOutput =  "Vous êtes connecté";
      
      
      
      this.getServletContext().getRequestDispatcher( "/" ).forward( request, response );
      
      
    }
    out.println("<h1>"+stringToOutput+"</h1>");

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
