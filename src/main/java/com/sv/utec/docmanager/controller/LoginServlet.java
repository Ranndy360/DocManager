package com.sv.utec.docmanager.controller;

import com.sv.utec.docmanager.dao.UsuarioDAO;
import com.sv.utec.docmanager.model.Usuarios;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Base64;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    UsuarioDAO usuarioDAO;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            switch (action) {
                case "index":
                    index(request, response);
                    break;
                case "login":
                    login(request, response);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println(e);
        }
        RequestDispatcher dispatcher= request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void index (HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        //mostrar(request, response);
        RequestDispatcher dispatcher= request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    private void login (HttpServletRequest request, HttpServletResponse response) throws Exception {
        Usuarios usuarios = new Usuarios();
        usuarios.setCorreo(request.getParameter("correo"));
        usuarios.setContra( Base64.getEncoder().encodeToString(request.getParameter("clave").getBytes()));
        boolean loginResp = usuarioDAO.login(usuarios);
        RequestDispatcher dispatcher;
        if(loginResp)
            dispatcher= request.getRequestDispatcher("dashboard.jsp");
        else{
            request.setAttribute("msg",true);
            dispatcher= request.getRequestDispatcher("index.jsp");
        }
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
}
