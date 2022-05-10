package com.sv.utec.docmanager.dao;

import com.sv.utec.docmanager.model.Solicitante;
import com.sv.utec.docmanager.model.Solicitud;
import com.sv.utec.docmanager.pojo.Conexion;

import java.util.HashMap;
import java.util.Map;

public class SolicitanteDAO {
    private static Conexion con;


    public static void nuevo(Solicitante solicitante) throws Exception {
        con = new Conexion();
        String solicitanteQry = "INSERT INTO solicitante" +
                "(numero_identificacion,fecha_nacimiento, sexo, nombre)" +
                "VALUES(?, ?, ?, ?)";
        Map<String,String> parametros = new HashMap<>();
        parametros.put("nombre",solicitante.getNombre());
        parametros.put("fecha_nacimiento",solicitante.getFecha_nacimiento().toString());
        parametros.put("numero_identificacion",solicitante.getNumero_identificacion());
        parametros.put("sexo",solicitante.getSexo());
        con.setData(solicitanteQry,parametros);
    }
}
