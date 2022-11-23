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
public class Stringejercicio1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la frase");
        String contar = lector.nextLine();

        int letra = contarcaracteres(contar);
        System.out.println(letra);
    }

    public static int contarcaracteres(String contar) {

        int num = contar.length();
        return num;

    }

}
