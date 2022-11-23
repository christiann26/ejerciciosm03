/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3correccionbuclesv2;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio3CorreccionBuclesV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        int altura, anchura, area = 0, areatotal = 0;
        char opcion;
        do {
            System.out.println("Introduce la altura de la estancia");
            altura = lector.nextInt();

            System.out.println("Introduce la anchura de la estancia");
            anchura = lector.nextInt();

            area = altura * anchura;
            areatotal = areatotal + area;

            System.out.println("Existe otra estancia? s/n");
            opcion = lector.next().charAt(0);

        } while (opcion == 's' || opcion == 'S');

        System.out.println("El area total de la casa es de " + areatotal);
    }

}
