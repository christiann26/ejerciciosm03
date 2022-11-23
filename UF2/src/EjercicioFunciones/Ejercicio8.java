/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFunciones;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num, sumatorio, producto;
        double intermedio;

        System.out.println("Introdcue un numero");
        num = lector.nextInt();

        sumatorio = sumatorio(num);

        System.out.println("El sumatorio es de " + sumatorio);

        producto = producto(num);

        System.out.println("El producto es de " + producto);

        intermedio = mitad(num);

        System.out.println("El numero intermedio es el " + intermedio);
    }

    public static int sumatorio(int n) {
        int sumatorio = 0;
        for (int cont = 1; cont <= n; cont++) {
            sumatorio = sumatorio + cont;
        }
        return sumatorio;
    }

    public static int producto(int n) {
        int producto = 1;

        for (int cont = 1; cont <= n; cont++) {
            producto = producto * cont;
        }
        return producto;
    }

    public static double mitad(int num) {
        double mitad;
        mitad = (double) (num + 1) / 2;

        return mitad;
    }

    // public static double intermedio(double minimo, double maximo) {
    //   double intermedio;
    // intermedio = (minimo + maximo) / 2;
    // return intermedio;
    //}
}
