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
public class Recursivitat2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int num = lector.nextInt();

        System.out.println("Introduce la potencia");
        int potencia = lector.nextInt();

        System.out.println("La potencia " + potencia + " del numero " + num + " es de : " + calcularpotencia(num, potencia));

    }

    public static int calcularpotencia(int n, int p) {
        int operacion;
        if (p == 0) {
            return 1;

        } else if (p >= 1) {
            operacion = n * calcularpotencia(n, p - 1);
            return operacion;
        }
        return -1;
    }
}
