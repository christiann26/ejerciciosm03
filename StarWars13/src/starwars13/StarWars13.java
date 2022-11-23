/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars13;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class StarWars13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int minim = 1, maxim = 100, mitad;
        char respuesta;

        do {
            mitad = (minim + maxim) / 2;
            System.out.println("El numero es el " + mitad);
            System.out.println("He acertado?(i.m.n) ");
            respuesta = lector.next().charAt(0);

            if (respuesta == 'm') {
                minim = mitad;

            } else if (respuesta == 'n') {
                maxim = mitad;

            }

        } while (respuesta != 'i');
        System.out.println("Acertaste");
    }

}
