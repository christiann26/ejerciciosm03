/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale2;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class ClashRoyale2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        final int LEVEL_LUMBERJACK_MAX = 13, LEVEL_LUMBERJACK_MIN = 9;

        int nivel_leñador, nivel_torre, dañoleñador = 0, vidaleñador = 0, dañotorre = 0, vidatorre = 0, golpes = 0;

        System.out.println("Que nivel tiene la torre?");
        nivel_torre = lector.nextInt();
        do {
            System.out.println("Que nivel tiene el lenador (" + LEVEL_LUMBERJACK_MIN + "-" + LEVEL_LUMBERJACK_MAX + ")?");
            nivel_leñador = lector.nextInt();

        } while (nivel_leñador < LEVEL_LUMBERJACK_MIN || nivel_leñador > LEVEL_LUMBERJACK_MAX);

        switch (nivel_leñador) {
            case 9:
                dañoleñador = 200;
                vidaleñador = 1060;
                break;

            case 10:
                dañoleñador = 220;
                vidaleñador = 1166;
                break;

            case 11:
                dañoleñador = 242;
                vidaleñador = 1282;
                break;
            case 12:
                dañoleñador = 266;
                vidaleñador = 1409;
                break;
            case 13:
                dañoleñador = 292;
                vidaleñador = 1547;
                break;
            default:
                dañoleñador = 1;
                vidaleñador = 1;
                System.out.println("Nivel incorrecto");
        }

        switch (nivel_torre) {
            case 1:
                vidatorre = 1400;
                dañotorre = 50;
                break;

            case 2:
                vidatorre = 1512;
                dañotorre = 54;
                break;

            case 3:
                vidatorre = 1624;
                dañotorre = 58;
                break;
            default:
                vidatorre = 1;
                dañotorre = 1;
                System.out.println("Nivel incorrecto");
        }

        dañotorre = dañotorre * 2;

        while (vidatorre > 0 && vidaleñador > 0) {
            vidatorre = vidatorre - dañoleñador;
            vidaleñador = vidaleñador - dañotorre;
            golpes++;
            Thread.sleep(750);
            System.out.println("Lenador ataca con fuerza de valor " + dañoleñador + " A la torre le quedan " + vidatorre + " puntos de vida");
            System.out.println("La torre ataca con fuerza de valor " + dañotorre + " Al lenador le quedan " + vidaleñador + " puntos de vida");

        }
        if (vidatorre <= 0 && vidaleñador <= 0) {
            System.out.println("Los dos están muertos");
        }
        if (vidatorre <= 0) {
            System.out.println("Ha ganado el lenador");
            System.out.println("Total de golpes de el lenador: " + golpes);
        } else {
            System.out.println("Ha ganado la torre");
            System.out.println("Total de golpes de la torre: " + golpes);
        }

    }

}
