/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18_parte3;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio18_parte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        double salario_neto, horas, precio, salarionormal, horasextra, salarioextra, impuesto, salario_impuesto,
                calculo_impuesto, calculo_impuesto2, impuesto2, salario_impuesto2;

        System.out.println("Introduce las horas");
        horas = lector.nextDouble();

        System.out.println("Introduce el precio");
        precio = lector.nextDouble();

        if (horas > 35) {
            salarionormal = 35 * precio;
            horasextra = horas - 35;
            salarioextra = precio * horasextra * 1.5;
            salario_neto = salarionormal + salarioextra;

        } else {
            salario_neto = horas * precio;

        }

        System.out.println("El salario neto es de " + salario_neto);

        if (salario_neto > 500 && salario_neto <= 900) {
            calculo_impuesto = salario_neto - 500;
            impuesto = calculo_impuesto * 0.25;
            salario_impuesto = salario_neto - impuesto;
            System.out.println("El salario final es de " + salario_impuesto);

            if (salario_neto > 900) {
                calculo_impuesto2 = salario_neto - 900;
                impuesto2 = calculo_impuesto2 * 0.45;
                salario_impuesto2 = salario_impuesto - impuesto2;
                System.out.println("El salario final es de " + salario_impuesto2);
            }
        }

    }

}
