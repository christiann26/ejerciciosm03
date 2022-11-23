/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        int minutos;
        char dia, turno;
        float coste_base = 0.0F;
        float coste_impuesto = 0F;

        System.out.println("Introduce los minutos");
        minutos = lector.nextInt();
        System.out.println("Introduce inicial del dia");
        dia = lector.next().charAt(0);
        System.out.println("Introduce inicial 'm' si es mañana y 't' si es tarde");
        turno = lector.next().charAt(0);

        if (minutos <= 0) {
            System.out.println("Número incorrector");
        } else if (minutos <= 5) {
            coste_base = minutos * 1.0F;

        } else if (minutos <= 8) {
            coste_base = minutos * 0.80F;
        } else if (minutos <= 10) {
            coste_base = minutos * 0.70F;
        } else {
            coste_base = minutos * 0.50F;
        }

        if (dia == 'd' | dia == 'D') {//es domingo 3%
            coste_impuesto = coste_base * 0.03F;
        } else if (turno == 'm' | turno == 'M') {//mañana
            coste_impuesto = coste_base * 0.15F;
        } else if (turno == 't' | turno == 'T') {//tarde
            coste_impuesto = coste_base * 0.10F;
        } else {
            System.out.println("Turno o dias introducidos incorrectamente");
        }

        //Imrpimir resultado
        System.out.println("El coste base " + coste_base);
        System.out.println("El coste de los impuestos " + coste_impuesto);
        System.out.println("La suma de los costes es de "+(coste_base + coste_impuesto));
    }
    
}
