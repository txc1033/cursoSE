/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_intermedia;

import clase_aplicacion1.Clase_34_persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Las colecciones en java se definen como un  objeto que puede almacenar un numero de variable de elementos siendo cada elemento otro objeto
 * siguiendo con nuestro programa, podriamos ver una coleccion como una bodega que contiene cajas dentro. Puede haber distintos tipos de colecciones
 * de tamaño "Flexible", es decir, que pueden encoger o agrandar segun las necesidades del programador
 * 
 * 
 * @author javie
 */
public class Clase_36_colecciones_iterator {
    
    public void Array(){ // metodo que muestra el funcionamiento del metodo arrayList
        List<String> lista = new ArrayList(); // declaro que el objeto llamado lista pertenece a la interface List<String> y que a su vez estoy
        // generando una instancia de tipo ArrayList
        lista.add("javifast"); // utilizamos el metodo .add para agregar valores al array del tipo String
        lista.add("xd"); // utilizamos el metodo .add para agregar valores al array del tipo String
        lista.add("2017"); // utilizamos el metodo .add para agregar valores al array del tipo String
        
        for(String s: lista){ // creamos un for mejorado para imprimir los valores del array en la variable s
            System.out.println(s); // se imprime s
        }   
    }
////////////////////////////////////////////////////////////////////////////////    
    public void iterator(){ // en este metodo mostraremos el fucnionamiento del metodo iterator
   Clase_34_persona per_a = new Clase_34_persona();  // en este ejemplo crearemos objetos en base a la clase persona
    per_a.setCuenta(4); // se agrega el numero de cuenta con el metodo set+Cuenta
    per_a.setNombre("paola"); // se agrega el nombre con el metodo set+Nombre
    per_a.setMonto(500.0); // se agrega el monto con el metodo set+Monto
   Clase_34_persona per_b = new Clase_34_persona();  // en este ejemplo crearemos objetos en base a la clase persona
    per_b.setCuenta(5); // se agrega el nombre con el metodo set+Nombre
    per_b.setNombre("pedro"); // se agrega el nombre con el metodo set+Nombre
    per_b.setMonto(900.0); // se agrega el monto con el metodo set+Monto
   Clase_34_persona per_c = new Clase_34_persona();  // en este ejemplo crearemos objetos en base a la clase persona
    per_c.setCuenta(6); // se agrega el nombre con el metodo set+Nombre
    per_c.setNombre("luis"); // se agrega el nombre con el metodo set+Nombre
    per_c.setMonto(250.0); // se agrega el monto con el metodo set+Monto
        
         List<Clase_34_persona> lista_persona = new ArrayList(); // declaro que el objeto llamado lista_perosna pertenece a la interface
        //  List<String> y que a su vez estoy generando una instancia de tipo ArrayList
         lista_persona.add(per_a);  // utilizamos el metodo .add para agregar valores al array en este caso del tipo objeto
         lista_persona.add(per_b);  // utilizamos el metodo .add para agregar valores al array en este caso del tipo objeto
         lista_persona.add(per_c);  // utilizamos el metodo .add para agregar valores al array en este caso del tipo objeto
            Iterator<Clase_34_persona> iterator = lista_persona.iterator(); // ahora generamos un iterator donde utilizamos la clase de los
            // objetos almacenados en este caso la Clase_34_persona en la variable iterator  llamando al arrayList lista_persona
            while(iterator.hasNext()){ // para imprimir los valores utilizaremos un ciclo while con la condicion iterator con el metodo hasNext()
            // con el que recorrera el siguiente elemento hasta terminar    
            System.out.println(iterator.next().getNombre()); // e imprimimos el elemento que deseemos para este ejemplo mostramos el nombre
            // almacenado en el iterator con el metodo get+Nombre
        }
            System.out.println("=============================================="); // separador
            // tambien podemos imprimir la lista con un ciclo for
            for(int i=0;i<lista_persona.size();i++){ // con la condicion que mientras i sea menor al tamaño con el metodo .size recorrera
               System.out.println("N°: "+lista_persona.get(i).getCuenta()+"\nNombre: "+lista_persona.get(i).getNombre()+ // e imprimira
               "\nMonto:"+lista_persona.get(i).getMonto()); // el contenido el cual lo imprimiremos en un solo println utilizando 
               // los atajos para ordenar la impresion como el siguiente ejemplo
               // N°: cuenta tipo int
               // Nombre: nombre tipo string
               // Monto : monto tipo double
            }
    }
}
