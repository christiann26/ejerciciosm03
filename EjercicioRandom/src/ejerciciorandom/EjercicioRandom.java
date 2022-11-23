/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorandom;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class EjercicioRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Random rd = new Random();
        int aleatorio, num;
        aleatorio = rd.nextInt(10) + 1;

        do {
            System.out.println("Introduce un numero");
            num = lector.nextInt();

            if (num > aleatorio) {
                System.out.println("El numero es menor");
            } else if (num < aleatorio) {
                System.out.println("El numero es mayor");
            }
        } while (num != aleatorio);
        System.out.println("Has acertado");
    }

}
