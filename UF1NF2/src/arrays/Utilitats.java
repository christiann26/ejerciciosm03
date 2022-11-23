/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Utilitats {

    public static int pedirvalorpositivo() {
        Scanner lector = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Pon un valor positivo");
            valor = lector.nextInt();
        } while (valor <= 0);

        return valor;

    }

    public static int pedirvalordosnumeros(int n1, int n2) {
        Scanner lector = new Scanner(System.in);

        int min, maxim;
        int valor;

        if (n1 > n2) {
            maxim = n1;
            min = n2;
        } else {
            maxim = n2;
            min = n1;

        }
        do {
            System.out.println("Pon un valor entre " + n1 + " y " + n2);
            valor = lector.nextInt();
        } while (valor < min || valor > maxim);

        return valor;
    }

    public static void mostrarArray(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Posicio " + i + " conte -> " + valores[i]);
        }
    }

}
