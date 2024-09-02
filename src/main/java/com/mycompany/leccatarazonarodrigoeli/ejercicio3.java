package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;


/**
 *
 * @author leccat
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cat1=0, cat2=0, hip=0;
        try{
            cat1= Double.parseDouble(showInputDialog(null,"Introduce la longitud del 1er cateto en metros", "primer cateto", 3));
            cat2= Double.parseDouble(showInputDialog(null,"Introduce la longitud del 2do cateto en metros", "segundo cateto", 3));
            hip = ((cat1*cat1)+ (cat2*cat2));
            hip = Math.sqrt(hip);
            showMessageDialog(null, "La medida de la hipotenusa es de "+hip+" metros", "hipotenusa", 1);
        }catch(NumberFormatException e){
            showMessageDialog(null,"Ingresa solo datos numéricos","SOLO DATOS NUMÉRICOS",ERROR_MESSAGE);
        };
    }
    
}
