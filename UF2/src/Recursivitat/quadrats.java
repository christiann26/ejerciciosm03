/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursivitat;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class quadrats {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dime el lado del cuadrado inicial");
        int lado = lector.nextInt();

        int perimetro_total = contarPerimetroFractcal(lado);
        System.out.println("Perimetro total = " + perimetro_total);
    }

    private static int contarPerimetroFractcal(int lado) {
        if (lado == 0) {
            return 0;
        } //else if (lado == 1) {
        //  return 4 * lado;
        //} 
        else if (lado > 0) {
            return 4 * lado + 4 * contarPerimetroFractcal(lado / 2);
            // 4 * lado perimetro cuadrado actual + 4 cuadrados hijos  * perimetro entre 2 uno de los tipos
        }
        return -1;
    }
}
