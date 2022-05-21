package com.sv.utec.docmanager.pojo;

import java.sql.*;
import java.util.Map;

public class Conexion {

    private Connection conn;
    private Statement command;
    private PreparedStatement preparedStatement;

    public Conexion() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//        String dbUrl = System.getenv("JDBC_DATABASE_URL");
//        String username = System.getenv("JDBC_DATABASE_USERNAME");
//        String password = System.getenv("JDBC_DATABASE_PASSWORD");
//        conn = DriverManager.getConnection(dbUrl,username,password);

        conn = DriverManager.getConnection("jdbc:mysql://35.223.115.32:3306/docmanageruser","root","3wi3HBw0DKw8AlPO");
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

    public void close() throws SQLException {
        conn.close();
    }


}
