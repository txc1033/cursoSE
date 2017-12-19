/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_conocimiento_POO;

/**
 * Modificadores de acceso
 * @author javie
 */
public class Clase_26_accesos {
    public String nombre; // accedidos por todos
    private String ape; // accedido por la clase
    protected int edad; // accedido por la clase mayor y menor (Aplica Herencia)
    String pack; // solo accedido por el paquete en este caso el paquete "clase_POO" para usarse debe ser exportada por defecto
    public Clase_26_accesos(String nombre,int edad,String pack){ // no es necesario que los atributos tengan el mismo nombre que las variables
        this.nombre = nombre;
        this.edad = edad;
        this.pack = pack;
    }
    public Clase_26_accesos(){
        
    }
    public void datos(){
        ape = "Maldonado"; // Variable con acceso protegido solo puede usarse dentro de los metods de la clase donde se intancia 
        // en este caso la clase Clase_26_accesos
        System.out.println("Hola "+nombre+ " de "+ape+ " edad: "+edad+" del grupo: "+pack );
    }
}
