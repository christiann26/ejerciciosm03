/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle3;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Bucle3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int suma_acumulador = 0, contador = 1;

        while (contador <= 5) {
            suma_acumulador = suma_acumulador + contador;
            contador = contador + 1;
            System.out.println(" Contador " + contador + " suma " + suma_acumulador);
        }
        System.out.println("La suma acumulada es " + suma_acumulador);

    }

}
