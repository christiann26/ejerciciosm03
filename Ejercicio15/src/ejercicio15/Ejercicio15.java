/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Introduce el primer numero");
        num1 = lector.nextInt();

        System.out.println("Introduce el segundo numero");
        num2 = lector.nextInt();

        System.out.println("Introduce el tercer numero");
        num3 = lector.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El numero " + num1 + " es mayor");

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El numero " + num2 + " es mayor");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("El numero " + num3 + " es mayor");
        }

    }
}
