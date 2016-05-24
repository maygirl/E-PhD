package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Professor;
import model.Student;

/**
 *
 * @author Andrei
 */
@WebServlet(name = "loginController", urlPatterns = {"/login"})
public class loginController extends HttpServlet {
    
    UserDAO userDAO = UserDAO.getInstance();

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
        request.getRequestDispatcher("View/login.jsp").forward(request, response);

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
        if (request.getParameter("type").equals("student")){
            Student user = new Student(request.getParameter("username"), request.getParameter("password"));
            if(!userDAO.userExists(user.getUsername())){
                request.setAttribute("error", "User doesn;t exist!");
                request.getRequestDispatcher("View/login.jsp").forward(request, response);
            } else {
                if (userDAO.passwordMatch(user)){
                    user.setId(userDAO.getIdFromDb(user));
                    request.getSession().setAttribute("user", user.getId());
                    request.getSession().setAttribute("type", "student");
                    response.sendRedirect("publication");
                } else {
                    request.setAttribute("error", "User and pass so not match!");
                    request.getRequestDispatcher("View/login.jsp").forward(request, response);
                }
            }
        } else {
            Professor user = new Professor(request.getParameter("username"), request.getParameter("password"));
            if(!userDAO.userExists(user.getUsername())){
                request.setAttribute("error", "User doesn;t exist!");
                request.getRequestDispatcher("View/login.jsp").forward(request, response);
            } else {
                if (userDAO.passwordMatch(user)){
                    user.setId(userDAO.getIdFromDb(user));
                    request.getSession().setAttribute("user", user.getId());
                    request.getSession().setAttribute("type", "professor");
                    response.sendRedirect("publication");
                } else {
                    request.setAttribute("error", "User and pass so not match!");
                    request.getRequestDispatcher("View/login.jsp").forward(request, response);
                }
            }
        }
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
