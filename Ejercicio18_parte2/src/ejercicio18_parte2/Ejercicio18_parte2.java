/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18_parte2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio18_parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        double salario_neto, horas, precio, salarionormal, horasextra, salarioextra, impuesto, salario_impuesto, calculo_impuesto;

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

        System.out.println("El salario  neto es de " + salario_neto);

        if (salario_neto > 500) {
            calculo_impuesto = salario_neto - 500;
            impuesto = calculo_impuesto * 0.25;
            salario_impuesto = salario_neto - impuesto;
            System.out.println("El salario final es de " + salario_impuesto);

        } else {
            System.out.println("El salario final es de " + salario_neto);
        }

    }

}
