package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author leccat
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base = 0, altura = 0, area = 0, perimetro = 0;
        try {base = Double.parseDouble( showInputDialog(
                null,"Introduce la longitud de la base de rectangulo en metros","base",3));
        altura = Double.parseDouble( showInputDialog(
                null,"Introduce la longitud de la altura de rectangulo en metros","altura",3));
        perimetro = (2*base)+(2*altura);
        area = base*altura;
        showMessageDialog(null,
                "El área del rectangulo es de "+area+" metros cuadrados"+ "\n"+
                 "El perímetro del rectangulo es de "+perimetro+" metros", "area y perímetro", 1);
        }catch(NumberFormatException e){
        showMessageDialog(null,"Ingresa solo datos numéricos","SOLO DATOS NUMÉRICOS",ERROR_MESSAGE);
        };
    }
    
}
