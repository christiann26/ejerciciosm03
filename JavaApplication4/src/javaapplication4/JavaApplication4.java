/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double lado, area;

        System.out.println("Introduce el lado del cuadrado");
        lado = sc.nextDouble();

        area = lado * lado;
        System.out.println("El lado mide " + lado);
        System.out.println("El area mide " + area);

    }

}
