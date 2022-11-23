/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2examenej2;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class UF2ExamenEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        double altura, peso;
        System.out.println("Indicame tu estatura");
        altura = lector.nextDouble();

        System.out.println("Indicame tu peso");
        peso = lector.nextDouble();

        if (validar(altura, peso) == true) {
            double IMC = calculoindiceIMC(altura, peso);
            System.out.println("TU IMC es de " + IMC);

            interpretarIndiceIMC(IMC);
        } else {
            System.out.println("Introduce valores correctos");
        }

    }

    public static double calculoindiceIMC(double estatura, double pes) {
        double IMC = 0;

        IMC = pes / (estatura * 2);
        return IMC;
    }

    public static void interpretarIndiceIMC(double IMC) {
        if (IMC < 18.50) {
            System.out.println("Baix pes");
        } else if (IMC > 18.50 && IMC < 24.99) {
            System.out.println("Normal");
        } else if (IMC >= 25) {
            System.out.println("SobrePes");
        }
    }

    public static boolean validar(double estatura, double pes) {
        boolean validar = true;
        if (estatura > 2.75 || pes > 635) {
            validar = false;
        }
        return validar;

    }

}
