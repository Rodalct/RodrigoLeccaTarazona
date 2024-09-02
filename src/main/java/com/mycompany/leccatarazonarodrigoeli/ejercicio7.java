package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author leccat
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double min=0, hor=0, minreal=0;
        min = Double.parseDouble(showInputDialog(null, "ingresa la cantidad de minutos", "de minutos a horas y minutos", 3));
        hor= Math.floor(min/60);
        minreal= min%60;
        showMessageDialog(null,"son "+hor+" horas con "+minreal+" minutos", "de minutos a horas y minutos",1);
    }
    
}
