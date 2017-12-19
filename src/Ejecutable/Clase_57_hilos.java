/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

/**
 *
 * @author javie
 */
public class Clase_57_hilos {
    public Clase_57_hilos(){
        Clase_57_hilo hilo1 = new Clase_57_hilo("HILO1");
        hilo1.start();
        
        Clase_57_hilo hilo2 = new Clase_57_hilo("HILO2");
        hilo2.start();
    }
}
// nota investigar metodo Runnable