/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars6;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class StarWars6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num, cont = 0, negativo = 0;
        do {
            System.out.println("Introduce un numero");
            num = lector.nextInt();
            cont++;

            if (num < 0) {
                negativo++;
            }
        } while (cont != 10);

        System.out.println("Numero negativos encontrados: " + negativo);
    }

}
