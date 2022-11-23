/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursivitat;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Recursivitat1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = lector.nextInt();

        System.out.println("La suma es de " + suma(num));
    }

    public static int suma(int n) {
        int operacion;
        if (n <= 1) {
            return n;

        } else if (n > 1) {

            operacion = n + suma(n - 1);
            return operacion;
        }
        return -1;
    }

}
