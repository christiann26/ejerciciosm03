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
public class stringejercicio4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la frase");
        String frase = lector.nextLine();
        int contadorletra = 0;
        contadorletra = contara(frase);

        System.out.println("Numero de letras A " + contadorletra);

    }

    public static int contara(String frase) {
        int contA = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.toUpperCase().charAt(i) == 'A') {
                contA++;
            }
        }
        return contA;

    }

}
