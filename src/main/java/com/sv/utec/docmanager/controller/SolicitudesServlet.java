package com.sv.utec.docmanager.controller;

import com.sv.utec.docmanager.Toolkit;
import com.sv.utec.docmanager.dao.SolicitudesDAO;
import com.sv.utec.docmanager.model.Area;
import com.sv.utec.docmanager.model.Solicitante;
import com.sv.utec.docmanager.model.Solicitud;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "SolicitudesServlet", value = "/solicitudes")
public class SolicitudesServlet extends HttpServlet {
    SolicitudesDAO solicitudesDAO;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            switch (action) {
                case "listado":
                    listado(request, response);
                    break;
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
        RequestDispatcher dispatcher= request.getRequestDispatcher("dashboard.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void listado (HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Solicitud> solicitudRs = solicitudesDAO.listado();
        RequestDispatcher dispatcher;
        request.setAttribute("listado",solicitudRs);
        dispatcher= request.getRequestDispatcher("listadoSolicitudes.jsp");
        dispatcher.forward(request, response);
    }

    private void crear (HttpServletRequest request, HttpServletResponse response) throws Exception {
        Solicitud solicitud = new Solicitud();
        solicitud.setFecha_ingreso(Toolkit.fechaHoy(new Date()));
        solicitud.setDescripcion(request.getParameter("descripcion"));
        solicitud.setCodigo(Toolkit.codigo());
        solicitud.setSolicitante_id(Integer.parseInt(request.getParameter("solicitante")));
        solicitud.setActual_area_id(Integer.parseInt(request.getParameter("area")));
        solicitudesDAO.nuevo(solicitud);
        RequestDispatcher dispatcher;
        dispatcher= request.getRequestDispatcher("dashboard.jsp");
        dispatcher.forward(request, response);
    }

    private void nuevo (HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Area> areaDs = solicitudesDAO.listadoAreas();
        List<Solicitante> solicitanteDs = solicitudesDAO.listadoSolicitantes();
        RequestDispatcher dispatcher;
        request.setAttribute("areaDs",areaDs);
        request.setAttribute("solicitanteDs",solicitanteDs);
        dispatcher= request.getRequestDispatcher("nuevaSolicitudes.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SolicitudesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


}
