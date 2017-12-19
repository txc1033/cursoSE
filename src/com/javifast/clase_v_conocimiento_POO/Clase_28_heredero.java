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
public class Clase_28_heredero extends Clase_28_Herencia{  // para heredar  se debe utilizar la palabra reservada extends
                                              // seguido del nombre de la clase de la clase padre "Clase_28_Herencia"
    private String raza;                     // en la clase hija se pueden agregar variables o comportamientos independientes
                                            // sin afectar a la clase padre

    public Clase_28_heredero(String raza, String nombre, String comida, int edad) { // definimos contructor a peticion de la clase padre
        super(nombre, comida, edad);  // este presenta todos los atributos de la clase padre enviados a la palabra reservada super
        // si la clase padre tiene un constructor sin parametros el metodo super puede ser inicializado sin parametros
        //super(); al ocurrir esto si esta en blanco los parametros seran null
        this.raza = raza;
    }
    
    
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
     
    public void mostrar(){
        System.out.println(getNombre()+"-"+getComida()+"-"+getRaza()+"-"+getEdad());
    }
}
