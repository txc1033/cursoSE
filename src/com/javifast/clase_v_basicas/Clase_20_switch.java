/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_basicas;
import java.util.Scanner;
/**
 * El switch viene a reemplazar el exesivo uso de sentencias if facilitanto el orden del codigo y a su vez una mejor programacion
 * @author javie
 */
public class Clase_20_switch {
    
    public Clase_20_switch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese usuario");
        String resultado = sc.next();
        switch (resultado.toUpperCase()){
            case "JAVIER":
            System.out.println("Bienvenido señor "+resultado.toLowerCase());    
            break;
            case "FRANCO":
            System.out.println("Bienvenido señor "+resultado.toLowerCase());    
            break;
            case "YANIRA":
            System.out.println("Bienvenido señora "+resultado.toLowerCase());    
            break;
            default:
              System.out.println("no se reconoce el usuario "+resultado.toLowerCase()); 
              System.exit(0);
        }
}
}
