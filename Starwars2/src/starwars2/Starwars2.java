/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars2;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Starwars2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int cont;

        for (cont = 2; cont <= 200; cont = cont + 2) {
            System.out.print(" " + cont);
        }
        
        System.out.println("");
        cont = 0;
        while (cont < 200) {
            cont = cont + 2;
            System.out.print(" " + cont);
        }

    }

}
