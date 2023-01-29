/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nuket
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


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
        String result = "---";
        request.setAttribute("result", result);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String result = "---";
        String operation = request.getParameter("arth");
        if(first==null||first.equals("")||second==null||second.equals("")){
            result="Invalid";
            request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        if(operation.equals("+")){
            //java was angry that an int can't be converted to a string so this is my work around
            result=(parseInt(first))+(parseInt(second))+" ";
        }
        if(operation.equals("-")){
            //java was angry that an int can't be converted to a string so this is my work around
            result=(parseInt(first))-(parseInt(second))+" ";
        }
        if(operation.equals("*")){
            //java was angry that an int can't be converted to a string so this is my work around
            result=(parseInt(first))*(parseInt(second))+" ";
        }
        if(operation.equals("%")){
            //java was angry that an int can't be converted to a string so this is my work around
            result=(parseInt(first))%(parseInt(second))+" ";
        }
        
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
