/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars11v2;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class StarWars11V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        int pares = 0, impares = 0, num;
        
        for (num = 100; num <= 200; num++) {
            if (num % 2 == 0) {
                pares = pares + num;

            } else {
                impares = impares + num;
            }
        }
        System.out.println("Pares " + pares);
        System.out.println("Impares " + impares);

    }

}
