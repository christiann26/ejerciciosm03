/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int horas, minutos, segundos;

        System.out.println("Introduce las horas");
        horas = lector.nextInt();

        System.out.println("Introduce los minutos");
        minutos = lector.nextInt();

        System.out.println("Introduce los segundos");
        segundos = lector.nextInt();

        segundos = segundos + 1;

        if (segundos == 60) {
            segundos = 0;
            minutos = minutos + 1;
            if (minutos == 60) {
                minutos = 0;
                horas = horas + 1;
                if (horas == 24) {
                    horas = 0;

                }
            }
        }

        System.out.println("Son las " + horas + " h " + minutos + " m " + segundos + " s ");
    }

}
