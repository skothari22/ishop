/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ishop.user.register;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.ishop.dal.IshopDal;

/**
 *
 * @author shitalk
 */
public class registerServlet extends HttpServlet {

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
        try {
            String sql = "INSERT INTO `user_master` (`id`, `email_id`, `password`, `first_name`, `last_name`, `primary_contact`, `secondary_contact`, `res_address`, `pincode`, `archived`) VALUES (NULL,'"
                    + request.getParameter("email").replace("'", "''") + "','"
                    + request.getParameter("password").replace("'", "''") + "','"
                    + request.getParameter("firstname").replace("'", "''") + "','"
                    + request.getParameter("lastname").replace("'", "''") + "','"
                    + request.getParameter("pcontact").replace("'", "''") + "','"
                    + request.getParameter("scontact").replace("'", "''") + "','"
                    + request.getParameter("address").replace("'", "''") + "',"
                    + "NULL,'0')";

            IshopDal dal = new IshopDal();
            Connection con = dal.getConnection();
            int records = dal.executeSqlWriter(con, sql);
            if (records > 0) {
                response.sendRedirect("index.jsp?signup=1");
                //RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp?login=1");
                //dispatcher.forward(request, response);

            } else {
                response.sendRedirect("index.jsp?signup=-2");
                //RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp?login=0");
                //dispatcher.forward(request, response);
            }

            if (!con.isClosed()) {
                con.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            response.sendRedirect("index.jsp?signup=-2");
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
