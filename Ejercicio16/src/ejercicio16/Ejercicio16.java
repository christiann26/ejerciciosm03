/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lector = new Scanner(System.in);
        double num;

        System.out.println("Escribe un numero entre 0 y 10");
        num = lector.nextDouble();

        if (num >= 0 && num < 3) {
            System.out.println("Muy deficiente");
        } else if (num >= 3 && num < 5) {
            System.out.println("Insuficiente");
        } else if (num >= 5 && num < 6) {
            System.out.println("Bien");
        } else if (num >= 6 && num < 9) {
            System.out.println("Notable");
        } else if (num >= 9 && num <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota incorrecta");
        }

    }

}
