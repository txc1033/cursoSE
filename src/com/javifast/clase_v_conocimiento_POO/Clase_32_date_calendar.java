/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_v_conocimiento_POO;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author javie
 */
public class Clase_32_date_calendar {

          
          public void mostrarDate(){
          Date fecha = new Date(); // se crea un constructor de la clase Date llamado Fecha nota: los metodos tachados son metodos obsoletos
          // esto quiere decir que no son optimos para usarse de igual manera funcionan pero es recomendado usar metodos actualizados
          int anio = fecha.getYear();
          int mes = fecha.getMonth()+1;
          int dia = fecha.getDay()+3;
           System.out.print(anio+1900);
           System.out.println("/"+mes+"/"+dia+ " <- Esto es Date");
          // su implementacion es efectiva pero no optima
          }
          public void mostrarCalendar(){
          Calendar calendario = Calendar.getInstance(); // este metodo .getInstance es statico ya que podemos acceder directamente por la clase
          int anio = calendario.get(Calendar.YEAR); // esto hace que el metodo sea mas optimo de ingresar
          int mes = calendario.get(Calendar.MONTH)+1;
          int dia = calendario.get(Calendar.DAY_OF_MONTH);
          System.out.println(anio+"/"+mes+"/"+dia+" <- Esto es Calendar");   
          }
}
