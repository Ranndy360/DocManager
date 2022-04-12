package com.sv.utec.docmanager.pojo;

import java.sql.*;
import java.util.Map;

public class Conexion {

    private Connection conn;
    private Statement command;
    private PreparedStatement preparedStatement;

    public Conexion() throws Exception {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection("jdbc:mysql://34.70.27.52:3306/appimc","root","9Mkiu7ndODhw1lOK");
    }

    /**
     * Consultas select
     * @param query
     * @return
     * @throws SQLException
     */
    public ResultSet getData(String query, Map<String,String> parametros) throws SQLException {
        preparedStatement = conn.prepareStatement(query);
        int contador = 1;
        for ( Object valores : parametros.values()) {
            preparedStatement.setString(contador,valores.toString() );
            contador++;
        }
        ResultSet rs = preparedStatement.executeQuery();
        return rs;
//        while (rs.next()) {
//            msg += "nID: " + rs.getInt("EmployeeID") + " Name: "
//                    + rs.getString("Firstname");
//        }
//        tv.setText(msg);
    }

    /**
     * Funcion destinada para inser y update query con parametros esperando asignacion de valores con ?
     * parametros con valor segun orden de la query con un indice descriptible del valor
     * @param query
     * @param parametros
     * @return boolean
     * @throws SQLException
     */
    public boolean setData(String query, Map<String,String> parametros) throws SQLException {
        preparedStatement = conn.prepareStatement(query);
        int contador = 1;
        for ( Object valores : parametros.values()) {
            preparedStatement.setNString(contador,valores.toString() );
            contador++;
        }
        if(preparedStatement.executeUpdate()>0)
            return true;
        else
            return false;
    }


}
