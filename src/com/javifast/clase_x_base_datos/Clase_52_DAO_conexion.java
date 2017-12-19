/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_x_base_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author javie
 */
public class Clase_52_DAO_conexion {

    protected Connection conexion;
    // JDBC driver nombre y base de datos URL
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //org.postergresql.Driver // aqui indicamos el tipo de base de datos utilizamos
    private final String DB_URL = "jdbc:mysql://localhost:3306/javier?&useSSL=false"; // aqui indicamos la direccion de la base datos
    // base de datos credenciales
    private final String USER = "test"; // datos de usuario
    private final String PASS = "1234"; // datos de contraseña

    public void conectar() throws Exception {
        try {
            Class.forName(JDBC_DRIVER); // inicializamos el metodo class con la variable JDBC_DRIVER
            conexion = DriverManager.getConnection(DB_URL, USER, PASS); // almacenamos el metodo getConnection en la variable conexion   
        } catch (Exception e) {
            throw e;
        }

    }

    public void cerrar() throws SQLException {
        if (conexion != null) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
    }
}
