/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wii;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Wii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Random rd = new Random();

        int petardo1 = 0, petardo2 = 0, petardo3 = 0, eleccionpetardo, eleccion1 = 0, eleccion2 = 0, eleccion3 = 0;
        boolean win = false;

        System.out.println("Que petardo quieres? 1-3");
        eleccionpetardo = lector.nextInt();

        petardo1 = rd.nextInt(10) + 1;
        petardo2 = rd.nextInt(10) + 1;
        petardo3 = rd.nextInt(10) + 1;

        switch (eleccionpetardo) {
            case 1:
                if (petardo1 >= petardo2 && petardo1 >= petardo3) {
                    win = true;
                }
                break;
            case 2:

                if (petardo2 >= petardo1 && petardo2 >= petardo3) {
                    win = true;
                }
                break;
            case 3:
                if (petardo3 >= petardo2 && petardo3 >= petardo1) {
                    win = true;
                }
                break;
        }

        for (int linia = 1; linia <= 10; linia++) {
            if (linia <= petardo1) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }
            if (linia <= petardo2) {
                System.out.print("  *");

            } else {
                System.out.print("   ");
            }

            if (linia <= petardo3) {
                System.out.print("  *");

            } else {
                System.out.print("   ");
            }

            System.out.println("");
            Thread.sleep(500);
        }

        if (win == true) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Has perdido");
        }

    }
}
