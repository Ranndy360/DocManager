package com.sv.utec.docmanager.controller;

import com.sv.utec.docmanager.Toolkit;
import com.sv.utec.docmanager.dao.SolicitanteDAO;
import com.sv.utec.docmanager.model.Solicitante;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SolicitanteServlet", value = "/solicitante")
public class SolicitanteServlet extends HttpServlet {
    SolicitanteDAO solicitanteDAO;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            switch (action) {
                case "nuevo":
                    nuevo(request, response);
                    break;
                case "crear":
                    crear(request, response);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        RequestDispatcher dispatcher= request.getRequestDispatcher("nuevoSolicitante.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void crear (HttpServletRequest request, HttpServletResponse response) throws Exception {
        Solicitante solicitante = new Solicitante();
        solicitante.setNombre(request.getParameter("nombre"));
        solicitante.setFecha_nacimiento(Toolkit.formatoFecha(request.getParameter("fechaNacimiento"),"yyyy-MM-dd"));
        solicitante.setNumero_identificacion(request.getParameter("identificacion"));
        solicitante.setSexo(request.getParameter("genero"));
        solicitanteDAO.nuevo(solicitante);
        RequestDispatcher dispatcher;
        request.setAttribute("solicitante",solicitante);
        dispatcher= request.getRequestDispatcher("dashboard.jsp");
        dispatcher.forward(request, response);
    }

    private void nuevo (HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestDispatcher dispatcher;
        dispatcher= request.getRequestDispatcher("nuevoSolicitante.jsp");
        dispatcher.forward(request, response);
    }


}
