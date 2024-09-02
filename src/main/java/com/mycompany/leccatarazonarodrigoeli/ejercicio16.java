package com.mycompany.leccatarazonarodrigoeli;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author leccat
 */
public class ejercicio16 {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int numeroIngresado, contadorDivisores;
        String mensajeResultado;
        int numeroPruebas;
        
        for (numeroPruebas = 1; numeroPruebas <= 3; numeroPruebas++) {
            numeroIngresado = Integer.parseInt(showInputDialog(null, 
                    "INGRESA EL NÚMERO " + numeroPruebas, 
                    "Número " + numeroPruebas, 3));
            mensajeResultado = numeroIngresado + " es ";

            contadorDivisores = 0;
            for (int divisor = 1; divisor <= numeroIngresado; divisor++) {
                if (numeroIngresado % divisor == 0) {
                    contadorDivisores++;
                }
            }

            if (contadorDivisores == 2) {
                mensajeResultado += "primo, ";
            } else {
                mensajeResultado += "no es primo, ";
            }

            if (numeroIngresado % 2 == 0) {
                mensajeResultado += "par";
            } else {
                mensajeResultado += "impar";
            }

            showMessageDialog(null, mensajeResultado, "Resultado", 1);
        }
    }
}
