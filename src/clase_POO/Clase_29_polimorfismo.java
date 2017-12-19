/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_POO;

/**
 * Polimorfismo
 * se define como la alteracion de un metodo de acuerdo al objeto donde se instancia
 * @author javie
 */
public abstract class Clase_29_polimorfismo { // para tener una clase que permita el polimorfismo es necesario utilizar la palabra reservada abstract
    // esto quiere decir: que nuestra clase no tendra instancia de esta clase haciendola abstracta
    
    private String nombre, comida;
    private int edad;

    public Clase_29_polimorfismo(String nombre, String comida, int edad) { 
        this.nombre = nombre;
        this.comida = comida;
        this.edad = edad;
    }

    public Clase_29_polimorfismo(){}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract void alimentarse(); //los metodos abastractos solo pueden ser utilizado en las clases hijas pero si declarado en la clase padre
    public void moverse(){
        System.out.println("El animal se esta moviendo");
    }
}
