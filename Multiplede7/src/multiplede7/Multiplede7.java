/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplede7;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Multiplede7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num = 12, cont = 0;
        do {

            num++;

            if (num % 7 == 0) {
                System.out.println("" + num);
                cont++;
            }

        } while (cont < 10);

    }

}
