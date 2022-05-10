package com.sv.utec.docmanager.dao;

import com.sv.utec.docmanager.model.Usuarios;
import com.sv.utec.docmanager.pojo.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class UsuarioDAO {
    private static Conexion con;


    public static boolean login(Usuarios usuarios) throws Exception {
        con = new Conexion();
        String sql = "SELECT * FROM usuarios WHERE correo= ? ";
        //preparamos los datos para insertarlo
        Map<String,String> usuarioMap = new HashMap<>();
        usuarioMap.put("correo",usuarios.getCorreo());
        ResultSet res = con.getData(sql,usuarioMap);

        if (res.next()) {
           if(usuarios.getContra().equals(res.getString("contra")) && res.getString("estado").equals("ACT"))
               return true;
           else
               return false;
        }else
            return false;

    }

}
