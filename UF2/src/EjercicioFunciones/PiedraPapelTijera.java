/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFunciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PiedraPapelTijera {

    public static void main(String[] args) {
        // TODO code application logic here
        int jugada, numero = 0;
        int aleatorio = 0, jugada_ord;
        int ganador;
        int cont = 0, cont2 = 0;
        int jugadas = 0;
        do {
            jugada = jugada(numero);
            jugada_ord = jugada_ord(aleatorio);
            imp_jugada(jugada, jugada_ord);

            ganador = ganador(jugada, jugada_ord);
            imp_ganador(ganador);

            if (ganador == 1) {
                cont++;
            } else if (ganador == 2) {
                cont2++;
            }
            jugadas++;
            marcador(cont, cont2);

        } while (cont < 3 && cont2 < 3 && jugadas < 6);

        System.out.println("****Resultado final****");
        marcador(cont, cont2);

    }

    public static int jugada(int n) {
        Scanner lector = new Scanner(System.in);

        int numero = 0;
        do {
            System.out.println("Introduce 0-Piedra ,1-Papel ,2-Tijera :  ");
            numero = lector.nextInt();
        } while (!(numero >= 0 && numero <= 2));
        return numero;
    }

    public static int jugada_ord(int r) {
        Random rd = new Random();
        int aleatorio;
        aleatorio = rd.nextInt(3) + 0;
        return aleatorio;
    }

    public static void imp_jugada(int jugador1, int jugador2) {
        if (jugador1 == 0) {
            System.out.print("J1:Piedra ");
        } else if (jugador1 == 1) {
            System.out.print("J1:Papel ");
        } else if (jugador1 == 2) {
            System.out.print("J1:Tijera ");
        }
        if (jugador2 == 0) {
            System.out.println("J2:Piedra ");
        } else if (jugador2 == 1) {
            System.out.println("J2:Papel ");
        } else if (jugador2 == 2) {
            System.out.println("J2:Tijera ");
        }
    }

    public static int ganador(int player1, int player2) {
        int numero = 0;
        if (player1 == player2) {
            numero = 0;
        } else if (player1 == 0 && player2 == 2 || player1 == 2 && player2 == 1 || player1 == 1 && player2 == 0) {
            numero = 1;
        } else if (player1 == 0 && player2 == 1 || player1 == 2 && player2 == 0 || player1 == 1 && player2 == 2) {
            numero = 2;
        }

        return numero;
    }

    public static void imp_ganador(int ganador) {
        if (ganador == 0) {
            System.out.println("Empate");
        } else if (ganador == 1) {
            System.out.println("Has ganado");
        } else if (ganador == 2) {
            System.out.println("Has perdido");
        }
    }

    public static void marcador(int point_player1, int point_player2) {
        System.out.println("----------------------------------------");
        System.out.println("**********PUNTUACION TOTAL**************");
        System.out.println("Puntuacion J1 " + point_player1 + " puntos");
        System.out.println("Puntuacion J2 " + point_player2 + " puntos");
        System.out.println("----------------------------------------");
    }

}
