package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author leccat
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=0, num2=0, div=0;
        try{
        num1= Integer.parseInt(showInputDialog(null, "Ingresa el primer número entero", "primer número", 3));
        num2= Integer.parseInt(showInputDialog(null," Ingresa el segundo número entero", "segundo número", 3));
        div=num1/num2;
        showMessageDialog(null, "DIVISION DE LOS NÚMEROS INGRESADOS:"+ "\n"+
                "división: "+num1+" / "+num2+" = "+div, "división", 1);
    
        }catch(ArithmeticException e){showMessageDialog(null,"No se admite la división entre 0","Error",ERROR_MESSAGE);};
        
    }
    
}
