/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_intermedia;

/**
 * los metodos throw y throws es utilizado para denegar excepciones para poder programar en capas es decir denegar una excepcion de una capa inferior
 * para que no afecte a las capas superiores
 * @author javie
 */
public class Clase_43_throw_throws {
     private void metodo1(){
         try {
             metodo2();
         }catch(Exception error){
             
         }
     }
      private void metodo2(){
         try {
             metodo3();
         }catch(Exception error){
          System.out.println("metodo 2 "+error.getMessage());
         }
     }
       private void metodo3() throws Exception { // throws necesita la especificacion de una clase
         try {
             int divicion = 1/0;
         }catch(Exception error){
            //throw new Exception("enviando excepcion");  // throw necesita de un objeto instanciado o instanciar uno nuevo
            throw error; // tambien se puede escribir de esta forma donde indicamos throw + el objeto instanciado en catch
            // con esto estamos mandando el error a la capa superior
         }}
                 private void lanzar_error(){
             //tambien podemos inicializar excepciones con
           throw new ArithmeticException();
         }
     
       public Clase_43_throw_throws (){
           this.metodo1();
           //this.lanzar_error(); // y aqui podemos llamarlo si lo deseamos
       }
     
}
