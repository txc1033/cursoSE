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
public class Clase_31_metodo_instanciaclase {
    
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void MostrarInstancia(){ // metodo accedido al crear un objeto ej: c31.MostrarInstancia();
        System.out.println(this.nombre+"-"+this.edad);
    }
    public static void MostrarClase(){ // metodo accedido desde la clase ej: Clase_31_metodo_instanciaclase.MostrarClase();
        System.out.println("+ Metodo Statico +");
    }
}
