/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_POO;

/**
 * Metodo de acceso Get & Set
 * @author javie
 */
public class Clase_27_get_set {
    private String nombre,color,codigo; // generalmente se utiliza con variables declarada privada
    
    public void setNombre(String nombre){ // se crea metodo de ingreso set + el nombre de la variable con su primera letra en mayuscula 
        this.nombre = nombre;
    }
    public String getNombre(){ // se crea metodo de llamado get + el nombre de la variable con su primera letra en mayuscula
        return this.nombre;
    }
    // un atajo que tiene netbeans para generar los metods get & set es utilizando la combinacion de teclas alt+ins y  eligiento
    // generate set and getter seleccionando las variables a usar con este metodo
    // este metodo permite acceder a las variables privadas
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCodigo() {
       if(codigo == null){ // se crea sentencia de tipo if que al detectar una variable null en caso contrario se omite
            codigo = "Sin Codigo"; //  la cambia al mensaje "Sin Codigo";
        }
        return codigo; //retorna el valor de codigo
    }

    public void setCodigo(String codigo) { 
        this.codigo = codigo;
    }
    public void mostrar(){
        System.out.println(getNombre()+"-"+getColor()+"-"+getCodigo());
    }
}
