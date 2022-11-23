/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio1Prueba {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        /**
         * notes[0] = 3; notes[1] = 4; notes[2] = 7; notes[3] = 1;
         *
         * suma = calcularSumaNotas(notes); media = (double) suma /
         * notes.length; System.out.println("La nota media es " + media);
         *
         */
        int[] notes;
        int num_notas = 4;
        notes = new int[num_notas];

        int suma;
        double media;

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Introdueix la nota " + (i + 1));
            notes[i] = lector.nextInt();

        }

        suma = calcularSumaNotas(notes);
        media = (double) suma / notes.length;

        System.out.println("La nota media es " + media);

        int[] copia_notes = new int[num_notas];
        for (int i = 0; i < notes.length; i++) {
            copia_notes[i] = notes[i];
        }

        System.out.println("Array copia");
        Utilitats.mostrarArray(copia_notes);

    }

    private static int calcularSumaNotas(int[] notes) {
        int suma = 0;
        for (int i = 0; i < notes.length; i++) {
            suma = suma + notes[i];
        }
        return suma;
    }

}
