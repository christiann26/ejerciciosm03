/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1examen;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio1Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        boolean fecha = true;
        int dia, mes, año;

        System.out.println("Introduce el dia");
        dia = lector.nextInt();

        System.out.println("Introduce el mes");
        mes = lector.nextInt();

        System.out.println("Introduce el año");
        año = lector.nextInt();

        if ((dia > 30 || dia < 1) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.println("Dia incorrecto");
            fecha = false;
        }

        if ((dia < 1 || dia > 28) && (mes == 2)) {
            System.out.println("Dia incorrecto");
            fecha = false;
        }
        if ((dia > 31 || dia < 1) && (mes == 1 || mes == 3 || mes == 5 || mes == 7)) {
            System.out.println("Dia incorrecto");
            fecha = false;
        }

        if (mes > 12 || mes < 1) {
            System.out.println("Mes incorrecto");
            fecha = false;
        }

        if (año < 1900) {
            System.out.println("Año incorrecto");
            fecha = false;
        }

        if (fecha == true) {
            System.out.println("Fecha correcta");
            System.out.println(" " + dia + " / " + mes + " / " + año);
        }
        if (fecha == false) {
            System.out.println("Fecha incorrecta");
        }

    }
}
