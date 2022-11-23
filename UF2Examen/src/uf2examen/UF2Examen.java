/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2examen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class UF2Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 10, apuesta, premio;
        char tirada1, tirada2, tirada3;
        do {

            apuesta = quantitat_apostada(saldo);
            saldo = saldo - apuesta;
            System.out.println("Tu saldo es de" + saldo);

            tirada1 = tirada_disc();
            tirada2 = tirada_disc();
            tirada3 = tirada_disc();

            mostrar_tirada(tirada1, tirada2, tirada3);

            premio = calcular_premi(tirada1, tirada2, tirada3, apuesta);

            if (premio == 0) {
                System.out.println("No te ha tocado");
                System.out.println("Tu saldo es de " + saldo);
            } else {
                saldo = saldo + premio;
                System.out.println("Te ha tocado");
                System.out.println("Tu saldo ahora es de " + saldo);
            }

        } while (seguir_jugant(saldo) == true);

        System.out.println("Fin del juego");

    }

    public static int quantitat_apostada(int dinero_tienes) {
        Scanner lector = new Scanner(System.in);
        int dinero_apuestas;
        do {
            System.out.println("Quant vols apostar");
            dinero_apuestas = lector.nextInt();
        } while (dinero_apuestas > dinero_tienes || dinero_apuestas <= 0);
        return dinero_apuestas;
    }

    public static char tirada_disc() {
        int aleatorio;
        char tirada = 'A';
        Random rd = new Random();
        aleatorio = rd.nextInt(3) + 0;
        if (aleatorio == 0) {
            tirada = 'A';

        } else if (aleatorio == 1) {
            tirada = 'B';
        } else if (aleatorio == 2) {
            tirada = 'C';
        }
        return tirada;
    }

    public static void mostrar_tirada(char char1, char char2, char char3) {

        System.out.println("***********************************");
        System.out.println("*" + char1 + " - " + char2 + " - " + char3);
        System.out.println("***********************************");

    }

    public static int calcular_premi(char tirada1, char tirada2, char tirada3, int apuesta) {
        int dinero_ganado;
        if (tirada1 == 'A' && tirada2 == 'A' && tirada3 == 'A') {
            dinero_ganado = apuesta + 5;

        } else if (tirada1 == 'B' && tirada2 == 'B' && tirada3 == 'B') {
            dinero_ganado = apuesta + 2;

        } else if (tirada1 == 'C' && tirada2 == 'C' && tirada3 == 'C') {
            dinero_ganado = apuesta * 2;

        } else {
            dinero_ganado = 0;
        }
        return dinero_ganado;
    }

    public static boolean seguir_jugant(int saldo) {
        boolean seguir_jugant = true;
        if (saldo > 25 || saldo <= 0) {
            seguir_jugant = false;
        }
        return seguir_jugant;
    }

}
