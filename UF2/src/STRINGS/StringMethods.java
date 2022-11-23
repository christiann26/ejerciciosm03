/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRINGS;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class StringMethods {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String prueba = "prueba de diferentes strings";

        System.out.println(prueba.toUpperCase());

        System.out.println(prueba.replace('e', 'x'));

        System.out.println(prueba.repeat(7));

        System.out.println(prueba.contains("de"));

        System.out.println(prueba.concat("de difentes"));

        System.out.println(prueba.startsWith(prueba, 'S'));

    }

}
