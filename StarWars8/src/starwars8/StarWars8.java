/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars8;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class StarWars8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num, negativo = 0, positivo = 0;
        do {
            System.out.println("Introduce un numero, escribe 0 para terminar");
            num = lector.nextInt();

            if (num < 0) {
                negativo++;
            } else if (num > 0) {
                positivo++;
            }
        } while (num != 0);

        System.out.println("Numero negativos encontrados: " + negativo);
        System.out.println("Numero positivos encontrados: " + positivo);

    }

}
