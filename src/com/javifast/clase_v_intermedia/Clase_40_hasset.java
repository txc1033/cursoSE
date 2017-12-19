/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_intermedia;

import java.util.HashSet;
import java.util.Set;

/**
 * los hasset son metodos que generan una impresion de datos aleatoria(actualmente java los imprime ordenado) y no permiten duplicado 
 * en caso de ingresar un duplicdo este lo omitira
 * no genera error pero no mostrara el dato mas de una vez
 * @author javie
 */
public class Clase_40_hasset {
    
    public void desordenado(){
    Set<String> lista = new HashSet<String>(); // se instancia la clase hashset de tipo string en el constructor lista
    lista.add("a"); // se agrega elemento a la lista con el metodo .add
    lista.add("a"); // se agrega elemento a la lista con el metodo .add
    lista.add("a"); // se agrega elemento a la lista con el metodo .add
    lista.add("a"); // se agrega elemento a la lista con el metodo .add
    lista.add("b"); // se agrega elemento a la lista con el metodo .add
    lista.add("c"); // se agrega elemento a la lista con el metodo .add
    for (String dato : lista){ // generamos un for mejorado para imprimir la lista en la variable dato
        System.out.println(dato); // se imprime los datos
    }
    }
    
}
