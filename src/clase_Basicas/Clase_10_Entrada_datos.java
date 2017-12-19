/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_Basicas;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Clase_10_Entrada_datos {
    public Clase_10_Entrada_datos(){
              Scanner input = new Scanner(System.in); // se instancia la variable input de tipo Scanner(metodo) y el parametro es System.in
          // para utilizar se debe importar la clase Scanner 
          System.out.println("Cual es tu nombre");
          String nombre = input.next(); // aqui almacenamos lo que ingrese el usuario en una variable de tipo String
          System.out.println("Y Cual es tu edad");
          int edad = input.nextInt(); // aqui almacenamos lo que ingrese el usuario en una variable de tipo int la diferencia
          // radica en el metodo utilizado nextInt lo que convierte lo ingresado en tipo int esto aplica las limitaciones de la variable
          // por lo que solo aceptara numeros
          System.out.println("Tu nombre es: "+nombre+" y tu edad es:"+edad); // finalmente imprimimos los valores ingresados
}
}
