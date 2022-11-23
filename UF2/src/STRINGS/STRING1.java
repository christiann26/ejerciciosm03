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
public class STRING1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int x = 3;
        String frase = "Hola que tal";
        System.out.println(frase + " " + x);

        System.out.println("Escribe una frase");
        frase = lector.next();
        System.out.println("Frase con next " + frase);

        //System.out.println("Ecribe una frase");
        // frase = lector.nextLine();
        //System.out.println("Frase con nextline " + frase);
        if (frase.isEmpty()) {

            System.out.println("String Vacio");

        } else {
            System.out.println("String no vacio");
        }

        // char letra = frase.charAt(3);
        //System.out.println("La letra en la posicion 3 es de " + letra);
        //System.out.println("La frase tiene " + frase.length());
        // for (int i = 0; i < frase.length(); i++) {
        //   System.out.println("En la posición " + i + " hay el caracter " + frase.charAt(i));
        //}
        String f1 = "hola que tal";
        String f2 = "hola que Tal";

        if (f1.equals(f2)) {
            System.out.println("Frase igual");
        } else {
            System.out.println("Frase diferente");
        }

        if (f1.equalsIgnoreCase(f2)) {
            System.out.println("Frase igual sin importar mayusculas");

        } else {
        }

    }

}
