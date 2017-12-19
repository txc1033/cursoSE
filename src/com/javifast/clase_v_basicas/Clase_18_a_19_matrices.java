/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_basicas;

import java.util.Scanner;

/**
 * las matrices a diferencia de los arreglos tienen mas dimenciones generandose filas y columnas
 * @author javie
 */
public class Clase_18_a_19_matrices {
    
     Scanner sc = new Scanner(System.in); // primero inicializamos una variable tipo scanner con el atributo de ingreso de datos "in"
     
    public void matriz(){ // la cantidad de dimencion ingresado en los corchetes seran multiplicado dando un total de valores ingresados
        // en este caso seran dos corchetes de 3 dimencion dando un total de 9 elementos ([3]x[3]=9)
        int[] [] numeros = new int[3][3]; // para declarar una matriz hay que iniciarla con el tipo de variable mas minimo dos corchetes [][]
        System.out.println("Ingrese elemento para la posicion ");
        for(int i=0;i<3;i++){ // para rellenar una matriz necesitamos la cantidad de for correspondiente a la cantidad de corchetes 
          for(int j=0;j<3;j++){ //de la la matriz en este caso esta siendo apoyado por dos for  ya que tiene dos corchetes [][]
              System.out.println("Fila: "+i+" Columna: "+j); // se muestra mensaje
              numeros[i][j] = sc.nextInt(); // se ingresa los valores
          }
        }
        System.out.println("============================================="); // se imprime mensaje para separar
        System.out.print("      Resultado de la matriz:\n");
        for(int i=0;i<3;i++){ // para imprimir una matriz necesitamos de igual forma la cantidad de corchetes 
          for(int j=0;j<3;j++){ //de la la matriz en este caso esta siendo apoyado por dos for  ya que tiene dos corchetes [][]
              System.out.print("\t"+numeros[i][j]+" "); // se imprimen la matriz
          } 
          System.out.print("\n"); //
        }
       
    }
    
    public void operacion_matrices(int tiempo_ingreso,int tiempo_resultado){ // se mostraran distintas operaciones con matriz con un llenado automatico para su rapida demostracion
        int contador=1; // se crea variable de tipo int para ingresar los valores automaticamente
        int[] [] numeros = new int[3][3]; // para declarar una matriz hay que iniciarla con el tipo de variable mas minimo dos corchetes [][] 
        System.out.println("Ingrese elemento para la posicion ");
        for(int i=0;i<3;i++){ // para rellenar una matriz necesitamos la cantidad de for correspondiente a la cantidad de corchetes 
          for(int j=0;j<3;j++){ //de la la matriz en este caso esta siendo apoyado por dos for  ya que tiene dos corchetes [][]
              numeros[i][j] = contador; // se ingresa los valores
              System.out.println("Fila: "+i+" Columna: "+j); // se muestra mensaje
              try{ // se genera try-catch para la clase thread esto es opcional
              Thread.sleep(tiempo_ingreso); //se utiliza la clase Thread con el metodo Sleep para automatizar el ingreso de datos de forma dinamica
              System.out.println("se ingresa: "+contador);// se muetra el ingreso del valor
              contador++; // se suma el contador
              }
              catch(InterruptedException e){ //  exepcion en caso que courra un error de interrupcion del metodo sleep sin mensaje
                      }
          }
          
        }
        System.out.println("============================================="); // se imprime mensaje para separar
        try{ // se genera try-catch para la clase thread
              Thread.sleep(tiempo_resultado); //se utiliza la clase Thread con el metodo Sleep para automatizar el ingreso de datos de forma dinamica
              System.out.println("Una vez ingresado los datos procedemos a mostrar");
            }
              catch(InterruptedException e){} //  exepcion en caso que courra un error de interrupcion del metodo sleep sin mensaje       
        try{ // se genera try-catch para la clase thread
              Thread.sleep(tiempo_resultado); //se utiliza la clase Thread con el metodo Sleep para automatizar el ingreso de datos de forma dinamica
              System.out.println("============================================="); // se imprime mensaje para separar
            }
              catch(InterruptedException e){} //  exepcion en caso que courra un error de interrupcion del metodo sleep sin mensaje        
                
              System.out.print("Resultado de la matriz Diagonal:\n");
        for(int i=0;i<3;i++){ // para imprimir una matriz necesitamos de igual forma la cantidad de corchetes 
          for(int j=0;j<3;j++){ //de la la matriz en este caso esta siendo apoyado por dos for  ya que tiene dos corchetes [][]
              if (i == j){ // sentencia que si el indice de i es igual al de j entocnes
              System.out.print(+numeros[i][j]); // se imprimen el valor
          } 
              else { // en caso contrario 
                  System.out.print(0); // se imprime 0
              }
          }
          System.out.print("\n"); // separador
        }
        try{ // se genera try-catch para la clase thread
              Thread.sleep(tiempo_resultado); //se utiliza la clase Thread con el metodo Sleep para automatizar el ingreso de datos de forma dinamica
              System.out.println("============================================="); // se imprime mensaje para separar
            }
              catch(InterruptedException e){} //  exepcion en caso que courra un error de interrupcion del metodo sleep sin mensaje
        System.out.print("Resultado de la matriz Diagonal Invertida:\n");
        for(int i=0;i<3;i++){ // para imprimir una matriz necesitamos de igual forma la cantidad de corchetes 
          for(int j=0;j<3;j++){ //de la la matriz en este caso esta siendo apoyado por dos for  ya que tiene dos corchetes [][]
              if (i == 0 && j==2){ // sentencia que si el indice de i es igual a 0 y j es igual a 2 entonces
              System.out.print(+numeros[i][j]); // se imprimen el valor
          }   // se crean else if para en caso de no cumplirse la primera condicion proceder con la siguiente
              else if (i == 1 && j==1){ // sentencia que si el indice de i es igual a 1 y j es igual a 1 entonces
              System.out.print(+numeros[i][j]); // se imprimen el valor
          }
              else if (i == 2 && j==0){ // sentencia que si el indice de i es igual a 2 y j es igual a 0 entonces
              System.out.print(+numeros[i][j]); // se imprimen el valor
          } 
              else { // en caso contrario 
                  System.out.print(0); // se imprime 0
              }
          }
          System.out.print("\n"); // separador
        }
        try{ // se genera try-catch para la clase thread
              Thread.sleep(tiempo_resultado); //se utiliza la clase Thread con el metodo Sleep para automatizar el ingreso de datos de forma dinamica
              System.out.println("============================================="); // se imprime mensaje para separar
            }
              catch(InterruptedException e){} //  exepcion en caso que courra un error de interrupcion del metodo sleep sin mensaje
        System.out.print("Resultado de la matriz Primera fila:\n");
        for(int i=0;i<3;i++){ // para imprimir una matriz necesitamos de igual forma la cantidad de corchetes 
          for(int j=0;j<3;j++){ //de la la matriz en este caso esta siendo apoyado por dos for  ya que tiene dos corchetes [][]
              if (j == 0){ // sentencia que si el indice de i es igual a 0 para la primera fila entocnes
              System.out.print(+numeros[i][j]); // se imprimen el valor
          } 
              else { // en caso contrario 
                  System.out.print(0); // se imprime 0
              }
          }
          System.out.print("\n"); // separador
        }
        try{ // se genera try-catch para la clase thread
              Thread.sleep(tiempo_resultado); //se utiliza la clase Thread con el metodo Sleep para automatizar el ingreso de datos de forma dinamica
              System.out.println("============================================="); // se imprime mensaje para separar
            }
              catch(InterruptedException e){} //  exepcion en caso que courra un error de interrupcion del metodo sleep sin mensaje
        System.out.print("Resultado de la matriz Segunda fila:\n");
        for(int i=0;i<3;i++){ // para imprimir una matriz necesitamos de igual forma la cantidad de corchetes 
          for(int j=0;j<3;j++){ //de la la matriz en este caso esta siendo apoyado por dos for  ya que tiene dos corchetes [][]
              if (j == 1){ // sentencia que si el indice de i es igual a 1 la fila central entocnes
              System.out.print(+numeros[i][j]); // se imprimen el valor
          } 
              else { // en caso contrario 
                  System.out.print(0); // se imprime 0
              }
          }
          System.out.print("\n"); // separador
        }
        try{ // se genera try-catch para la clase thread
              Thread.sleep(tiempo_resultado); //se utiliza la clase Thread con el metodo Sleep para automatizar el ingreso de datos de forma dinamica
              System.out.println("============================================="); // se imprime mensaje para separar
            }
              catch(InterruptedException e){} //  exepcion en caso que courra un error de interrupcion del metodo sleep sin mensaje
        System.out.print("Resultado de la matriz Tercera fila:\n");
        for(int i=0;i<3;i++){ // para imprimir una matriz necesitamos de igual forma la cantidad de corchetes 
          for(int j=0;j<3;j++){ //de la la matriz en este caso esta siendo apoyado por dos for  ya que tiene dos corchetes [][]
              if (j == 2){ // sentencia que si el indice de i es igual a 2 para la ultima fila entocnes
              System.out.print(+numeros[i][j]); // se imprimen el valor
          } 
              else { // en caso contrario 
                  System.out.print(0); // se imprime 0
              }
          }
          System.out.print("\n"); // separador
        }         
    }
}
