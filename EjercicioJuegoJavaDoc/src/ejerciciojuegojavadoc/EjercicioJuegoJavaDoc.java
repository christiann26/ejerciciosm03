/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciojuegojavadoc;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class EjercicioJuegoJavaDoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int bola_player, bola, saldo = 100, apuesta, dinero_ganado;
        boolean winner;
        char seguir;
        do {
            bola_player = pedirNumero();
            apuesta = pedirDineroApuesta(saldo);

            saldo = saldo - apuesta;
            System.out.println("saldo " + saldo);
            bola = caidaBola();;

            pintaAsteriscos(bola);

            winner = comprobarResultado(bola, bola_player);

            if (winner = true) {
                System.out.println("HAS GANADO");
                dinero_ganado = ganancias(apuesta, bola_player);
                saldo = saldo + dinero_ganado;
            }else{
                System.out.println("Has perdido");
            }
            seguir = seguirJugando();
        } while (continuarJugando(seguir, saldo));

    }

    public static int pedirNumero() {
        int numero;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero del 1 al 36, 37: impar y 38:par");
            numero = lector.nextInt();
        } while (numero < 1 && numero > 38);

        return numero;
    }

    public static int caidaBola() {
        Random rd = new Random();
        int aleatorio;
        aleatorio = rd.nextInt(37) + 0;
        return aleatorio;

    }

    public static void pintaAsteriscos(int num) {
        int i;
        for (i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println(" " + i);

    }

    public static int pedirDineroApuesta(int dinero_tienes) {
        Scanner lector = new Scanner(System.in);
        int dinero_apostar;
        do {
            System.out.println("Cuanto dinero quieres apostar? Aun tienes " + dinero_tienes);
            dinero_apostar = lector.nextInt();

        } while (dinero_apostar < 0 || dinero_apostar > dinero_tienes);
        return dinero_apostar;
    }

    public static boolean comprobarResultado(int bola, int num_aposta) {

        if (bola == num_aposta) {
            return true;
        } else if (bola % 2 == 0 && num_aposta == 37) {
            return true;
        } else if (bola % 3 == 0 && num_aposta == 38) {
            return true;
        } else {
        }
        return false;

    }

    public static int ganancias(int dinero_aposta, int num_aposta) {

        if (num_aposta >= 1 || num_aposta <= 36) {
            dinero_aposta = dinero_aposta * 35;
        } else if (num_aposta == 37 || num_aposta == 38) {
            dinero_aposta = dinero_aposta * 2;
        }
        return dinero_aposta;
    }

    public static char seguirJugando() {
        Scanner lector = new Scanner(System.in);
        char seguir;
        do {
            System.out.println("Quieres seguir jugando? Si o No");
            seguir = lector.next().charAt(0);
        } while (!(seguir != 'S' && seguir != 'N' || seguir != 's' && seguir != 'n'));
        return seguir;
    }

    public static boolean continuarJugando(char respuesta, int dinero) {
        boolean continuar = false;
        if ((respuesta == 's' || respuesta == 'S') && dinero > 0) {
            continuar = true;
        } else {
            continuar = false;
        }
        return continuar;
    }

}
