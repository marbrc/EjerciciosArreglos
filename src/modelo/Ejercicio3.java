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

public class Ejercicio3 {

    public static void main(String[] args) {
        // pedimos al usuario cuantos números quiere ingresar
        int n = 0;
        while (n <= 0) {
            try {
                String entradaN = JOptionPane.showInputDialog(
                        "¿Cuántos números reales desea ingresar?");
                if (entradaN == null) return; // si cancela
                
                n = Integer.parseInt(entradaN);
                if (n <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "Debe ingresar una cantidad mayor a 0.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Error: Ingrese un número entero válido.");
            }
        }

        // creamos el arreglo de numeros reales con double con el tamaño que se pide
        double[] numeros = new double[n];

        // llenamos el arreglo
        for (int i = 0; i < n; i++) {
            try {
                String entrada = JOptionPane.showInputDialog(
                        "Ingrese el número " + (i + 1) + " de " + n + ":");
                if (entrada == null) return;

                // parseDouble permite números con decimales 
                numeros[i] = Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Error: Ingrese un número real válido.");
                i--; // repetimos la casilla si hay error
            }
        }

        // llamamos al método que busca el mayor
        double mayor = obtenerMayor(numeros, n);

        // mostramos el resultado
        JOptionPane.showMessageDialog(null,
                "El número mayor en el arreglo es: " + mayor);
    }

    // metofo: un arreglo de num reales double devuelve el mayor
    public static double obtenerMayor(double[] arreglo, int n) {
        // Tomamos el primer elemento como el mayor inicial
        double mayor = arreglo[0];

        // recorremos desde la posición 1 hasta el final
        for (int i = 1; i < n; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i]; // actualizamos si encontramos uno más grande
            }
        }

        return mayor;
    }
}