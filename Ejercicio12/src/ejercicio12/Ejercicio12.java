/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num;

        System.out.println("Introduce el numero");
        num = lector.nextInt();

        if (num >= 0) {
            System.out.println("El numero " + num + " es positivo");

        } else {
            System.out.println("El numero " + num + " es negativo");
        }

    }

}
