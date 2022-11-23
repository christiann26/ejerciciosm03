/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2examen;

import java.util.Scanner;

/**
 *
 * @author chrcr
 */
public class Practica2Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        float A1, A2, A3, A4, A5, A6, A7, A8, medio, maximo, minimo;

        System.out.println("Cuanto tiempo le dedicas");
        A1 = lector.nextFloat();

        if (A1 > 40.00F | A1 < 0.00F) {
            System.out.println("Valor incorrector no sé tendrá en cuenta");
            A1 = 0;
        }
        maximo = A1;
        minimo = A1;
        System.out.println("Cuanto tiempo le dedicas");
        A2 = lector.nextFloat();

        if (A2 > 40.00F | A2 < 0.00F) {
            System.out.println("Valor incorrecto, no sé tendrá en cuenta");
            A2 = 0;

        }
        else if (A2 > maximo) {
            maximo = A2;
        }
        else if (A2 < minimo) {
            minimo = A2;
        }
        System.out.println("Cuanto tiempo le dedicas");
        A3 = lector.nextFloat();

        if (A3 > 40.00F | A3 < 0.00F) {
            System.out.println("Valor incorrecto, no se tendrá en cuenta");
            A3 = 0;
        }
        else if (A3 > maximo) {
            maximo = A3;
        }
        else if (A3 < minimo) {
            minimo = A3;
        }
        System.out.println("Cuanto tiempo le dedicas");
        A4 = lector.nextFloat();
        if (A4 > 40.00F | A4 < 0.00F) {
            System.out.println("Valor incorrecto, no sé tendrá en cuenta");
            A4 = 0;
        }
        else if (A4 > maximo) {
            maximo = A4;
        }
        else if (A4 < minimo) {
            minimo = A4;
        }
        System.out.println("Cuanto tiempo le dedicas");
        A5 = lector.nextFloat();
        if (A5 > 40.00F | A5 < 0.00F) {
            System.out.println("Valor incorrecto, no se tendrá en cuenta");
            A5 = 0;
        }
        else if (A5 > maximo) {
            maximo = A5;
        }
        else if (A5 < minimo) {
            minimo = A5;
        }

        System.out.println("Cuanto tiempo le dedicas");
        A6 = lector.nextFloat();
        if (A6 > 40.00F | A6 < 0.00F) {
            System.out.println("Valor incorrecto, no se tendrá en cuenta");
            A6 = 0;
        }
        else if (A6 > maximo) {
            maximo = A6;
        }
        else if (A6 < minimo) {
            minimo = A6;
        }

        System.out.println("Cuanto tiempo le dedicas");
        A7 = lector.nextFloat();
        if (A7 > 40.00F | A7 < 0.00F) {
            System.out.println("Valor incorrecto, no se tendrá en cuenta");
            A7 = 0;
        } else if (A7 > maximo | A7 < minimo) {
            maximo = A7;
            minimo = A7;
        }
        else if (A7 > maximo) {
            maximo = A7;
        }
        else if (A7 < minimo) {
            minimo = A7;
        }

        System.out.println("Cuanto tiempo le dedicas");
        A8 = lector.nextFloat();

        if (A8 > 40.00F | A8 < 0.00F) {
            System.out.println("Valor incorrecto, no se tendrá en cuenta");
            A8 = 0;
        }
        else if (A8 > maximo) {
            maximo = A8;
        }
        else if (A8 < minimo) {
            minimo = A8;
        }

        medio = A1 + A2 + A3 + A4 + A5 + A6 + A7 + A8 / 8;
        

        System.out.println("El tiempo medio es de " + medio);
        System.out.println("El máximo es de " + maximo);
        System.out.println("EL miimo es de " + minimo);

    }

}
