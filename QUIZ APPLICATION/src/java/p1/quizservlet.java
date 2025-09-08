/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author lenovo
 */
public class quizservlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String url="jdbc:mysql://localhost:3306/qadb";
        String user="root";
        String password="root";
        int correctAnswers=0;
        try (Connection conn=DriverManager.getConnection(url,user,password)) {
           Statement stmt=conn.createStatement();
           ResultSet rs=stmt.executeQuery("SELECT qno,answer FROM quiz");
           
           while(rs.next())
           {
               String qno=rs.getString("qno");
               String correctAnswer=rs.getString("answer");
               String userAnswer=request.getParameter(qno.toLowerCase());
               
               if(userAnswer!=null&& userAnswer.equals(correctAnswer))
               {
                   correctAnswers++;
               }
           }
           
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        response.getWriter().println("<h2> quiz result</h2>");
        response.getWriter().println("<p> you answered"+correctAnswers+"question correctly</p>");
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
