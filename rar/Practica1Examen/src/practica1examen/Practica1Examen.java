/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1examen;

import java.util.Scanner;

/**
 *
 * @author chrcr
 */
public class Practica1Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        float minutos, m1, m2, m3, m4, domingo, mañana, tarde, opción, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21, m22;

        System.out.println("Introduce los minutos");
        minutos = lector.nextFloat();
//Aqui hago elegir que indique si es domingo y sino que diga si es mañana o tarde
        System.out.println("1.Es domingo?");
        System.out.println("Si no es domingo di si es de mañana o tarde");
        System.out.println("--------------------------------------------");
        System.out.println("2.Es tarde?");
        System.out.println("3.Es mañana?");

        System.out.println("Introduce una opción");
        opción = lector.nextInt();
//Aqui primero aplica la formula de los minutos
        m1 = minutos * 1;
        m2 = minutos * 0.80F;
        m3 = minutos * 0.70F;
        m4 = minutos * 0.50F;
//Aqui aplico la formula si es domingo tarde o mañana
//domingo
        m11 = (0.03F * m1) + m1;
        m12 = (0.03F * m2) + m2;
        m13 = (0.03F * m3) + m3;
        m14 = (0.03F * m4) + m4;
//tarde
        m15 = (0.10F * m1) + m1;
        m16 = (0.10F * m2) + m2;
        m17 = (0.10F * m3) + m3;
        m18 = (0.10F * m4) + m4;
//mañana
        m19 = (0.15F * m1) + m1;
        m20 = (0.15F * m2) + m2;
        m21 = (0.15F * m3) + m3;
        m22 = (0.15F * m4) + m4;
 //Aqui empiezo con las condiciones, si la opción es 1 quiere decir que es domingo, aplico sus respectivas formulas.       
        if (opción == 1) {

            if (minutos == 0 | minutos == 1 | minutos == 2 | minutos == 3 | minutos == 4 | minutos == 5) {
                System.out.println("El precio antes del impuesto es de" + m1);
                System.out.println("El precio despúes del impuesto es de " + m11);

            } else if (minutos == 6 | minutos == 7 | minutos == 8) {
                System.out.println("El precio antes del impuesto es de " + m2);
                System.out.println("El precio despúes del impuesto es de " + m12);
            } else if (minutos == 9 | minutos == 10) {
                System.out.println("El precio antes del impuesto es de " + m3);
                System.out.println("El precio despúes del impuesto es de " + m13);
            } else if (minutos >= 11) {
                System.out.println("El precio antes del impuesto es de " + m4);
                System.out.println("El precio despúes del impuesto es de " + m14);
            }
        }
        //Aqui empiezo con las condiciones, si la opción es 2 quiere decir que es tarde, aplico sus respectivas formulas.
        if (opción == 2) {

            if (minutos == 0 | minutos == 1 | minutos == 2 | minutos == 3 | minutos == 4 | minutos == 5) {
                System.out.println("El precio antes del impuesto es de" + m1);
                System.out.println("El precio despúes del impuesto es de " + m15);
            } else if (minutos == 6 | minutos == 7 | minutos == 8) {
                System.out.println("El precio antes del impuesto es de " + m2);
                System.out.println("El precio despúes del impuesto es de " + m16);
            } else if (minutos == 9 | minutos == 10) {
                System.out.println("El precio antes del impuesto es de " + m3);
                System.out.println("El precio despúes del impuesto es de " + m17);
            } else if (minutos >= 11) {
                System.out.println("El precio antes del impuesto es de " + m4);
                System.out.println("El precio despúes del impuesto es de " + m18);
            }
        }
        //Aqui empiezo con las condiciones, si la opción es 3 quiere decir que es mañana, aplico sus respectivas formulas.
        if (opción == 3) {

            if (minutos == 0 | minutos == 1 | minutos == 2 | minutos == 3 | minutos == 4 | minutos == 5) {
                System.out.println("El precio antes del impuesto es de" + m1);
                System.out.println("El precio despúes del impuesto es de " + m19);
            } else if (minutos == 6 | minutos == 7 | minutos == 8) {
                System.out.println("El precio antes del impuesto es de " + m2);
                System.out.println("El precio despúes del impuesto es de " + m20);
            } else if (minutos == 9 | minutos == 10) {
                System.out.println("El precio antes del impuesto es de " + m3);
                System.out.println("El precio despúes del impuesto es de " + m21);
            } else if (minutos >= 11) {
                System.out.println("El precio antes del impuesto es de " + m4);
                System.out.println("El precio despúes del impuesto es de " + m22);
            }
        }

    }
}
