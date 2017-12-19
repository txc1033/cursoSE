/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_conocimiento_POO;

/**
 * Encapsulacion
 * se define como la ocultacion del estado o de los datos miembro de un objeto de forma que solo es modificado 
 * por los mismos mediante los metodos definidos para dicho objetos
 * @author javier
 */
public class Clase_30_encapsulacion { 
    
    private String texto = "Hola, javier, maldonado"; // en ecapsulamiento abarca todo los metodos dentro de las clases 
    String[] vector = texto.split(",");  //en este caso utilizamos el metodo split de la variable string
    /** este esta implementado de una forma
     * public String[] split(String regex) {
     * return split(regex, 0);
     * }
     * pero no lo visualizamos ya que el encapsulamiento nos permite utilizar los metodos sin importar como se hayan implementado al momento
     * de crearlos
     */
    public Clase_30_encapsulacion(){
      try{ 
    for(int i=0;i<=texto.length();i++){
        System.out.print(vector[i]);
    }
      }
    catch(Exception e){}
    }
    
    
    
}