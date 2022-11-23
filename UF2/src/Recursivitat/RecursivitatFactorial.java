/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursivitat;

/**
 *
 * @author chsa9814
 */
public class RecursivitatFactorial {

    public static void main(String[] args) {
        int valor = 5;

        System.out.println(valor + " != " + factorial(valor));
    }

    public static int factorial(int n) {
        int resultado;
        //1 o mes casos base
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 1;
        } else {
            resultado = n * factorial(n - 1);

            System.out.println("factorial (" + n + ") retorna " + resultado);
            return resultado;
        }

    }
}
