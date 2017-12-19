/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_basicas;

import java.util.Scanner;

/**
 * vector arreglo array son variables que son capaces de contener en si misma mas de un dato de un tipo definido
 * @author javie
 */
public class Clase_14_a_17_vector {
    Scanner sc = new Scanner(System.in); // primero inicializamos una variable tipo scanner con el atributo de ingreso de datos "in"
  
    public void vector_inicial() { // este metodo genera un vector basico
    
    System.out.println("Ingrese tamaño del vector: "); // se imprime mensaje
    
      int tamano = sc.nextInt();  // se solicita un dato de tipo entero por el usuario y se almacena en una variable inicializada de tipo int
                                  // llamada tamano
      String[] vector = new String[tamano]; // se inicializa un vector con la dimension de la variable tamano
    for(int i=0; i<vector.length;i++){ // ahora creamos un for para llenar el vector inicializando la variable tipo int llamada i
        // la condicion es que i sea menor al tamaño total del vector con el metodo vector.length,y finalmente se genera el incremento i++
         System.out.println("Ingrese contenido de la posicion"+i+" : "); //mientras el ciclo ocurra se pedira que se ingrese el contenido de
         // la posicion mostrada por i esta seran de tipo string
         vector[i] = sc.next(); // aqui es donde se almacena la informacion del usuario
     }
         System.out.println("============================================="); // se imprime mensaje para separar
    for(String dato : vector){ // ahora creamos un for mejorado para mostrar el contenido del vector en una variable tipo string llamada dato
         System.out.println(dato); // se imprime el contenido almacenado en dato
     }
}
  public void vector_paralelo(){ // este metodo mostrara el funcionamiento de un vector paralelo
      // este tipo de vector utiliza dos array y almacena la informacion simultaneamente generalmente usado para almacenar datos de dos tipos
      // de variables ya sea int y double o string y int como este ejemplo
      String[] nombres = new String[3]; //primero inicializamos los arreglos este caso le daremos una dimencion de 3 esta es de tipo String
      int[] edades = new int[3]; //seguido inicializamos el arreglo de tipo int con dimencion 3
      // algo recomendado es que ambos arreglos tengan las mismas dimenciones para evitar errores
    for(int i = 0;i<3;i++){ // ahora generamos un for para rellenar el arreglo inicializando la variable tipo int llamada i
        // la condicion es que i sea menor a 3,y finalmente se genera el incremento i++
      System.out.println("Ingrese nombre: "); //mientras el ciclo ocurra se pedira que se ingrese el contenido de    
      nombres[i] = sc.next(); // la posicion mostrada por i esta seran de tipo string
      System.out.println("Ingrese edad: "); // y tambien pedira el contenido del segundo arreglo de
      edades[i] = sc.nextInt(); // la posicion mostrada por i esta seran de tipo int
    }  
    System.out.println("============================================="); // se imprime mensaje para separar
    for(int i = 0;i<3;i++){ //Ahora se genera un for para imprimir el contenido de los array o arreglos se usa un for basico debido a que
        // la dimencion de los array es un numero fijo 
      System.out.println(nombres[i]+" "+edades[i]);  // y se imprimen los valores almacenados
    }
    
  }
  public void vector_mayor_menor(){ // este metodo mostrara un algoritmo para encontrar el elemento mayor y menor de un arreglo 
      String[] nombres = new String[3]; //primero inicializamos los arreglos este caso le daremos una dimencion de 3 esta es de tipo String
      int[] edades = new int[3];  //seguido inicializamos el arreglo de tipo int con dimencion 3
    for(int i = 0;i<3;i++){ // ahora generamos un for para rellenar el arreglo inicializando la variable tipo int llamada i
        // la condicion es que i sea menor a 3,y finalmente se genera el incremento i++
      System.out.println("Ingrese nombre: "); //mientras el ciclo ocurra se pedira que se ingrese el contenido de    
      nombres[i] = sc.next(); // la posicion mostrada por i esta seran de tipo string
      System.out.println("Ingrese edad: "); // y tambien pedira el contenido del segundo arreglo de
      edades[i] = sc.nextInt(); // la posicion mostrada por i esta seran de tipo int
    }  
    System.out.println("============================================="); // se imprime mensaje para separar
    // algoritmo para encontrar elemento mayor y menor
    int mayor = edades[0]; // se inicializa variable de control tipo int
    int menor = edades[0]; // se inicializa variable de control tipo int
    int posicion_mayor = 0; // se inicializa variable de tipo int que sera auxiliar
    int posicion_menor =0; // se inicializa variable de tipo int que sera auxiliar
    for(int i =0;i<3;i++){  //Encontrar el elemento Mayor 
        if (edades[i] > mayor){ // se utiliza una sentencia de tipo if que dice : si el indice de edades es mayor a la variable mayor entonces
            mayor = edades[i]; // mayor es igual a indice (i) de edades
            posicion_mayor = i; // posicion_mayor es igual a i
        }  // esto se hace para almacenar el valor de edades en mayor y posteriormente moverlo hacia la derecha este proceso continuara hasta
        // que el ciclo finalize
        //------------------------------------------------------------------------------
        //Encontrar el elemento Menor
        if (edades[i] < menor){  // se utiliza una sentencia de tipo if que dice : si el indice de edades es menor a la variable menor entonces
            menor = edades[i];  // menor es igual a indice (i) de edades
            posicion_menor =i; // posicion_menor es igual a i
        }  // esto se hace para almacenar el valor de edades en menor y posteriormente moverlo hacia la derecha este proceso continuara hasta
    }      // que el ciclo finalize
    // la diferencia entre los dos arreglos es la posicion del operador logico en la sentencia if
    System.out.println("============================================="); // se imprime mensaje para separar
    System.out.println("El mayor es: "+mayor+"\n"+"Su nombre es: "+nombres[posicion_mayor]); // se imprimen el valor mayor almacenado
    System.out.println("============================================="); // se imprime mensaje para separar
    System.out.println("El menor es: "+menor+"\n"+"Su nombre es: "+nombres[posicion_menor]); // y se imprimen el valor menor almacenado 
  }
  public void vector_orden_burbuja(){ // este metodo mostrara un algoritmo que mostrara todo los elementos ingresados ordenados
      // ya sea de menor a mayor o viceversa
      String[] nombres = new String[3]; //primero inicializamos los arreglos este caso le daremos una dimencion de 3 esta es de tipo String
      int[] edades = new int[3]; //seguido inicializamos el arreglo de tipo int con dimencion 3
    for(int i = 0;i<3;i++){ // ahora generamos un for para rellenar el arreglo inicializando la variable tipo int llamada i
         // la condicion es que i sea menor a 3,y finalmente se genera el incremento i++
      System.out.println("Ingrese nombre: ");  //mientras el ciclo ocurra se pedira que se ingrese el contenido de    
      nombres[i] = sc.next(); // la posicion mostrada por i esta seran de tipo string
      System.out.println("Ingrese edad: "); // y tambien pedira el contenido del segundo arreglo de
      edades[i] = sc.nextInt(); // la posicion mostrada por i esta seran de tipo int
    }  
    System.out.println("============================================="); // se imprime mensaje para separar  
    //Ordenar de menor a mayor el vector edades (Metodo Burbuja)
    // para enteros int
    int aux; // se inicializa variable de tipo int que sera auxiliar
    for (int i = 0; i<edades.length;i++){ // se genra un for con el valor maximo del indice del arreglo utilizando el metodo .lengh
        for (int j = 0; j<edades.length - i; j++){// dentro de este se genra un for con el valor maximo del indice del arreglo utilizando el metodo .lengh
            // en este caso la condicion seria si j es menor a longuitud de edades (indice) menos i
            if(edades[j] > edades[j+1]){ // se crea sentencia if  que dice : si edades indice j es mayor a edades indice j + 1 entonces
                aux = edades[j]; // variable aux es igual a variable edades en el indice j
                edades[j] = edades[j + 1]; //variable edades indice j es igual a edades indice j + 1
                edades[j + 1] = aux; // variable edades indice j + 1 es igual a variable aux
                // en resumidas cuentas este procedo realiza el cambio de posicion de los elemento almacenandolo en la variable aux para
                // evitar la perdida del valor para las variables tipo int
            }
        }
    }
    // para cadenas de texto String
    String aux1; // se inicializa variable de tipo String que sera auxiliar
    for (int i = 0; i<nombres.length;i++){ // se genra un for con el valor maximo del indice del arreglo utilizando el metodo .lengh
        for (int j = 0; j<nombres.length - i; j++){ // dentro de este se genra un for con el valor maximo del indice del arreglo utilizando el metodo .lengh
            // en este caso la condicion seria si j es menor a longuitud de nombres (indice) menos i
            if(nombres[j].compareTo(nombres[j+1]) > 0 ){ // se crea sentencia if  que dice : si nombres indice j comparado al nombres indice j+1
                // es mayor a 0 entonces
                aux1 = nombres[j]; // variable aux es igual a variable nombres en el indice j
                nombres[j] = nombres[j + 1]; //variable nombres indice j es igual a nombres indice j + 1
                nombres[j + 1] = aux1; // variable nombres indice j + 1 es igual a variable aux
                // en resumidas cuentas este procedo realiza el cambio de posicion de los elemento almacenandolo en la variable aux para
                // evitar la perdida del valor esto en variables de tipo String utilizando el matodo compareTo
            }
        }
    }
    for(Integer valor : edades){ // ahora creamos un for mejorado para mostrar el contenido del vector en una variable tipo string llamada valor
        System.out.println(valor); // y se imprimen el valor ordenado de menor a mayor de tipo int
    }
    System.out.println("============================================="); // se imprime mensaje para separar    
    for(String valor1 : nombres){ // ahora creamos un for mejorado para mostrar el contenido del vector en una variable tipo string llamada valor1
        System.out.println(valor1); // y se imprimen el valor1 de A a Z de tipo string
    }
  }
}
