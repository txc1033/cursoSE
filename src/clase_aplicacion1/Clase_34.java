/*
 * Un banco tieen 3 clientes que pueden hacer depositos y retiros
 * tambien el banco requiere que al final del dia se calcule la cantidad de dinero que hay depositada
 */
package clase_aplicacion1;

import java.util.Scanner;

/**
 * tenemos: 
 * - Persona
 * - Banco
 * @author javie
 */
public class Clase_34 {
    
    Clase_34_Banco banco = new Clase_34_Banco();
    
    Scanner sc = new Scanner(System.in);
    
    
    public void aplicacion1(){
    System.out.println("--------------------------------------");
    System.out.println("----Bienvenido al Banco XDproXD-------");
    System.out.println("----Ingrese su numero de cuenta-------");
    int cuenta = sc.nextInt();
    String operacion = "";
    
    switch(cuenta){
        case 1:
            System.out.println("Bienvenido "+banco.getPer1().getNombre());
            System.out.println("Ingrese la opcion a realizar");
            System.out.println("A-Depositar");
            System.out.println("B-Retirar");
            operacion = sc.next();
            switch (operacion.toUpperCase()){
                case "A":
                System.out.println("--------------------------------------");
                System.out.println("----Ingrese el monto a Depositar------");
                double montoDeposito = sc.nextDouble();
                double montoAnterior = banco.getPer1().getMonto();
                banco.getPer1().setMonto(montoAnterior + montoDeposito);
                System.out.println("El monto final es "+ banco.getPer1().getMonto());
                break;
                case "B":
                System.out.println("--------------------------------------");
                System.out.println("-----Ingrese el monto a Retirar-------");
                double montoRetiro = sc.nextDouble();
                double montoAnteriorRetiro = banco.getPer1().getMonto();
                banco.getPer1().setMonto(montoAnteriorRetiro - montoRetiro);
                System.out.println("El monto final es "+ banco.getPer1().getMonto());                    
                break;
            }
            break;
        case 2:
            System.out.println("Bienvenido "+banco.getPer2().getNombre());
            System.out.println("Ingrese la opcion a realizar");
            System.out.println("A-Depositar");
            System.out.println("B-Retirar"); 
            operacion = sc.next();
            switch (operacion.toUpperCase()){
                case "A":
                System.out.println("--------------------------------------");
                System.out.println("----Ingrese el monto a Depositar------");
                double montoDeposito = sc.nextDouble();
                double montoAnterior = banco.getPer2().getMonto();
                banco.getPer2().setMonto(montoAnterior + montoDeposito);
                System.out.println("El monto final es "+ banco.getPer2().getMonto());
                break;
                case "B":
                System.out.println("--------------------------------------");
                System.out.println("-----Ingrese el monto a Retirar-------");
                double montoRetiro = sc.nextDouble();
                double montoAnteriorRetiro = banco.getPer2().getMonto();
                banco.getPer2().setMonto(montoAnteriorRetiro - montoRetiro);
                System.out.println("El monto final es "+ banco.getPer2().getMonto());                    
                break;
            }
            break;
        case 3:
            System.out.println("Bienvenido "+banco.getPer3().getNombre());
            System.out.println("Ingrese la opcion a realizar");
            System.out.println("A-Depositar");
            System.out.println("B-Retirar");  
            operacion = sc.next();
            switch (operacion.toUpperCase()){
                case "A":
                System.out.println("--------------------------------------");
                System.out.println("----Ingrese el monto a Depositar------");
                double montoDeposito = sc.nextDouble();
                double montoAnterior = banco.getPer3().getMonto();
                banco.getPer3().setMonto(montoAnterior + montoDeposito);
                System.out.println("El monto final es "+ banco.getPer3().getMonto());
                break;
                case "B":
                System.out.println("--------------------------------------");
                System.out.println("-----Ingrese el monto a Retirar-------");
                double montoRetiro = sc.nextDouble();
                double montoAnteriorRetiro = banco.getPer3().getMonto();
                banco.getPer3().setMonto(montoAnteriorRetiro - montoRetiro);
                System.out.println("El monto final es "+ banco.getPer3().getMonto());                    
                break;
            }            
            break;
        default:
            System.out.println("Cuenta no registrada");
            System.exit(0);
    }
     System.out.print("El total del banco es: ");
     System.out.println(banco.getPer1().getMonto()+banco.getPer2().getMonto()+banco.getPer3().getMonto());
    }
   
}
