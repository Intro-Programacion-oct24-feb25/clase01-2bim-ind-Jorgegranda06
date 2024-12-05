/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // Primer valor en la primera columna
        for (int i = 30; i >= 10; i--) {
            // Para cada valor de i, se imprime una fila
            for (int j = 0; j < 4; j++) {
                // Imprime el valor actual de la columna correspondiente
                System.out.print(i - j * 2);
                // Si no es la última columna, imprime un guion
                if (j < 3) {
                    System.out.print("-");
                }
            }
            // Salta a la siguiente línea después de cada fila
            System.out.println();
        }
    }
}

