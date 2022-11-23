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
public class stringejercicio2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la frase");
        String frase = lector.nextLine();

        mayusculayminuscula(frase);
    }

    public static void mayusculayminuscula(String frase) {

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }

}
