/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int edad;

        System.out.println("Introduce tu edad");
        edad = lector.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }

    }

}
