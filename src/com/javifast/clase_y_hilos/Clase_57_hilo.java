/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_y_hilos;

/**
 *
 * @author javie
 */
public class Clase_57_hilo extends Thread {
    private String nombre;
    public Clase_57_hilo(){
        
    }
    public Clase_57_hilo(String nombre){
       this.nombre = nombre; 
    }
    @Override
    public void run(){
        for(int i = 0;i<200;i++){
            System.out.println(nombre+"-"+i);
        }
    }
}
