/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author chsa9814
 */
public class Arraysprueba {

    public static void main(String[] args) {
        int[] notes;

        notes = new int[10];
        notes[0] = 3;
        notes[1] = 4;
        notes[2] = 7;
        notes[5] = 1;

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Posicio " + i + " conte -> " + notes[i]);
        }

        int[] notes2;
        notes2 = new int[10];
        notes = new int[10];
        notes2[0] = 8;
        notes2[1] = 6;
        notes2[2] = 3;
        notes2[5] = 1;

        Utilitats.mostrarArray(notes2);
    }

}
