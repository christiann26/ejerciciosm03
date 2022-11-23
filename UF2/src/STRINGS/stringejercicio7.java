/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRINGS;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class stringejercicio7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la frase entera");
        String frase = lector.nextLine();
        juntar(frase);
    }

    public static void juntar(String frase) {
        System.out.println(frase.replace(" ", ""));

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                System.out.print(frase.charAt(i));
            }
        }
    }
}
