package com.mycompany.pcc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mianr
 */
public class Control extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Control</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Control at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);

        PersonaDTO Pdto;
        PersonaDAO Pdao = new PersonaDAO();
        String accion = request.getParameter("accion");

        if (accion.equals("login")) {

            String correo = request.getParameter("log_correo");
            String clave = (String) request.getParameter("log_clave");

            Pdto = Pdao.consultar(correo, clave);

            if (Pdto.getClave().equals(clave)) {
                request.setAttribute("usuario", request.getParameter("log_correo"));
                request.setAttribute("telefono", Pdto.getTelefono());
                request.setAttribute("correo", Pdto.getCorreo());
                request.setAttribute("clave", Pdto.getClave());
                request.getRequestDispatcher("principal.jsp").forward(request, response);
            } else {
                request.setAttribute("REGISTRO", "Wrong email or password");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
        if (accion.equals("Register")) {
            //Registro exitoso
            String nombres = request.getParameter("sign_nombre");
            String correo = request.getParameter("sign_email");
            String telefono = request.getParameter("sign_correo");
            String clave = request.getParameter("sign_clave");
            Pdto = new PersonaDTO(nombres, telefono, correo, clave);
            if (Pdao.insertar(Pdto)) {
                request.setAttribute("EXITO", "Account registered successfully");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
