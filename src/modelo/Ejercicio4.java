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
public class Ejercicio4 {

    public static void main(String[] args) {
        // pedimos al usuario cuantos números quiere ingresar
        int n = 0;
        while (n <= 0) {
            try {
                String entradaN = JOptionPane.showInputDialog(
                        "¿Cuántos números enteros desea ingresar?");
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

        // creamos el arreglo de números enteros con el tamaño que se pide
        int[] numeros = new int[n];

        // llenamos el arreglo
        for (int i = 0; i < n; i++) {
            try {
                String entrada = JOptionPane.showInputDialog(
                        "Ingrese el número entero " + (i + 1) + " de " + n + ":");
                if (entrada == null) return;

                numeros[i] = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Error: Ingrese un número entero válido.");
                i--; // repetimos la casilla si hay error
            }
        }

        // llamamos al método que calcula el promedio
        double promedio = calcularPromedio(numeros, n);

        // mostramos el resultado
        JOptionPane.showMessageDialog(null,
                "El promedio de los números en el arreglo es: " + promedio);
    }

    // método: dado un arreglo de enteros devuelve el promedio
    public static double calcularPromedio(int[] arreglo, int n) {
        int suma = 0;

        // recorremos el arreglo para sumar sus elementos
        for (int i = 0; i < n; i++) {
            suma += arreglo[i];
        }

        // retornamos la suma dividida entre n convertida a double para no perder decimales
        return (double) suma / n;
    }
}
