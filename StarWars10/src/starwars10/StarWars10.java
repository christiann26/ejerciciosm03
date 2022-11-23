/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars10;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class StarWars10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int nota, cont = 0;
        boolean puesto_diez = false;
        do {
            System.out.println("Introduce un numero entre 0 y 10");
            nota = lector.nextInt();
            if (nota >= -1 && nota <= 10) {
                cont++;
                if (nota == 10) {
                    puesto_diez = true;
                }
            } else {
                System.out.println("Nota incorrecta, tiene que ser entre 0 y 10");
            }

        } while (nota != -1);

        if (puesto_diez == true) {
            System.out.println("Has puesto un diez");
        } else {
            System.out.println("No has puesto ningun diez");
        }

        System.out.println("Total de notas introducidas " + cont);

    }

}
