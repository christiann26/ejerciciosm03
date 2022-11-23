/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3examenbuclesnf1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio3ExamenBuclesNF1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Random rd = new Random();
        int aleatorio, num, mult, cont2 = 0;
        aleatorio = rd.nextInt(9) + 1;
        System.out.println("Taula de multiplicar del " + aleatorio);

        for (int cont = 1; cont <= 10; cont++) {

            System.out.print(+aleatorio + "x" + cont);
            mult = aleatorio * cont;
            System.out.print(":");
            num = lector.nextInt();
            if (num != mult) {
                System.out.println(">>Incorrecte " + aleatorio + " x " + cont + " = " + mult);
                cont2++;
            }
        }

        System.out.println("Has tenido " + cont2 + " fallos");

    }

}
