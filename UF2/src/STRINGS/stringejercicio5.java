/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRINGS;

import static STRINGS.stringejercicio4.contara;
import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class stringejercicio5 {

    Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la frase");
        String frase = lector.nextLine();
        int contadorvocales = 0;
        contadorvocales = contarvocales(frase);

        System.out.println("Numero de vocales " + contadorvocales);

    }

    public static int contarvocales(String frase) {
        int contV = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.toUpperCase().charAt(i) == 'A' || frase.toUpperCase().charAt(i) == 'E' || frase.toUpperCase().charAt(i) == 'I' || frase.toUpperCase().charAt(i) == 'O' || frase.toUpperCase().charAt(i) == 'U') {
                contV++;
            }
        }
        return contV;

    }

}
