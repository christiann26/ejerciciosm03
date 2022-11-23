/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRINGS;

import static STRINGS.stringejercicio5.contarvocales;
import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class stringejercicio6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la frase");
        String frase = lector.nextLine();

        System.out.println("Introduce el caracter");
        char letra = lector.next().charAt(0);

        int numc = contadorcaracteres(frase, letra);

        System.out.println("Numero de veces que aparece " + letra + " = " + numc);
    }

    public static int contadorcaracteres(String frase, char letra) {
        int contc = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contc++;
            }

        }
        return contc;

    }
}
