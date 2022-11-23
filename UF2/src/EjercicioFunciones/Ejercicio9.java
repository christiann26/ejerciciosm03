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
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int num1, num2, num3, mayordelosdos, mayordelostres;

        System.out.println("Introduce el primer numero");
        num1 = lector.nextInt();

        System.out.println("Introduce el segundo numero");
        num2 = lector.nextInt();

        System.out.println("Introduce el tercer numero");
        num3 = lector.nextInt();

        mayordelosdos = mayordelosdos(num1, num2);

        mayordelostres = mayordelostres(mayordelosdos, num3);

        System.out.println("El mayor de " + num1 + ", " + num2 + " y " + num3 + " es el " + mayordelostres);

    }

    public static int mayordelosdos(int n1, int n2) {
        int mayor;

        if (n1 > n2) {
            mayor = n1;
        } else {
            mayor = n2;
        }
        return mayor;
    }

    public static int mayordelostres(int mayor, int n3) {
        int maximo;
        if (mayor > n3) {
            maximo = mayor;
        } else {
            maximo = n3;
        }
        return maximo;
    }

}
