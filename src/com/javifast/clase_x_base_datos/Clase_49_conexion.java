/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_x_base_datos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * JDBC Java Data Base Connection
 *
 * @author javie
 */
public class Clase_49_conexion {

    Connection conexion; // inicializamos la variable conection llamada conexion
    // JDBC driver nombre y base de datos URL
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //org.postergresql.Driver // aqui indicamos el tipo de base de datos utilizamos
    final String DB_URL = "jdbc:mysql://localhost:3306/javier?&useSSL=false"; // aqui indicamos la direccion de la base datos
    // base de datos credenciales
    final String USER = "test"; // datos de usuario
    final String PASS = "1234"; // datos de contraseña

    public void conexion_defecto() throws Exception {
        try { // generamos un try-catch para controlar los errores
            Class.forName(JDBC_DRIVER); // inicializamos el metodo class con la variable JDBC_DRIVER
            conexion = DriverManager.getConnection(DB_URL, USER, PASS); // almacenamos el metodo getConnection en la variable conexion
        } catch (Exception e) { // creamos un catch exception llamado e
            throw e; // al generarse un error imprimimos el mensaje del error con el metodo getmessage
        }
    }
}
