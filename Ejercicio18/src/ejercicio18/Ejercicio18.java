/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        double salario, horas, precio, salarionormal, horasextra, salarioextra;
        final int horas_normales = 35;
        System.out.println("Introduce las horas");
        horas = lector.nextDouble();

        System.out.println("Introduce el precio");
        precio = lector.nextDouble();

        if (horas > horas_normales) {
            salarionormal = horas_normales * precio;
            horasextra = horas - horas_normales;
            salarioextra = precio * horasextra * 1.5;
            salario = salarionormal + salarioextra;

        } else {
            salario = horas * precio;

        }
        System.out.println("El salario es de " + salario);
    }

}
