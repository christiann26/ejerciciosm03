/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3examen;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio3examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int adultoprecio = 20, infantilprecio = 10, personas, adultos, menores;
        double porcentaje, total, suma, reducido;

        System.out.println("Escriben el numero de personas que quieren comprar la entrada");
        personas = lector.nextInt();

        System.out.println("Introduce el numero de menores que hay en el grupo");
        menores = lector.nextInt();

        adultos = personas - menores;

        adultoprecio = adultos * adultoprecio;

        infantilprecio = menores * infantilprecio;

        suma = adultoprecio + infantilprecio;

        if (personas < 10) {
            System.out.println(+adultos + " adultos " + menores + " menores ");
            System.out.println("El total es de " + suma + " euros");
        } else if (personas >= 10 && personas < 25) {
            porcentaje = 0.25 * suma;
            total = suma - porcentaje;
            System.out.println(+adultos + " adultos " + menores + " menores ");
            System.out.println("El total es de " + total + " euros");

        } else if (personas >= 25) {
            if (adultos != 0) {
                reducido = adultoprecio - 20;
                suma = reducido + infantilprecio;
            } else {
                reducido = infantilprecio - 10;
                suma = reducido;
            }

            porcentaje = 0.25 * suma;
            total = suma - porcentaje;

            System.out.println(+adultos + " adultos " + menores + " menores ");
            System.out.println("El total es de " + total + " euros");

        }

    }

}
