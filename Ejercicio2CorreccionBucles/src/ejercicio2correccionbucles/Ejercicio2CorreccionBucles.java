/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2correccionbucles;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio2CorreccionBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int menu;

        System.out.println("Selecciona una opción");
        System.out.println("0.Salir");
        System.out.println("1.Escribir 10 Veces");
        System.out.println("2.Cuenta atrás timbre");
        System.out.println("3.Numero entre 2 valors");
        System.out.println("Elije tu opcion");
        menu = lector.nextInt();

        switch (menu) {
            case 0:
                System.out.println("Has salido");
                break;
            case 1:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(+i + " A clase se viene a trabajar");
                }
                break;

            case 2:
                for (int i = 10; i >= 0; i--) {
                    System.out.print(" " + i);

                }
                System.out.println("RINGG");

            case 3:
                System.out.println("Introduce el primer número");
                int minimo = lector.nextInt();

                System.out.println("Introduce el segundo número");
                int maximo = lector.nextInt();

                //for (minimo = minimo; minimo < maximo; minimo++) {
                //  if (minimo % 2 == 0) {
                //    System.out.println("" + minimo);}
                for (int cont = minimo; cont <= maximo; cont++) {
                    if (cont % 2 == 0) {
                        System.out.println(" " + cont);

                    }
                }

        }

    }

}
