
package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author leccat
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    try{
        double far=0, cel=0;
        far= Double.parseDouble( showInputDialog(null,"ingresa la temperatura en grados Farenheit","Farenheit a Celsius", 3));
        cel =  far-32;
        cel = cel * 5/9;
        showMessageDialog(null,far+"° Farenheit equivalen a "+cel+"° Celsius"+ "\n"+"(    (F°-32)*(5/9)= C°    )");
        
    }catch(NumberFormatException e){
            showMessageDialog(null,"Ingresa solo datos numéricos","SOLO DATOS NUMÉRICOS",ERROR_MESSAGE);};
}
}