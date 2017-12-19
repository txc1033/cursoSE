/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_aplicacion1;

/**
 *
 * @author javie
 */
public class Clase_34_Banco {
  private Clase_34_persona per1,per2,per3;  
  
  public Clase_34_Banco(){
    per1 = new Clase_34_persona();  
    per1.setCuenta(1);
    per1.setNombre("franco");
    per1.setMonto(500.0);
    per2 = new Clase_34_persona();
    per2.setCuenta(2);
    per2.setNombre("sergio");
    per2.setMonto(900.0);
    per3 = new Clase_34_persona();
    per3.setCuenta(3);
    per3.setNombre("Pepe");
    per3.setMonto(250.0);
  }

    public Clase_34_persona getPer1() {
        return per1;
    }

    public void setPer1(Clase_34_persona per1) {
        this.per1 = per1;
    }

    public Clase_34_persona getPer2() {
        return per2;
    }

    public void setPer2(Clase_34_persona per2) {
        this.per2 = per2;
    }

    public Clase_34_persona getPer3() {
        return per3;
    }

    public void setPer3(Clase_34_persona per3) {
        this.per3 = per3;
    }
  
}
