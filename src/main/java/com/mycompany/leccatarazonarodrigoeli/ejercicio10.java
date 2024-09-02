package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author leccat
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    try{
    int num;
    num= Integer.parseInt(showInputDialog(null,"introduce un número entero", "diferenciador par - impar", 3));
    if (num==0 ){
        showMessageDialog(null, "el numero es 0, no es par ni impar", "diferenciador par - impar", 1);
    }else {
    if (num ==1){
        showMessageDialog(null, "el numero es impar", "diferenciador par - impar", 1);
    }else {
    if (num%2==0){
        showMessageDialog(null, "el numero es par", "diferenciador par - impar", 1);
    }else {
        showMessageDialog(null, "el numero es impar", "diferenciador par - impar", 1);
    }
    }
    }
}catch(NumberFormatException e){
            showMessageDialog(null,"Ingresa solo datos numéricos","SOLO DATOS NUMÉRICOS",ERROR_MESSAGE);};
}
}