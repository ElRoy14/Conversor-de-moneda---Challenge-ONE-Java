/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversor.de.moneda;

/**
 *
 * @author RONAL
 */

import javax.swing.JOptionPane;
        
        
public class ConversorDeMoneda {

    public static void main(String[] args) {
        
        JOptionPane pane = new JOptionPane();
        
        Object [] conversores ={"Conversor de moneda","Conversor de unidades"};
        
        Object opcion = pane.showInputDialog(null,"Selecciona un conversor", "Elegir",JOptionPane.QUESTION_MESSAGE,null,conversores, conversores[0]);
        JOptionPane.showMessageDialog(null, "El conversor es " + opcion);
        
    }
}
