/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_basicas;

/**
 * las clases son los archivos que contienene metodos y variables para uso exclusivo de si mismo amenos que se le declaren de ambito publico
 * los metodos son instrucciones aisladas del resto de la clase pero utilizado por estas que se ejecutan al llamar la clase mas el nombre del metodo
 * se pueden crear tantos metodos como sean necesarios para el programador
 * @author javie
 */
public class Clase_21_y_22_clasesyMetodos {
    private String nombre; //inicializacion de variable tipo string
    private int edad; //inicializacion de variable tipo int
    public void saludar(){ // metodo saludar
        nombre = "Javier"; //asignando valor a variable string
        edad=24; //asignando valor a variable int
        System.out.println("Hola "+ nombre +"\n"+ "Usted tiene "+edad+" años"); // imprimiendo mensaje
    }
    public Clase_21_y_22_clasesyMetodos(){ // metodo por defecto de la clase
        System.out.println("Clase por defecto"); // imprimiendo mensaje
    }
}
