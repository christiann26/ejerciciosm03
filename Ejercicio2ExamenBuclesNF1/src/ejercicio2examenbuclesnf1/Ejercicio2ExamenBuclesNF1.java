/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2examenbuclesnf1;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio2ExamenBuclesNF1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        int celsius1, celsius2;
        double fahrenheit;

        System.out.println("Introduce los grados celisus (DESDE)");
        celsius1 = lector.nextInt();

        System.out.println("Introduce los grados celisus(hasta)");
        celsius2 = lector.nextInt();

        while (celsius1 <= celsius2) {
            fahrenheit = (1.8 * celsius1) + 32;

            System.out.println("Grados Celsius " + celsius1 + " C Grado Fahrenheit " + fahrenheit + " F");
            celsius1++;

        }
    }

}
