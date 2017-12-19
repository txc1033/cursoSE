/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_conocimiento_POO;

/**
 * Concepto de Herencia 
 * definicion: adquirir atributos o propiedades de una clase mayor ejemplo 
 *                             Clase Animal
 *                               ____|___
 *                              |        |
 *                            perro     gato
 * @author javie
 */
public class Clase_28_Herencia {
    
    private String nombre, comida;
    private int edad;

    public Clase_28_Herencia(String nombre, String comida, int edad) { // al definir un constructor en la clase padre obligatoriamente
        // la clase que hereda debe definir sus contructores ya que al contrario provocara un error en cascada
        this.nombre = nombre;
        this.comida = comida;
        this.edad = edad;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
