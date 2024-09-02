package com.mycompany.leccatarazonarodrigoeli;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author leccat
 */
public class ejercicio15 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroIngresado, resultadoFactorial;
        int contador;

        numeroIngresado = Integer.parseInt(showInputDialog(null, 
                "INGRESA UN NÚMERO", 
                "Número", 3));
        resultadoFactorial = 1;

        for (contador = 1; contador <= numeroIngresado; contador++) {
            resultadoFactorial *= contador;
        }

        showMessageDialog(null, "El factorial de " + numeroIngresado + " es " + resultadoFactorial, "Resultado", 1);
    // TODO code application logic here
    }
    
}
