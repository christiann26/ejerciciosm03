/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double num1, num2, suma, resta, division, producto;

        System.out.println("Introduce el primer numero");
        num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero");
        num2 = sc.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        division = num1 / num2;
        producto = num1 % num2;

        System.out.println("suma " + suma);
        System.out.println("resta " + resta);
        System.out.println("division " + division);
        System.out.println("producto " + producto);
    }

}
