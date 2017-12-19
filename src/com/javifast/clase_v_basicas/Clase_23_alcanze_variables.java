/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_basicas;

/**
 * 
 * @author javie
 */
public class Clase_23_alcanze_variables {
    String global = "Global";
    public void local(){
        String local = "Local";
        System.out.println("Aqui se muetra la variable "+local+" y tambien la "+global);
    }
    public Clase_23_alcanze_variables(){
       System.out.println("Aqui solo se puede mostrar la variable "+global);
    }
}
