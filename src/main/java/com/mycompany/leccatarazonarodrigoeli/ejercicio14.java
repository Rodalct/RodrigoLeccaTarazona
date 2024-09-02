package com.mycompany.leccatarazonarodrigoeli;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author leccat
 */
public class ejercicio14 {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreUsuario, generoUsuario, grupoAsignado;
        char primeraLetraNombre;

        nombreUsuario = showInputDialog(null, 
                "INGRESA TU NOMBRE", 
                "Nombre", 3);
        generoUsuario = showInputDialog(null, 
                "INGRESA TU GÉNERO (M para Masculino, F para Femenino)", 
                "Género", 3);
        primeraLetraNombre = nombreUsuario.toUpperCase().charAt(0);

        if ((generoUsuario.equals("F") && primeraLetraNombre < 'M') || 
            (generoUsuario.equals("M") && primeraLetraNombre > 'N')) {
            grupoAsignado = "A";
        } else {
            grupoAsignado = "B";
        }

        showMessageDialog(null, "Perteneces al grupo " + grupoAsignado, "Resultado", 1);
        // TODO code application logic here
    }
}
