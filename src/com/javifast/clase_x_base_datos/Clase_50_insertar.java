/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_x_base_datos;

import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Clase_50_insertar extends Clase_49_conexion {

    Scanner sc = new Scanner(System.in); // inicializamos una clase scanner en el objeto sc para el ingreso de parametros
    String nombre, codigo;

    public void insertar_persona() throws Exception {

        System.out.println("Que nombre insertara en la tabla persona?"); // imprimimos mensaje
        nombre = sc.next(); // ingresamos el parametro para nombre
        System.out.println("y cual sera su codigo?"); // imprimimos  mensaje
        codigo = sc.next(); // ingresamos el parametro para codigo 
        if (nombre != null) { // creamos una sentencia if que dice si nombre es distinto a null entonces
            Clase_50_insertar db50 = new Clase_50_insertar();
            db50.insertar_db(nombre, codigo);
        } // ejecutamos el metodo insertar_datos con los parametros nombre y codigo capturados
    }

    public void insertar_db(String nombre, String codigo) throws Exception {
        try {
            this.conexion_defecto();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO persona (nombre, persona_pkey) VALUES (?,?);");
            // creamos un objeto de tipo PreparedStatement llamado st con la instruccion en sql en este caso insetar un dato
            // creamos un objeto de tipo PreparedStatement llamado st con la instruccion en sql en este caso insetar un dato
            st.setString(1, nombre); // para ingresar valores en nuestra consulta sql colocamos en donde iria el valor un signo de interrogacion ?
            // luego utilizamos el metodo set+el tipo de variable este caso seria setString(la posicion del valor, el dato del valor);
            st.setString(2, codigo);// para ingresar valores en nuestra consulta sql colocamos en donde iria el valor un signo de interrogacion ?
            // luego utilizamos el metodo set+el tipo de variable este caso seria setInt(la posicion del valor, el dato del valor);
            st.executeUpdate(); // ejecutamos el objeto st con el metodo execute
            st.close(); // luego finalizamos la conexion con el metodo close
        } // para ingresar valores en nuestra consulta sql colocamos en donde iria el valor un signo de interrogacion ?
        catch (Exception e) { // creamos un catch exception llamado e
            throw e;  // al generarse un error imprimimos el mensaje del error con el metodo getmessage
        } finally {
            this.conexion.close();
        }
    }
}
