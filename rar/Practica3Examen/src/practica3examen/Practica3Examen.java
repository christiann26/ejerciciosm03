/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3examen;

import java.util.Scanner;

/**
 *
 * @author chrcr
 */
public class Practica3Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int L1, L2, L3, mayor, suma;

        System.out.println("Introduce el primer lado");
        L1 = lector.nextInt();

        System.out.println("Introduce el segundo lado");
        L2 = lector.nextInt();

        System.out.println("introduce el tercer lado");
        L3 = lector.nextInt();

        mayor = L1;

        if (L2 > mayor) {
            mayor = L2;
        }

        if (L3 > mayor) {
            mayor = L3;
        }
        suma = L1 + L2 + L3 - mayor;

        if (mayor < suma) {
            if ((L1 == L2) && (L2 == L3)) {
                System.out.println("Triangulo equilatero");
            } else if ((L1 == L2) | (L1 == L3) | (L2 == L3)) {
                System.out.println("Triangulo isosceles");
            } else {
                System.out.println("Triangulo escaleno");
            }
        } else {
            System.out.println("No es un triangulo");
        }
    }
}
