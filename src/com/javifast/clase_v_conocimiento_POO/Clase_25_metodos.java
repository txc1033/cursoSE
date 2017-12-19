/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_conocimiento_POO;


/**
 * Constructores
 * @author javie
 */
public class Clase_25_metodos {
    
    String nombre, ape;
     
    public Clase_25_metodos (String nombre, String color){ //metodo contructor con dos parametros.
        this.nombre = nombre;
        this.ape = color;
    }
    public Clase_25_metodos (String nombre){ //metodo contructor con un parametro.
        this.nombre = nombre;
    }
    public Clase_25_metodos (){ //metodo contructor por defecto.
        System.out.print("Soy un constructor");
    }
    
    public void saludo(){
        System.out.println("Hola "+nombre+ " de "+ape);
    }

}
