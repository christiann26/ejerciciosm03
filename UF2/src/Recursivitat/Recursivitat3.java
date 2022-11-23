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
public class Recursivitat3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = lector.nextInt();

        System.out.println("La suma de todos los numeros pares del numero " + num + " es de " + sumapar(num));
    }

    public static int sumapar(int n) {
        int operacion;
        if (n == 2) {
            return n;
        } else if (n % 2 == 1) {
            return -1;
        } else {
            operacion = n + sumapar(n - 2);
            return operacion;
        }

    }
}
