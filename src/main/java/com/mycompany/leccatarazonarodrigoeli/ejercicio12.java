package com.mycompany.leccatarazonarodrigoeli;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author leccat
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bebida = 0, temperatura = 0, azucar = 0, cantidad = 0, pago = 0;
        double precioBase = 0.0, precioTotal = 0.0;

        bebida = Integer.parseInt(showInputDialog(null, 
                "INGRESA EL NÚMERO CORRESPONDIENTE A LA BEBIDA A TOMAR" + "\n" +
                "1. Té (S/ 3.00)" + "\n" +
                "2. Café (S/ 5.00)" + "\n" +
                "3. Agua (S/ 2.00)", 
                "Opciones", 3));

        switch (bebida) {
            case 1:
                precioBase = 3.00;
                break;
            case 2:
                precioBase = 5.00;
                break;
            case 3:
                precioBase = 2.00;
                break;
            default:
                showMessageDialog(null, "Opción no válida", "Error", 0);
                return;
        }

        temperatura = Integer.parseInt(showInputDialog(null, 
                "SELECCIONA LA TEMPERATURA" + "\n" +
                "1. Helada (+ S/ 1.00)" + "\n" +
                "2. Al tiempo (sin costo adicional)" + "\n" +
                "3. Caliente (+ S/ 1.00)", 
                "Opciones", 3));

        switch (temperatura) {
            case 1:
                precioBase += 1.00;
            case 2:
                break;
            case 3:
                precioBase += 1.00;
                break;
            default:
                showMessageDialog(null, "Opción no válida", "Error", 0);
                return;
        }

        azucar = Integer.parseInt(showInputDialog(null, 
                "SELECCIONA EL NIVEL DE AZÚCAR" + "\n" +
                "1. Sin azúcar (sin costo adicional)" + "\n" +
                "2. Con azúcar (+ S/ 0.50)", 
                "Opciones", 3));

        switch (azucar) {
            case 1:
                break;
            case 2:
                precioBase += 0.50;
                break;
            default:
                showMessageDialog(null, "Opción no válida", "Error", 0);
                return;
        }

        cantidad = Integer.parseInt(showInputDialog(null, 
                "INGRESA LA CANTIDAD DE BEBIDAS QUE DESEAS", 
                "Cantidad", 3));

        precioTotal = precioBase * cantidad;

        pago = Integer.parseInt(showInputDialog(null, 
                "SELECCIONA EL MÉTODO DE PAGO" + "\n" +
                "1. Efectivo (sin costo adicional)" + "\n" +
                "2. Tarjeta (recarga del 3%)" + "\n" +
                "3. Yape (sin costo adicional)", 
                "Opciones", 3));

        switch (pago) {
            case 1:
                break; 
            case 2:
                precioTotal *= 1.03;
                break;
            case 3:
                break;
            default:
                showMessageDialog(null, "Opción no válida", "Error", 0);
                return;
        }

        showMessageDialog(null, "El total a pagar en soles es de" + precioTotal, "Total", 1);
    }
}
