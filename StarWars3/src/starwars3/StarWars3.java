/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars3;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class StarWars3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int cont;
        for (cont = 2; cont <= 200; cont++) {
            if (cont % 2 == 0) {
                System.out.println("par " + cont);

            }

        }
    }

}
