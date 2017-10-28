/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.DAO1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.cuentas;
import model.valores;

/**
 *
 * @author User
 */
public class Reporte extends HttpServlet {
int idEmpleado;
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Reporte</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Reporte at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        
        try {
            DAO1 dab = new DAO1();
            cuentas cu=new cuentas();
            int sueldo=dab.getSueldoById(idEmpleado);
            int dias=dab.getDiasById(idEmpleado);
           
 ArrayList<valores> lista=new ArrayList<valores>();
 valores obj=new valores(sueldo, cu.salarioMinimo(sueldo), cu.Transporte(cu.salarioMinimo(sueldo)), cu.Prima(sueldo, dias), cu.cesantias(sueldo, dias), cu.InterecesCesantias(cu.cesantias(sueldo, dias)), cu.vacaciones(sueldo, dias));
           lista.add(obj);
            
            ArrayList<valores> listas = (ArrayList<valores>) lista;
            request.setAttribute("listaEsquemas", listas);
            
           request.getRequestDispatcher("reporte.jsp").forward(request, response);
            
            
            
            
            
        } catch (SQLException ex) {
        Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
    }
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
        try {
            DAO1 dab=new DAO1();
            
            idEmpleado = Integer.parseInt(request.getParameter("numEmp"));
            
            
         response.sendRedirect("Reporte");
        } catch (SQLException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
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
