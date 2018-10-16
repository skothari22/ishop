/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ishop.user.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.ishop.dal.IshopDal;

/**
 *
 * @author shitalk
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            String sql = "select * from user_master where email_id='"
                    + request.getParameter("username").replace("'", "''") + "' and password='"
                    + request.getParameter("password").replace("'", "''") + "'";
            IshopDal dal = new IshopDal();
            Connection con = dal.getConnection();
            ResultSet rs = dal.executeSqlReader(con, sql);
            if (rs != null) {
                if (rs.next()) {
                    HttpSession session = request.getSession();
                    session.setAttribute("user", rs.getString("email_id"));

                    response.sendRedirect("index.jsp?login=1");
                    //RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp?login=1");
                    //dispatcher.forward(request, response);

                } else {
                    response.sendRedirect("index.jsp?login=0");
                    //RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp?login=0");
                    //dispatcher.forward(request, response);
                }

            }
            if (!con.isClosed()) {
                con.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
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
