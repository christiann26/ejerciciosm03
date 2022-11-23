/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examennf1;

import java.util.Scanner;

/**
 *
 * @author lule4853
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float minimo, maximo;
        float Fahrenheit;
        System.out.print("Introduce la temeperatura minima:");
        minimo = sc.nextFloat();
        System.out.print("Introduce la temeperatura maxima:");
        maximo = sc.nextFloat();
        while(minimo <= maximo){
            Fahrenheit = (float) (1.8 * minimo +32);
            System.out.println(+minimo +" C - " + +Fahrenheit + " F");
            minimo++ ;
            
            
        }
    }
}
