/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_POO;

/**
 *
 * @author javie
 */
public class Clase_29_hijo extends Clase_29_polimorfismo{  
    private String raza;                    
    
    public Clase_29_hijo(String raza, String nombre, String comida, int edad) {
        super(nombre, comida, edad); 
        this.raza = raza;
    }
    
    
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
     
    public void mostrar(){
        System.out.println(getNombre()+"-"+getRaza()+"-"+getEdad());
    }

    @Override // quiere decir que estoy sobre escribiendo el metodo de la clase padre
    public void alimentarse() {
        System.out.println("Me alimento de "+getComida());
    }
}