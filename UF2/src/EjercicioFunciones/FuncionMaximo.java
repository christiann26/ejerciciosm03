/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFunciones;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class FuncionMaximo {

    /**
     *
     * @author chsa9814
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        double num1, num2, max, min;

        System.out.println("Introduce el primero numero");
        num1 = lector.nextDouble();

        System.out.println("Introduce el segundo numero");
        num2 = lector.nextDouble();

        max = maximo(num1, num2);
        System.out.println("El valor maximo es el " + max);
        
        min = minimo(num1,num2);
        System.out.println("El valor minimo es el " + max);
    }

    public static double maximo(double valor1, double valor2) {
        double max;
        if (valor1 > valor2) {
            max = valor1;
        } else {
            max = valor2;
        }
        return max;

    }

    public static double minimo(double valor1, double valor2) {
        double min;
        if (valor1 > valor2) {
            min = valor2;
        } else {
            min = valor1;
        }
        return min;

    }
}
