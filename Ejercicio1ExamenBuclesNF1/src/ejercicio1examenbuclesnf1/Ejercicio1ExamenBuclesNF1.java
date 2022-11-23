/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1examenbuclesnf1;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio1ExamenBuclesNF1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char dia;
        int tipo;
        double precio_bocata = 0;
        Scanner lector = new Scanner(System.in);

        System.out.println("Es laborable -L/ Es festivo -F/Es Dissabte -S");
        dia = lector.next().charAt(0);

        System.out.println("Introduce el tipos 1 o 2");
        tipo = lector.nextInt();

        if ((dia == 'L' || dia == 'l' || dia == 'S' || dia == 's' || dia == 'F' || dia == 'f') && (tipo == 1 || tipo == 2)) {

            if (dia == 'L' || dia == 'l') {

                if (tipo == 1) {
                    precio_bocata = 2;

                } else if (tipo == 2) {

                    precio_bocata = 2.50;

                }
            } else if (dia == 'S' || dia == 's') {

                if (tipo == 1) {
                    precio_bocata = 2.20;

                } else if (tipo == 2) {

                    precio_bocata = 2.70;

                }

            } else if (dia == 'F' || dia == 'f') {

                if (tipo == 1) {
                    precio_bocata = 2.30;

                } else if (tipo == 2) {

                    precio_bocata = 2.80;

                }

            }

            System.out.println("El precio del bocata es de " + precio_bocata + " euros");

        } else {
            System.out.println("Has introducido valores incorrectos, no se puede calcular");
        }

    }
}
