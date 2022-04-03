package com.sv.utec.docmanager.controller;

import com.sv.utec.docmanager.model.Usuarios;

import javax.ws.rs.core.Response;

public class LoginController {

    public Response login() {
        try {

            Usuarios usuarios =  new Usuarios();
            usuarios.setCorreo("test");

            return Response
                    .status(Response.Status.OK)
                    .entity(usuarios)
                    .build();
        }catch (Exception e){
            return Response
                    .status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(e.getMessage())
                    .build();
        }
    }

}
