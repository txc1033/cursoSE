/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_Basicas;

/**
 *
 * @author javie
 */
public class Clase_11_a_13_ciclos {
    
    
    public void ciclo_while(int fin){ // el ciclo while requiere que se inicialize una variable de tipo int generalmente
    int condicion = 0; //una vez inicializado la variable se procede a
    while(condicion < fin){ // crear la sentencia muy similar a la if solo que aqui cambiar por la palabra reservada while 
        // luego ingresar una condicion valida en este caso mientras condicion sea menor a 4
        // nota en caso de no poner una condicion valida podria generar un bucle infinito o provocar un error
    System.out.println("ciclo while Hi XD "+condicion); // este mensaje se mostrara la cantidad de veces que dure la condicion ademas 
    // imprimira el numero de la condicion en este caso desde el 0 al 3
    condicion++;} //finalmente se debe incrementar la condicion o poner un valor de salida para evitar el bucle
}
   public void ciclo_for(int fin){ // el ciclo for requiere que se inicialize una variable de tipo int generalmente dentro de su sentencia
       // generalmente se usa para recorrer arreglos
    for(int condicion = 0;condicion < fin;condicion++){ // como pueden observar primero se crea la sentencia for dentro de esta se inicializa 
        // la variable en el numero que estime conveniente separado por punto y coma ; se coloca la condicion ; y finalmente el incremento  
        // nota en caso de no poner una condicion valida podria generar un error ya que este bucle exige estos tres parametros dentro de la
        // sentencia o en la estructura del ciclo
    System.out.println("ciclo for Hi XD "+condicion); // este mensaje se mostrara la cantidad de veces que dure la condicion
    } // tambien existe el form mejorado
    // este es utilizado para recorrer arreglos
      String[] array = {"Ciclo for mejorado:","Primero","->","Segudno","->","Tercero"}; //primero iniciaremos un arreglo llamado array
      for (String c : array){ // seguido creamos nuestro ciclo form inicializando una variable tipo string llamada c la cual almacenara
          // los valores del arreglo
          System.out.print(c+" "); //seguido los imprimimos
      }
   } 
   
       public void ciclo_dowhile(int condicion){ // el ciclo do while requiere que se inicialize una variable de tipo int generalmente
    //una vez inicializado la variable se procede a
    do{ // de inicializa por do 
    System.out.println("ciclo do while Hi XD "+condicion); // este mensaje se mostrara la cantidad de veces que dure la condicion 
    condicion++; //finalmente se debe incrementar la condicion o poner un valor de salida para evitar el bucle
    }while(condicion < 4); //finalmente valida que se cumpla la condicion
    // debido a esto el ciclo do while te garantiza que se ejecute almenos una vez inicializado
}
    
}
