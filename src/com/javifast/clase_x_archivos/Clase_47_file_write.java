/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_x_archivos;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author javie
 */
public class Clase_47_file_write {
    
    public void escritura() throws Exception{ // se crea metodo escritura con la excepcion por defecto lo recomendado seria usar IOException
        FileWriter archivo = null; // inicializamos el objeto filewrite llamado archivo y lo dejamos con valor null
        PrintWriter printer = null; // inicializamos el objeto filewrite llamado printer y lo dejamos con valor null
        try{ // creamos un try-catch para controalar posible errores
            archivo = new FileWriter("d://camara beta.txt", true); // usamos el objeto archivo y le almacenamos el elemento en la ruta + el 
            // el agregado true en caso de tenerlo creado y evitar la sobre escritura del mismo
            printer = new PrintWriter(archivo);// almacenamos en el objeto printer el objeto archivo
            
            printer.println("Escrito por java, by javifast"); // utilizamos el metodo .println() para escribir un mensaje en el archivo
        }catch(Exception e){ // se usa un catch por defecto aunque es recomendado utilizar IOException
           //Excepcion 
        }finally{ // creamos una sentencia finally
            if (archivo != null){ // con una sentencia if en caso de que nuestro objeto archivo sea null
                archivo.close(); // cerrara el objeto con el metodo .close()
            }
        }
    }
    
    public void try_with_resources() throws Exception{   
        PrintWriter printer = null; // inicializamos el objeto filewrite llamado printer y lo dejamos con valor null
        try(FileWriter archivo = new FileWriter("d://camara beta.txt", true)){ // creamos un try whith resources colocando la variable a utilizar entre parentecis
            printer = new PrintWriter(archivo);// almacenamos en el objeto printer el objeto archivo
            printer.println("Escribiendo en un try with resources"); // utilizamos el metodo .println() para escribir un mensaje en el archivo
        }catch(Exception e){
           //Excepcion 
        } // y ya no sera necesesario utilizar un finally
        }
} // esto hace el codigo mas legible 

