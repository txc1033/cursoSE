/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_intermedia;

import java.util.ArrayList;
import java.util.List;

/**
 * En este ejercicio mostraremo la diferencia de inicializar un arrayList sin la dimencion establecida contra una con su dimencion inicializada
 * @author javie
 */
public class Clase_37_arraylist {
    
    public void arraylist (){ // creamos el metodo a ejecutar el ejemplo
        long inicio = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        List<Integer> lista = new ArrayList(); // se inicializa el arraylist sin dimencionarlo
        for (int i=0;i<1000000; i++){ // se crea for que realizara  1.000.000 de ciclos para este ejemplo
            lista.add(i); // y almacenara el valor de i en el array lista
        }
        long fin = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        System.out.println("Cantidad de datos a rellenar: 1.000.000"); // imprimimos un mensaje
        System.out.print("sin dimension: "); // imprimimos un mensaje
        System.out.print(fin-inicio); // imprimimos el tiempo de duracion restando el tiempo final menos el tiempo inicial
        System.out.print(" Miliseg"); //imprimimos un mensaje
        
        long inicio1 = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        List<Integer> lista1 = new ArrayList(1000000); // se inicializa el arraylist con una dimencion de 1.000.000
        for (int i=0;i<1000000; i++){ // se crea for que realizara  1.000.000 de ciclos para este ejemplo
            lista1.add(i); // y almacenara el valor de i en el array lista1
        }
        long fin1 = System.currentTimeMillis(); // inicializamos una variable de tipo long que utilizara el metodo currentTimeMillis();
        // el cual se utilizara para medir el tiempo de la ejecucion este nos mostrara el valor en milisegundos
        System.out.print("\ncon dimension: "); //imprimimos un mensaje
        System.out.print(fin1-inicio1); // imprimimos el tiempo de duracion restando el tiempo final menos el tiempo inicial
        System.out.print(" Miliseg\n"); //imprimimos un mensaje
        
       /* este ejemplo nos muestra que es mejor inicializar la dimencion del array sismpre y cuando se conosca el tamaño que tendra nuestro
        * array ya que de esta forma evitamos que el procesador este asignando constantemente los bloques de memoria reducciendo considerablemente
        * el tiempo de ejecucion, ahora si nuestra dimension es pequeña no sera necesario generar una dimension
        */ 
    }
    
}
