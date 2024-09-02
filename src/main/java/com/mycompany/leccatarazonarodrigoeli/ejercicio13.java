package com.mycompany.leccatarazonarodrigoeli;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author leccat
 */
public class ejercicio13 {

    public static void main(String[] args) {
        int edad = Integer.parseInt(showInputDialog(null, 
                "INGRESA TU EDAD", 
                "Edad", 3));
        double ingresos = Double.parseDouble(showInputDialog(null, 
                "INGRESA TUS INGRESOS MENSUALES (EN SOLES)", 
                "Ingresos", 3));

        if (edad > 18 && ingresos >= 1300) {
            showMessageDialog(null, "TIENES QUE TRIBUTAR", "Resultado", 1);
        } else {
            showMessageDialog(null, "NO TIENES QUE TRIBUTAR", "Resultado", 1);
        }
    }
}
