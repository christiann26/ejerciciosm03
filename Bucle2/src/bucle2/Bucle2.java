/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle2;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Bucle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner lector = new Scanner(System.in);
        int num;

        do {
            System.out.println("Pon numeros para termianr escribe 0");
            num = lector.nextInt();
            System.out.println("Has escrito " + num);

        } while (num != 0);
        System.out.println("Programa terminado");

    }

}
