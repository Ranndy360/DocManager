package com.sv.utec.docmanager.dao;

import com.sv.utec.docmanager.model.Area;
import com.sv.utec.docmanager.model.Solicitante;
import com.sv.utec.docmanager.model.Solicitud;
import com.sv.utec.docmanager.pojo.Conexion;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolicitudesDAO {
    private static Conexion con;


    public static List<Solicitud> listado() throws Exception {
        con = new Conexion();
        String sql = "SELECT solicitud.estado, solicitud.descripcion,solicitud.codigo, solicitud.fecha_ingreso, area.nombre as area,solicitante.* FROM solicitud " +
                " inner join area on solicitud.actual_area_id=area.id" +
                " inner join solicitante on solicitante.id=solicitud.solicitante_id";
        ResultSet res = con.getData(sql,new HashMap<>());
        List<Solicitud> solicitudRs = new ArrayList<>();
        while (res.next()) {
            Solicitud solicitud = new Solicitud();
            Solicitante solicitante = new Solicitante();
            Area area = new Area();
            solicitud.setEstado(getEstado(res.getString("estado")));
            solicitud.setCodigo(res.getString("codigo"));
            solicitud.setDescripcion(res.getString("descripcion"));
            solicitud.setFecha_ingreso(res.getString("fecha_ingreso"));
            solicitante.setNumero_identificacion(res.getString("numero_identificacion"));
            solicitante.setNombre(res.getString("nombre"));
            solicitante.setSexo(res.getString("sexo"));
            area.setNombre(res.getString("area"));
            solicitud.setSolicitante(solicitante);
            solicitud.setArea(area);

            solicitudRs.add(solicitud);
        }
        return solicitudRs;
    }

    public static List<Area> listadoAreas() throws Exception {
        con = new Conexion();
        String sql = "SELECT * FROM area";
        ResultSet res = con.getData(sql,new HashMap<>());
        List<Area> areaDs = new ArrayList<>();
        while (res.next()) {
            Area area = new Area();
            area.setId(Integer.parseInt(res.getString("id")));
            area.setNombre(res.getString("nombre"));
            areaDs.add(area);
        }
        return areaDs;
    }


    public static List<Solicitante> listadoSolicitantes() throws Exception {
        con = new Conexion();
        String sql = "SELECT * FROM solicitante";
        ResultSet res = con.getData(sql,new HashMap<>());
        List<Solicitante> solicitanteDs = new ArrayList<Solicitante>();
        while (res.next()) {
            Solicitante solicitante = new Solicitante();
            solicitante.setId(Integer.parseInt(res.getString("id")));
            solicitante.setNombre(res.getString("nombre"));
            solicitanteDs.add(solicitante);
        }
        return solicitanteDs;
    }

    public static void nuevo( Solicitud solicitud) throws Exception {
        con = new Conexion();

        Map<String,String> parametros = new HashMap<>();
        String sql = "INSERT INTO solicitud" +
                "(descripcion,actual_area_id, codigo, solicitante_id,fecha_ingreso, estado)" +
                "VALUES(?, ?, ?, ?,?, 'ACE');";
        parametros.put("codigo",solicitud.getCodigo());
        parametros.put("fecha_ingreso",solicitud.getFecha_ingreso());
        parametros.put("solicitante_id",solicitud.getSolicitante_id().toString());
        parametros.put("descripcion",solicitud.getDescripcion());
        parametros.put("actual_area_id",solicitud.getActual_area_id().toString());
        con.setData(sql,parametros);

    }

    public static String getEstado(String estado){
        Map<String,String> estadoMap = new HashMap<>();
        estadoMap.put("ESP","Espera");
        estadoMap.put("PRO","Proceso");
        estadoMap.put("REC","Rechazado");
        estadoMap.put("ACE","Aceptado");

        return estadoMap.get(estado);
    }


}
