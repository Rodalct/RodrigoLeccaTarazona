package com.mycompany.leccatarazonarodrigoeli;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author leccat
 */
public class ejercicio17 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ladoUno, ladoDos, ladoTres;

        ladoUno = Integer.parseInt(showInputDialog(null, 
                "INGRESA EL PRIMER LADO", 
                "Lado 1", 3));
        ladoDos = Integer.parseInt(showInputDialog(null, 
                "INGRESA EL SEGUNDO LADO", 
                "Lado 2", 3));
        ladoTres = Integer.parseInt(showInputDialog(null, 
                "INGRESA EL TERCER LADO", 
                "Lado 3", 3));

        if (ladoUno == ladoDos && ladoDos == ladoTres) {
            showMessageDialog(null, "El triángulo es Equilátero", "Resultado", 1);
        } else if (ladoUno == ladoDos || ladoDos == ladoTres || ladoUno == ladoTres) {
            showMessageDialog(null, "El triángulo es Isósceles", "Resultado", 1);
        } else {
            showMessageDialog(null, "El triángulo es Escaleno", "Resultado", 1);
        }
    }
}
