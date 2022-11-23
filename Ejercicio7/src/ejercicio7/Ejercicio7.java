/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double metro, milla;
        final int milla_metros = 1852;
        
        System.out.println("Escribe una distancia en millas");
        milla = sc.nextDouble();

        metro = milla * milla_metros;

        System.out.println("Son " + metro + " metros");

    }

}
