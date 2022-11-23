/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFunciones;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dia, mes, año;
        boolean fechacorrecta;

        System.out.println("Introduce el dia");
        dia = lector.nextInt();

        System.out.println("Introduce el mes");
        mes = lector.nextInt();

        System.out.println("Introduce el año");
        año = lector.nextInt();

        fechacorrecta = fechacorrecta(dia, mes, año);

        if (fechacorrecta == true) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }

    }

    public static boolean fechacorrecta(int d, int m, int a) {
        boolean fechacorrecta = true;
        if (d < 1 || d > 30) {
            fechacorrecta = false;
        }
        if (m < 1 || m > 12) {
            fechacorrecta = false;
        }

        if (a < 1900) {
            fechacorrecta = false;
        }
        return fechacorrecta;
    }

}
