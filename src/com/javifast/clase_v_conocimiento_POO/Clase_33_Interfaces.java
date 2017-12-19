/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_conocimiento_POO;

/**
 * perro XD
 * para utilizar una interface se debe usar la palabra reservada implements
 * otra ventaja que nos permite implementar interface de multiple fuentes 
 * @author javie
 */
public class Clase_33_Interfaces implements Clase_33_interface, Clase_33_SerVivo{ // al integrar una interface estoy obligado a sobre escribir los metodos

    @Override
    public void tipoAnimal() {
        System.out.println("Soy un mamifero, Perro");
    }

    @Override
    public String mostrarNombre() {
        return "poodle";
    }

    @Override
    public void mostrarVida() {
      System.out.println("Estoy al %100 vivo y coleando");
    }
    
}
