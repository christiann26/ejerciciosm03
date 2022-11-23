/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars5;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class StarWars5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num, cont, fact = 1;

        System.out.println("Introduce un numero");
        num = lector.nextInt();

        for (cont = 1; cont <= num; cont++) {

            fact = fact * cont;

        }
        System.out.println("Factorial de " + num + " es " + fact);
    }

}
