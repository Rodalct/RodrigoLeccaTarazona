package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author leccat
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1=0, num2=0, sum=0, res=0, mul=0, div = 0;
        try{
        num1= Double.parseDouble(showInputDialog(null, "Ingresa el primer número", "primer número", 3));
        num2= Double.parseDouble(showInputDialog(null," Ingresa el segundo número", "segundo número", 3));
        sum=num1+num2;
        res=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        showMessageDialog(null, "OPERACIONES REALIZADAS CON AMBOS NÚMEROS Y SU RESULTADO:"+ "\n"+
                "suma: "+num1+" + "+num2+" = "+sum+"\n"+
                "resta: "+num1+" - "+num2+" = "+res+"\n"+
                "multiplicación: "+num1+" * "+num2+" = "+mul+"\n"+
                "división: "+num1+" / "+num2+" = "+div, "operaciones", 1);
    
        }catch(NumberFormatException e){showMessageDialog(null,"Ingresa solo datos numéricos","SOLO DATOS NUMÉRICOS",ERROR_MESSAGE);};
    }
    
}
