/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars1;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Starwars1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int cont;
        for (cont = 1; cont <= 20; cont++) {
            System.out.print(" " + cont);
        }
        System.out.println("");
        cont = 1;
        while (cont <= 20) {
            System.out.print(" " + cont);
            cont++;
        }

        System.out.println("");

    }

}
