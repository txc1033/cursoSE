/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_intermedia;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Clase_44_Excepciones_personalizadas {

    
public Clase_44_Excepciones_personalizadas(){
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese edad");
    int edad = sc.nextInt();
    final int EDAD_MAXIMA = 100;
    try{
    if (edad< EDAD_MAXIMA){
    System.out.println("BIENVENIDO");
    }else {
     throw new   Clase_44_EdadExcepcion("edad no permitida, edad no correcta");
   }} catch(Exception e){
      System.out.println(e.getMessage());
   }
  }
}
