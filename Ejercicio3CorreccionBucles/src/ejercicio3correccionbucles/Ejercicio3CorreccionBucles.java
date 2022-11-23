/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3correccionbucles;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio3CorreccionBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        boolean otraestancia = true;
        int altura, anchura, area = 0, areatotal = 0;

        while (otraestancia == true) {
            System.out.println("Introduce la altura de la estancia");
            altura = lector.nextInt();

            System.out.println("Introduce la anchura de la estancia");
            anchura = lector.nextInt();

            area = altura * anchura;
            areatotal = areatotal + area;

            System.out.println("Existe otra estancia? s/n");
            char opcion = lector.next().charAt(0);

            switch (opcion) {
                case 's':
                case 'S':
                    otraestancia = true;
                    break;
                case 'n':
                case 'N':
                    otraestancia = false;
                    break;
                default:
                    System.out.println("Opcion no valida");

            }

        }

        System.out.println("El area total de la casa es de " + areatotal);
    }

}
