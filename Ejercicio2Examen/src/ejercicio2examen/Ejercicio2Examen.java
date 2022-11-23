/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2examen;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio2Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un numero");
        numero = lector.nextInt();

        if (numero % 2 == 0) {
            if (numero % 3 == 0) {
                System.out.println("Numero parell i divisible entre 3");
            } else {
                System.out.println("Numero parell i no divisible entre 3");
            }

        } else {
            System.out.println("Numero senar");
        }
    }

}
