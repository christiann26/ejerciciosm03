/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFunciones;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero");
        num = lector.nextInt();
        
        tablamultiplicar(num);
    }

    public static void tablamultiplicar(int n) {
        int mult;
        for (int cont = 1; cont <= 10; cont++) {
            mult = n * cont;
            System.out.println(+n + " x " + cont + " = " + mult);
        }

    }

}
