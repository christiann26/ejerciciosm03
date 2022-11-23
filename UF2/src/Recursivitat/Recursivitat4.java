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
public class Recursivitat4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduce el primer numero");
        num1 = lector.nextInt();
        System.out.println("Introduce el segundo numero");
        num2 = lector.nextInt();

        System.out.println("La suma de todos los valores de los dos numeros es de" + sumavalores(num1, num2));
    }

    public static int sumavalores(int n1, int n2) {
        int operacion;
        if (n1 <= 1 && n2 <= 1) {
            return n1 + n2;
        } else {
            operacion = (n1 + sumavalores(n1 - 1, n2)) + (n2 + sumavalores(n1, n2 - 1));
            return operacion;
        }

    }
}
