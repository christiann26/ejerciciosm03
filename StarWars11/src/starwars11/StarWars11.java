/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class StarWars11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int pares = 0, impares = 0, num;

        for (num = 101; num <= 199; num = num = num + 2) {
            impares = impares + num;

        }

        for (num = 100; num <= 200; num = num = num + 2) {
            pares = pares + num;

        }

        System.out.println("La suma de los impares entre el 100 y el 200 es de " + impares);
        System.out.println("La suma de los pares entre el 100 y 200 es de " + pares);
    }

}
