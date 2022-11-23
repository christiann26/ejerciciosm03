/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduce el primer numero");
        num1 = lector.nextInt();

        System.out.println("Introduce el segundo numero");
        num2 = lector.nextInt();

        if (num1 > num2) {
            System.out.println(+num2 + " y " + num1);
        } else {
            System.out.println(+num1 + " y " + num2);
        }

    }
}
