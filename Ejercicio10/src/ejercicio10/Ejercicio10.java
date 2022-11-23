/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        double num1, num2, suma, resta, multiplicacion, division;

        System.out.println("Introduce el primer numero");
        num1 = lector.nextDouble();

        System.out.println("Introduce el segundo numero");
        num2 = lector.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;

        System.out.println("La suma es " + suma);
        System.out.println("La resta es 0 " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);

        if (num2 != 0) {
            division = num1 / num2;
            System.out.println("La division es " + division);
        } else {
            System.out.println("No se puede dividir");
        }

    }

}
