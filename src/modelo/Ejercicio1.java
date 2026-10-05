/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // declaramos el arreglo para los 10 números enteros
        int[] numeros = new int[10];

        // ciclo de los 10 números
        for (int i = 0; i < 10; i++) {
            try {
                // leemos los num
                String entrada = JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + " de 10:");
                
                // Si el usuario presiona  cancelar o cierra la ventana
                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    return; // sale del programa
                }
                
                numeros[i] = Integer.parseInt(entrada);

            } catch (NumberFormatException e) {
                // ai meten letras o un número demasiado grande
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero válido.");
                i--; // Restamos 1 a 'i' para repetir este mismo turno
            }
        }
        // aquí ponemos los num en orden inverso
        String resultado = "Números en orden inverso:\n";
        // recorremos desde el índice 9 hasta el 0
        for (int i = 9; i >= 0; i--) {
            resultado += "Posición [" + i + "]: " + numeros[i] + "\n";
        }
        // aqui se muestra el resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
