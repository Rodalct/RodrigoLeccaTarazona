package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author leccat
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1=0, num2=0, num3=0, media= 0; 
        try{
            num1= Double.parseDouble(showInputDialog(null, "Ingresa el primer número", "primer número", 3));
            num2= Double.parseDouble(showInputDialog(null," Ingresa el segundo número", "segundo número", 3));
            num3= Double.parseDouble(showInputDialog(null, "Ingresa el tercer número", "tercer número", 3));
            media= (num1+num2+num3)/3;
            showMessageDialog(null, "la media es de "+media,"MEDIA", 3);
        }catch(NumberFormatException e){
            showMessageDialog(null,"Ingresa solo datos numéricos","SOLO DATOS NUMÉRICOS",ERROR_MESSAGE);};
    }
    
}
