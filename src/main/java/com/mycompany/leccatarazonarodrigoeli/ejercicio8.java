package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author leccat
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double costoDeCompra=0;
        costoDeCompra= Integer.parseInt(showInputDialog(null,"Ingresa el costo total de compra en soles", "descuento del 15%",3));
        costoDeCompra= costoDeCompra*75/100;
        showMessageDialog(null,"¡El precio con el descuento del 15% sería de "+costoDeCompra+" soles!!","descuento",1);
    }
    
}
