/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_Introduccion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author javie
 */
public class Clase_1_java {
        
    public Clase_1_java() throws Exception {
        try{ 
    FileReader archivo = new FileReader("src/textos/Introduccion.txt");
    BufferedReader buffer = new BufferedReader(archivo);
    String texto;
    while((texto = buffer.readLine()) !=null){ 
        System.out.println(texto);
    }
        }catch(IOException e){ 
         System.out.println(e.getMessage());
        }
    }
}
