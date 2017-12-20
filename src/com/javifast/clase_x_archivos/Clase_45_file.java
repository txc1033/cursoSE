/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_x_archivos;

import java.io.File;

/** fuente o --------------> lectura de archivo  ----------------->
 *  recurso
 *  Source -------------> InputStream / Reader -----------------> Program  // proceso de lectura
 *  Progam -------------> OutStream / Writer -----------------> Destination // proceso de escritura
 * 
 * @author javie
 */
public class Clase_45_file {
    
    public void archivo_existe() {
    File archivo = new File("src/textos/primer texto.txt"); // primero inicializamos el objeto de tipo file llamado archivo + la ruta del del elemento
    // que deseamos abrir
    
   boolean existe = archivo.exists(); // el metodo .exists nos permite comprobar que nuestro archivo exista
   // existe el metodo mkdir(); que nos permite crear una carpeta
   // tambien el metodo mkdirs(); para crear muchas sub carpetas
   // el metodo renameTo(); para renombrar el archivo
   // el metodo delete(); para borrar el archivo
   if (existe == true){ // se crea sentendia en caso de que existe sea igual a true
   System.out.println("Tu archivo Existe"); // imprimira este mensaje
   }else{ // en caso contrario
   System.out.println("Tu archivo no Existe, deberias crealo e intentar denuevo"); // imprimira este menraje
   }
   
}
}
