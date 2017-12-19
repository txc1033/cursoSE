/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_intermedia;

/**
 * las excepciones son utilizadas para manejar errores en los programas y ejecutar una accion determinada asi evitando la falla del programa
 * y exponer el codigo de error al usuario amenos que nosotros lo imprimamos expresamente un ejemplo podria ser manejar cuando tu progrma
 * no pueda conectarse a una base de datos
 * @author javie
 */
public class Clase_41_excepciones {
    
    private void proceso1(){// aqui ejecutaremos el proceso sin las exepcciones lo que detendra el programa mostrando el error
        int a = 7, b = 0;
        int divicion =a/b;
    }
    public Clase_41_excepciones (){
        
        
        try{
         // proceso 1   
        this.proceso1();
        }
        catch(Exception erro_zero){ // para ejecutar el bloque catch debemos inicializar la Excepcion + el nombre por defecto es e
            // en este caso la llamaremos erro_zero
         // manejo de la expeccion 
         System.out.println("No se permite la divicion por 0"); //podemos imprimir un mensaje customizado
         System.out.println(erro_zero.getMessage()); // aqui llamamos a la excepcion nombrada erro_zero + el metodo .getMessage que nos dara
         // una informacion del error sin detener el programa de forma brusca
        }
        finally{
         // este bloque se ejecutara si o si es decir independiente de lo que ocurra 
         // este es opcional implementarlo
         System.out.println("<-(°-°)->");
        }
    }
    
}
