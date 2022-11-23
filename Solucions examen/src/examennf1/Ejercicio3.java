/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examennf1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lule4853
 */
public class Ejercicio3 {
    public static void main(String[] args){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int multi, respuesta, contador = 0;
        int random = rd.nextInt(9)+1;
        System.out.println("Tabla de multiplicar del numero " + random);
        for (int i = 1; i <= 10; i++) {
            multi = random * i;
            System.out.print(random +"*"+ i +"=");
            respuesta = sc.nextInt();
            if(respuesta != multi){
                contador ++;
                System.out.println("Incorrecto! " +random +"*"+ i +" es igual a " + multi);
            }
            
        }
        System.out.println("Has tenido un total de " + contador +" errores");
    }
}
