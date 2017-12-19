/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_intermedia;

/**  la jerarquia de excepciones viene del siguiente esquema
 * 
 *                                      Throwable
 *         _________________________________|___________________________________
 *        |                                                                     |
 *      Error                        ...................                    Exception
 *        |                                                _____________________|______________
 * Assertion Error                                        |                                    |
 *                                                 RutimeException    ...............     IOException
 *                                  ______________________|_______________                     |
 *                                 |                                      |               EOFException
 *                        ArithmeticException    ..........     NullPointerException
 *  se podria decir que Exception viene de la clase Throwable
 * algo importante es que al especificar la excepcion debe ser del mismo tipo del error que ocurre si no es asi el programa mostrara el error
 * ignorando el catch esto al querer manejar errores especificos en caso de no saber o querer manejar todos los errores se puede utilizar el 
 * Exception e // tambien hay que respetar la jerarquia de las excepciones ya que si declaras una excepcion sobre otra inferior el programa marcara 
 * un error debido a que se esta usando una excepcion que controla las excepciones siguientes
 * @author javie
 */
public class Clase_42_jerarquia_excepciones {
    int a=12,b=0;
    public Clase_42_jerarquia_excepciones(){
                try{
         // proceso
        int c=a/b;
         System.out.print(c); 
        }
        catch(ArithmeticException erro_zero){ // en este caso ejecutamos un exception de tipo aritmetico el cual solo manejara errores matematicos
            // en este caso la llamaremos erro_zero
         // manejo de la expeccion 
         System.out.println("No se permite la divicion por 0"); //podemos imprimir un mensaje customizado
         System.out.println(erro_zero.getMessage()); // aqui llamamos a la excepcion nombrada erro_zero + el metodo .getMessage que nos dara
         // una informacion del error sin detener el programa de forma brusca
        }
    }
}
