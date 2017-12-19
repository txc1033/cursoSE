/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_intermedia;

import java.util.HashMap;

/**
 * HasMap o diccionario
 * @author javie
 */
public class Clase_39_hashmap {
    
    public void diccionario (){
        
        HashMap diccionario = new HashMap(); // se inicializa la clase HasMap en constructor llamado diccionario esta clase requiere importar 
        diccionario.put("nombre","Javier"); // se agrega elementos con el metodo .put("indice","valor");
        diccionario.put("nick","Javifast"); // se agrega elementos con el metodo .put("indice","valor");
        diccionario.put("codigo","20171031110"); // se agrega elementos con el metodo .put("indice","valor");
        
       String contenido = diccionario.get("codigo").toString(); // para llamar un valor debemos apoyarnos del metodo .get("indice");
       // y para almacenarlo en una variable habra que usar la conversion correspondiente en este caso .toString para almacenarlo en la variable
       // contenido
       System.out.println(contenido); // imprimimos el resultado
    }
}
