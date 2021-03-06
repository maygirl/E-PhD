/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PublicationDAO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Publication;

/**
 *
 * @author Mac
 */
@WebServlet(name = "uploadPublicationController", urlPatterns = {"/publication"})
@MultipartConfig
public class uploadPublicationController extends HttpServlet {

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
        //do nothing
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
        request.getRequestDispatcher("View/uploadPublication.jsp").forward(request, response);
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
        
        final String path = "/publications/";
        final Part filePart = request.getPart("file");
        final String fileName = getFileName(filePart);
        String filePath = path + File.separator
                    + fileName;
        
        //how is this supporsed to work?
//        OutputStream out = null;
//        InputStream filecontent = null;
//            out = new FileOutputStream(new File(filePath));
//            filecontent = filePart.getInputStream();
//
//            int read = 0;
//            final byte[] bytes = new byte[1024];
//
//            while ((read = filecontent.read(bytes)) != -1) {
//                out.write(bytes, 0, read);
//            }
//            if (out != null) {
//                out.close();
//            }
//            if (filecontent != null) {
//                filecontent.close();
//            }
        
        Publication p = null;
        p = new Publication (request.getParameter("title"),request.getParameter("domain"), (int) request.getSession().getAttribute("user"),filePath);
//        p.saveToDb();
        PublicationDAO.getInstance().saveToDb(p);
        response.sendRedirect("student-report");
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

    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
}
}
