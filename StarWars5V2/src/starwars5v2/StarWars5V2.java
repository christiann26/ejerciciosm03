/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars5v2;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class StarWars5V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num, cont, fact = 1;

        System.out.println("Introduce un numero");
        num = lector.nextInt();

        for (cont = num; cont > 0; cont--) {
            if (cont != 1) {
                fact = fact * cont;
                System.out.print(cont + "*");
            } else {
                System.out.print("1");

            }

        }
        System.out.println("=" + fact);

    }
}
