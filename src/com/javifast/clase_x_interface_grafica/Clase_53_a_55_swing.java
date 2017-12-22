/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.clase_x_interface_grafica;

import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author javie
 */
public class Clase_53_a_55_swing {
    public Clase_53_a_55_swing(){
    JFrame ventana = new JFrame("Ventana swing (Clase 53)"); // para crear ventanas debemos importanel paquete javax.swing.Jframe; o 
        // puede exportar todo el paquete *
        ventana.setSize(350,200); // ajustamos el tamaño de la ventana
        ventana.setVisible(true); // y mostramos la ventana con el metodo setvisible donde su valor es booleano
        
       JPanel panel = new JPanel();
        
        JButton boton = new JButton("Saludar (Clase 54)");
        panel.add(boton);
        JButton botonsalir = new JButton("Salir");
        panel.add(botonsalir);
        ventana.add(panel);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        boton.addActionListener((java.awt.event.ActionEvent e) -> {
            String captura = JOptionPane.showInputDialog(null, "Ingrese nombre (Clase 55)");
            if (captura != null){
                JOptionPane.showMessageDialog(null,"Deverias ingresar tu nombre :C");}
            else{JOptionPane.showMessageDialog(null,"Hola "+ captura);}
    });
        botonsalir.addActionListener((java.awt.event.ActionEvent e) -> {
            ventana.dispatchEvent(new WindowEvent(ventana, WindowEvent.WINDOW_CLOSING));
    });
}
}
