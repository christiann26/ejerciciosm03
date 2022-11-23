/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1correccionbucles;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio1CorreccionBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num, cont3 = 0, cont = 0, suma = 0;

        do {
            System.out.println("Introduce un numero");
            num = lector.nextInt();
            cont++;

            if (num % 3 == 0) {
                suma = suma + num;
                cont3++;
            }

        } while (cont3 < 3);

        System.out.println("Total de numeros " + cont);
        System.out.println("La suma total de divisibles entre 3 es de " + suma);

    }

}
