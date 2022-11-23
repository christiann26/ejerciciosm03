/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle1;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Bucle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int i;

        for (i = 0; i < 6; i++) {
            System.out.print("--> " + i);
        }
        System.out.println("");
        i = 0;
        while (i < 6) {
            System.out.print("--> " + i);
            i++;
        }
        System.out.println("");
        i = 0;
        do {
            System.out.print("--> " + i);
            i++;
        } while (i < 6);
        System.out.println("");
    }
}
