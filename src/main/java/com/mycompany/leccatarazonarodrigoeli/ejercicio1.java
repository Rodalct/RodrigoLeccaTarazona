package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author leccat
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        nombre = showInputDialog(null,"¿Cuál es tu nombre? ","Nombre de usuario ",3);
        showMessageDialog(null,"¡Hola "+nombre+ " !","saludo",1);
    }
    
}
