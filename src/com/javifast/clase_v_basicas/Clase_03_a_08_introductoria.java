/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_basicas;

/**
 * 
 * @author javie
 */
public class Clase_03_a_08_introductoria {
    // Clase 3 Hola mundo
   /*
    * para ejecutar mediante consola primero debemos tener el entorno de variable java ubicado en C:\Program Files\Java\jdk1.8.0_144\bin
    * para compilar debemos crear un archivo .java con el metodo main y el nombre de la clase debe ser igual al del archivo creado
    * ejemplo:
    * hola.java
    * dentro del archivo:
    * public class hola{
    *	public static void main(String[] args){
    *		System.out.print("Hola Mundo - Javifast");
    *	}}
    * para compilarlo debemos usar el comando javac + la ruta del archivo hola.java
    * ejemplo: javac D:/hola.java
    * si esto se realiza correctamente deberia aparecer un archivo hola.class en la misma ubicacion del hola.java
    * para ejecutar el archivo compilado debemos escribir java + la ruta del archivo hola.class
    * si todo se realiza correctamente deberiamos visualizar los siguiente:
    * Hola Mundo - Javifast
    *
    */
    public void hola(){
        System.out.println("Hola Mundo, Javier");
    }
    
   /* Metodo main explicacion al detalle
    * todo lo que se encuentra dentro de los parentesis () del metodo main son sus parametros
    * String[] ---> son el tipo de variable array o arreglo
    * args ----> viene a ser el nombre del metodo main por defecto
    * String... ---> se puede utilizar cuando deseamos cambiar el nombre de nuestro metodo main
    * como por ejemplo: main(String... javifast){}
    * 
    */
    public void tipos_datos(){
        int a; // se debe declarar el tipo  y el nombre de la variable seguido de punto y coma ;
        a = 1; // luego para asignarle valor se debe nombrar la variale inicializada con el signo igual seguido del numero en este caso
        String b = "texto"; // tambien se puede declarar el valor dentro de la inicializacion con el signo igual 
        char caracter = 'C'; // a diferencia del tipo String el tipo char solo permite un caracter dentro de comillas simples ejemplo: 'a';
        double c = 1.56; 
        byte d = 0, e=1; // o declarar multiples valores del mismo tipo separandolos por una coma ,
        System.out.println("Tipo byte: "+d); // para llamar la variable solo es necesario declarar el nombre asignado anteriormente y si
        System.out.println("Tipo int: "+a); // esta tiene datos los mostrara en pantalla
        System.out.println("Tipo double: "+c);
        System.out.println("Tipo String: "+b);   
        System.out.println("Tipo char: "+caracter);
    }    
    public void conver_datos(){
        String texto = "99"; // se inicializa variable de tipo String
        // al momento de sumar texto+1 provocara error ya que los tipos no son compatibles para solucionar esto se recurre a las clases Wrapper
        // las clases Wrapper pertenecen a los tipos de variables y sus metodos como el ejemplo a continuacion
        int suma = Integer.parseInt(texto)+1; // aqui se demuestra como el metodo parseInt convierte el texto "99" a tipo entero este metodo esta
        // dentro de la clase Wrapper llamado Integer
        Integer f = null; // la variable Integer permite null y conversiones
        System.out.println("Suma de texto = 99 + 1"+suma+" Ahora veremos un salto de linea \ncomo este tambien podemos usar \"comillas\""
        + "o los espacios como \teste");
    }
    public void tipo_String(){
        String nombre = "Javier";
        String texto = "Faster";
        char captura = nombre.charAt(0);
        int resultado = nombre.compareTo(texto); // si el resultado es igual a 0 quiere decir que son iguales en longuitud
        // si el resultado es mayor a 0 o positivo quiere decir que nombre tiene mayor longuitud que texto
        // y si el resultado es menor a 0 o negativo quiere decir que nombre tiene menor longuitud que texto
        String concatenado = nombre.concat(texto); // este metodo agrega los caracteres de nobmre mas los caracteres de texto mostrandolo
        // en la variable concatenado
        boolean x = nombre.contains("x"); // este metodo muestra un resultado de tipo booleano cuando el caracter se encuentra en el string
        // el caracter boolean es una variale que almacena true = verdarero o false = falso
        int pos = nombre.indexOf("e"); // mostrara la posicion donde encuentre la primera coicidencia con la palabra declarada en indexOf
        String recorte = nombre.substring(3); //captura la palabra desde el indice indicado hasta el indice indicado en caso de no indicar
        //el termino tomara la ultima palabra del texto y lo almacena en una variable tipo string en este caso la variable recorte
        System.out.println("String nombre = "+nombre+"\n"+"String texto = "+texto+"\n"
                           +"Char captura = "+captura+"\n"+"Ejemplo de compareTo = "+resultado+"\n Ejemplo de concatenado ="+concatenado);
        System.out.println("Ejemplo de contains"+x+"\nEjemplo de indexOf = "+pos+"\nEjemplo de substring = "+recorte);
    }
}
