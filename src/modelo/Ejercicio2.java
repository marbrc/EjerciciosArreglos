/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *s
 * @author Laura
 * 
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        // arreglo de tamaño 20 para almacenar las letras
        char[] letras = new char[20];
        char letraBuscar;
        int pos;

        // llenamos el arreglo con 20 letras válidas
        for (int i = 0; i < 20; i++) {
            String entrada = JOptionPane.showInputDialog("Ingrese la letra " + (i + 1) + " de 20:");

            // validación por si cierran la ventana o le dan en cancelar
            if (entrada == null || entrada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return;
            }

            char c = entrada.charAt(0);

            // validamos que realmente sea una letra (A-Z, a-z)
            if (Character.isLetter(c)) {
                letras[i] = c;
            } else {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar una letra (no números ni símbolos).");
                i--; // repetimos la posición actual
            }
        }

        // pedimos la letra a buscar (con validación de solo letras)
        while (true) {
            String entradaBuscar = JOptionPane.showInputDialog("¿Qué letra desea buscar?");
            
            if (entradaBuscar == null || entradaBuscar.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Búsqueda cancelada.");
                return;
            }

            letraBuscar = entradaBuscar.charAt(0);

            if (Character.isLetter(letraBuscar)) {
                break; // rs una letra válida salimos de la validación
            } else {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar una letra válida para buscar.");
            }
        }

        // llamamos al método buscar
        pos = buscar(letras, letraBuscar);

        // mostramos el resultado
        if (pos != -1) {
            JOptionPane.showMessageDialog(null, "La letra '" + letraBuscar + "' se encuentra en la posición (índice): " + pos);
        } else {
            JOptionPane.showMessageDialog(null, "La letra '" + letraBuscar + "' NO se encuentra en el arreglo.");
        }
    }

    // metodo para realizar la búsqueda secuencial de la letra
    private static int buscar(char[] arreglo, char letra) {
        int pos = -1; // -1 indica que no se encontró

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == letra) {
                pos = i; // guardamos el índice donde la encontramos
                break;   // getenemos la búsqueda al encontrar la primera coincidencia
            }
        }

        return pos;
                
    }
}