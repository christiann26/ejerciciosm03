/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars4;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class StarWars4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int cont, num;

        System.out.println("Introduce un numero");
        num = lector.nextInt();

        for (cont = 1; cont <= num; cont++) {
            cont = cont++;
            System.out.println(" " + cont);

        }
    }

}
