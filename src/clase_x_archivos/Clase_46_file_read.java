/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_x_archivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Clase_46_file_read {
    // lectura con la clase FileReader y BufferReader
    public void lectura() throws Exception { // al crear el metodo debemos instanciar las excepciones correspondiente para este ejemplo
        // abarcare una excepcion mas global
        try{ // generamos un bloque try-catch para evitar errores
    FileReader archivo = new FileReader("d://camara beta.txt"); // inicializamos el objeto tipo Filereader llamado archivo
    // con la ruta del elemento que deseamos leer
    BufferedReader buffer = new BufferedReader(archivo); // inicializamos un objeto de tipo BufferedReader que esta conteniendo el objeto archivo
    String texto; // inicializamos una variable tipo string llamada texto que contendra el contenido del buffer
    while((texto = buffer.readLine()) !=null){ // creamos un ciclo while para imprimir el contenido del archivo en la variable texto
        System.out.println(texto); // utilizando un system.out.println
    }
        }catch(IOException e){ 
         // mensaje  exepcion  opcional  
        }
}   // lectura con la clase FileInputStream
    public void lectura_en_byte() throws Exception { // al crear el metodo debemos instanciar las excepciones correspondiente para este ejemplo
    FileInputStream in = new FileInputStream("d://camara beta.txt"); // inicializamos el objeto tipo FileInputStream llamado archivo
    // con la ruta del elemento que deseamos leer
    // para imprimir el texto nos apoyaremos en la clase scanner debido a que nuestro texto sera expresado en una cadena de byte
    Scanner scanner = new Scanner(in,"UTF-8"); // inicializamos un objeto de tipo Scanner llamado scanner done contendra el objeto in + el
    // formato de codificacion UTF-8 en este caso
    String texto = scanner.next(); // ahora inicializamos una variable de tipo String llamada texto la cual contendra la informacion de scanner
    // con el metodo next
    System.out.println(texto); // e imprimimos el texto
    } 
}
