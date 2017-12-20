/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_basicas;

/**
 * Sentencias basicas if else operador "?"
 * @author javie
 */
public class Clase_09_sentencias {
    public void Sentencia_if(int x){
        if (x < 50 && x < 10){ // la sentencia dice: si x es menor a 50 equivalente a verdadero y x es mayor a 10 equivalente a falso
            if (x != 25){ // tambien podemos generar tantas sentencias como deseemos pero si evitando contradecir las sentencias superiores ya
                //que provocaria un error de logica y lo mas probable que el programa no funcione
            System.out.println("tu numero es permitido");//si la sentencia se cumple se mostrara el mensaje
            } else{ //este else esta dentro del if x !=25 por lo que aplica a esa condicion la sentencia else dice: si x es igual a 25 hacer..
                System.out.println("no es posible ingresar el numero 25");//y se muestra el mensaje
            } 
        }
        else{ // este else esta dentro del if (x < 50 == true && x < 10 == false) y dice: si x no es menor a 50 siendo verdadera y 
             // x es menor a 10 siendo falso (lo opuesto) entonces hacer..
          System.out.println("tu numero no es valido"); // y se muestra el mensaje
        }
    }
}
