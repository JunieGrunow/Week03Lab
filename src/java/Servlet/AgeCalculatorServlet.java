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
public class AgeCalculatorServlet extends HttpServlet {


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
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
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
        String message ="";
        String age = request.getParameter("age");
        request.setAttribute("age",age);
       if(age==null||age==""){
           message="You must provide your age as a number!";
           request.setAttribute("message", message);
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
         return;
        }
       //again, very lazy but it works
       try{
            parseInt(age);
        }catch(NumberFormatException e){
            message="You must provide your age as a number!";
            request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        message="your age next year will be "+(parseInt(age)+1);
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
       
    }

   
    
