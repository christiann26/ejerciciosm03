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
public class RecursivitatConejos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("En que mes quieres saber cuantos conejos tendran?");
        int mes = lector.nextInt();

        System.out.println("En el mes " + mes + " tendran  " + parejaconejos(mes) + " parejas de conejos");

    }

    public static int parejaconejos(int mes) {
        int resultado;
        if (mes <= 1) {
            return 1;
        } else if (mes > 1) {
            resultado = parejaconejos(mes - 1) + parejaconejos(mes - 2);
            return resultado;
        }
        return -1;

    }
}
