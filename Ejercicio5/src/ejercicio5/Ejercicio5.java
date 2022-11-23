/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double pi = 3.14, radio, area, diametro, longitud_circumferencia;

        System.out.println("Introduce la longitud del radio");
        radio = sc.nextDouble();

        diametro = radio * 2;
        longitud_circumferencia = pi * diametro;
        area = pi * Math.pow(radio, 2);

        System.out.println("La longitud de la circumferencia es de " + longitud_circumferencia);
        System.out.println("El area es de " + area);

    }
}
