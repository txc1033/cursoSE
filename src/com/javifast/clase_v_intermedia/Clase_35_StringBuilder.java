/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_intermedia;

import java.text.DecimalFormat;

/**
 * Stringbuilder y concatenacion de string realizan la misma funcion pero se diferencian en la velocidad de ejecucion que sera demostrada en el 
 * siguiente ejercicio
 * @author javie
 */
public class Clase_35_StringBuilder {
    
    public void concatenacion(){ // primero crearemos un metodo que nos muestre el uso de la concatenacion
        String texto = "Hola Javifast te saluda"; // primero inicializamos una variable de tipo string con un texto opcional
        texto += " esto es un agregado " + "y esto tambien XD"; // ahora concatenamos las cadenas de texto que estimemos conveniente
        System.out.println(texto); // e imprimimos el mensaje
    }
    public void Stringbuilder(){ // esta vez aplicaremos el mismo ejemplo con StringBuilder
        StringBuilder texto = new StringBuilder(); // primero inicializamos la clase Stringbuilder en la variable texto
        texto.append("Hola Javifast te saluda ").append("esto es un agregado ").append("y esto tambien XD"); // ahora utilizamos el metodo
        // .append() para agregar la cadenas de texto que estiememos conveniente
        System.out.println(texto.toString());// y procedemos a imprimirlo con el metodo .toString()
    }
    
    // el resultado de los metodos concatenacion y Stringbuilder seran los mismos para demostrar que se puede realizar lo mismo
    // en el metodo ejemplo demostraremos la diferencia de al momento de ejecutar una gran cantidad de informacion
    
    public void ejemplo(){ // creamos el metodo ejemplo
        long builder_inicio = System.nanoTime(); // inicializamos una variable de tipo long con el metodo .nanoTime de la clase System
        // esto con el fin de calcular la duracion del ejemplo, tambien existen otros metodo para calcular el tiempo que veremos posteriormente
        StringBuilder builder = new StringBuilder(); // inicializamos la clase Stringbuilder en la variable builder
        DecimalFormat df = new DecimalFormat("#0.00"); // inicializamos la clase decimalformat en la variables df con fines de ordenamiento de
        // la impresion de los resultado
        for(int i=0;i<1000;i++){ // creamos un for que recorrera 1.000 veces 
            builder.append(i); // mientras recorra se iran agregando los valores en builder con el metodo .append
        }
        
        long builder_fin = System.nanoTime(); // inicializamos una variable de tipo long con el metodo .nanoTime de la clase System
        // esto con el fin de calcular la duracion del ejemplo, tambien existen otros metodo para calcular el tiempo que veremos posteriormente
        double ca = (builder_fin - builder_inicio); // se inicializa una variable de tipo double y se le resta el tiempo de inicio y termino
        // para obtener la duraccion del procedimiento que se almacena en la variable ca
        double diferencia_builder = ca / 1000000; // se divide el valor de ca por 1.000.000 para mostrar el la duracion en segundos
        
        System.out.println("Tiempo de StringBuilder: "+df.format(diferencia_builder)+"s"); // procedemos a imprimir al finalar el ciclo for
        // mostrando el tiempo en el formato explicado
        ///////////////////////////////////////////////////////////
        long texto_inicio = System.nanoTime();// inicializamos una variable de tipo long con el metodo .nanoTime de la clase System
        // esto con el fin de calcular la duracion del ejemplo, tambien existen otros metodo para calcular el tiempo que veremos posteriormente
        String texto = ""; // se inicializa una variable de tipo Sting sin datos;
        for(int i=0;i<1000;i++){  // creamos un for que recorrera 1.000 veces 
            texto += i; // mientras recorra se iran agregando los valores en texto con el metodo de concatenacion
        }
        
        long texto_fin = System.nanoTime();// inicializamos una variable de tipo long con el metodo .nanoTime de la clase System
        // esto con el fin de calcular la duracion del ejemplo, tambien existen otros metodo para calcular el tiempo que veremos posteriormente
        double cal = (texto_fin - texto_inicio);// se inicializa una variable de tipo double y se le resta el tiempo de inicio y termino
        // para obtener la duraccion del procedimiento que se almacena en la variable cal
        double diferencia_texto = cal / 1000000; // se divide el valor de ca por 1.000.000 para mostrar el la duracion en segundos
        System.out.println("Tiempo de String texto: "+df.format(diferencia_texto)+"s");// procedemos a imprimir al finalar el ciclo for
        // mostrando el tiempo en el formato explicado
        
        // al finalizar podra comparar los tiempos y comprobaremos que en los casos donde la cantidad de datos a almacenar en una variable sean 
        // mayores es mas recomendado utilizar la clase StringBuilder debido a su rapides en el momento de ejecutarse
        
        // si en el caso contrario la cantidad de valores es limitada o escasa podra optar con el metodo de la concatenacion ya que es mas facil 
        // y rapida de implementar
    }
    
    
}
