/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_conocimiento_POO;

/**
 *
 * @author javie
 */
public class Clase_24_intro { //clase Clase_24_intro con dos variables tipo string "color y nombre"
    
    String nombre, color;
    
    public Clase_24_intro(String nombre, String color){ //metodo contructor pasandole los valores de la clase cursoSE.
        this.nombre = nombre;
        this.color = color;
    }

    
    public void llamar(){ // metodo llamar el cual toma los valores de "color y nombre" imprimiendolos en pantalla
    System.out.println(nombre + "-"+ color+ " llamando....");
    }
      public void llamarespecial(Clase_24_intro c24){ // metodo llamar el cual toma los valores del contructor c creado en la clase Clase_24_intro
          //imprimiendolo en pantalla
    System.out.println(c24.nombre + "-"+ c24.color+ " Esta llamando....");
    }
}
