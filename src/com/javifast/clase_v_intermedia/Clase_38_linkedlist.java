/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_intermedia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkeList o listas enlazadas es aquella que sus elementos tiene referencia con sus elementos anteriores
 * 
 * @author javie
 */
public class Clase_38_linkedlist {

    public void lista_enlazada (){
        
        List lista = new LinkedList();
        // tambien se puede declarar indicando el tipo de elemento que almacenada 
        // List<Integer> lista = new LinkedList();
        // LinkedList lista = new LinkedList();
        lista.add(1); // se agregan elemento a la lista
        lista.add(2); // se agregan elemento a la lista
         
        System.out.println(lista.size()); // para conocer el tamaño de la lista utilizamos el metodo size
        
    }
    
    public void comparativa_linkedlist_arraylist (){
                
                ArrayList lista_array = new ArrayList(); // se inicializa el arraylist
                LinkedList lista_enlazada = new LinkedList(); // se inicializa el LinkedList
                long inicio,fin,tiempo; // se inicializan variables tipo long para almacenar el tiempo
        // ArrayList add
        inicio = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        
        for (int i=0;i<100000; i++){ // se crea for que realizara  100.000 de ciclos para este ejemplo
            lista_array.add(i); // y almacenara el valor de i en el arraylist lista_array
        }
        fin = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        tiempo = fin-inicio;
        System.out.print("ArrayList duracion agregando datos: "); //imprimimos un mensaje
        System.out.print(tiempo); // imprimimos el tiempo de duracion restando el tiempo final menos el tiempo inicial
        System.out.print(" Miliseg\n"); //imprimimos un mensaje
        
        // LinkedList add
        inicio = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        for (int i=0;i<100000; i++){ // se crea for que realizara  100.000 de ciclos para este ejemplo
            lista_enlazada.add(i); // y almacenara el valor de i en el LinkedList lista_enlazada
        }
        fin = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();// el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        tiempo = fin-inicio;
        System.out.print("\nLinkedList duracion agregando datos: "); //imprimimos un mensaje
        System.out.print(tiempo); // imprimimos el tiempo de duracion restando el tiempo final menos el tiempo inicial
        System.out.print(" Miliseg\n"); //imprimimos un mensaje
        
        // ArrayList get
        inicio = System.currentTimeMillis();
        for (int i=0;i<100000; i++){ // se crea for que realizara  100.000 de ciclos para este ejemplo
            lista_array.get(i); // y consulta el valor del indice i en el arraylist lista
        }
        fin = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        tiempo = fin-inicio;
        System.out.print("\nArrayList duracion en consultar datos: "); //imprimimos un mensaje
        System.out.print(tiempo); // imprimimos el tiempo de duracion restando el tiempo final menos el tiempo inicial
        System.out.print(" Miliseg\n"); //imprimimos un mensaje
        
        // LinkedList get
        inicio = System.currentTimeMillis();
        for (int i=0;i<100000; i++){ // se crea for que realizara  100.000 de ciclos para este ejemplo
            lista_enlazada.get(i); // y almacenara el valor de i en el LinkedList lista_enlazada
        }
        fin = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        tiempo = fin-inicio;
        System.out.print("\nLinkedList duracion en consultar datos: "); //imprimimos un mensaje
        System.out.print(tiempo); // imprimimos el tiempo de duracion restando el tiempo final menos el tiempo inicial
        System.out.print(" Miliseg\n"); //imprimimos un mensaje
        
        // ArrayList remove
        inicio = System.currentTimeMillis();
        for (int i=99999;i>=0; i--){ // se crea for que realizara  100.000 de ciclos para este ejemplo
            lista_array.remove(i); // y elimina el valor del indice i en el arraylist lista_array
        }
        fin = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        tiempo = fin-inicio;
        System.out.print("\nArrayList duracion en eliminar datos: "); //imprimimos un mensaje
        System.out.print(tiempo); // imprimimos el tiempo de duracion restando el tiempo final menos el tiempo inicial
        System.out.print(" Miliseg\n"); //imprimimos un mensaje
        
        // LinkedList remove
        inicio = System.currentTimeMillis();
        for (int i=99999;i>=0; i--){ // se crea for que realizara  100.000 de ciclos para este ejemplo
            lista_enlazada.remove(i); // y elimina el valor de i en el LinkedList lista_enlazada
        }
        fin = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        tiempo = fin-inicio;
        System.out.print("\nLinkedList duracion en eliminar datos: "); //imprimimos un mensaje
        System.out.print(tiempo); // imprimimos el tiempo de duracion restando el tiempo final menos el tiempo inicial
        System.out.print(" Miliseg\n"); //imprimimos un mensaje
    }
   /* para finalizar podemos notar como linkedlist es mas rapido en agregar y remover datos pero es mas lento al momento de consultarlos 
    * esto es debido a que debe recorrer desde el primer elemento hasta el elemento que deseamos consultar por su prinsipio de elnaces
    * por lo que en esos casos es mucho mejor utilizar el ArrayList para tareas de agregado y eliminacion de datos es recomendado utilizar
    * LinkedList
    */
}
