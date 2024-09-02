package com.mycompany.leccatarazonarodrigoeli;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author leccat
 */
public class ejercicio18 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double rentaAnual;
        String tipoImpositivoAplicado;

        rentaAnual = Double.parseDouble(showInputDialog(null, 
                "INGRESA TU RENTA ANUAL", 
                "Renta Anual", 3));

        if (rentaAnual < 10000) {
            tipoImpositivoAplicado = "5%";
        } else if (rentaAnual < 20000) {
            tipoImpositivoAplicado = "15%";
        } else if (rentaAnual < 35000) {
            tipoImpositivoAplicado = "20%";
        } else if (rentaAnual < 60000) {
            tipoImpositivoAplicado = "30%";
        } else {
            tipoImpositivoAplicado = "45%";
        }

        showMessageDialog(null, "El tipo impositivo es: " + tipoImpositivoAplicado, "Resultado", 1);
    }
}
