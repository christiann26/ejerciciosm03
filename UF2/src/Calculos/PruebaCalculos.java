/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculos;
//prueba calculos
/**
 *
 * @author chsa9814
 */
public class PruebaCalculos {

    public static void main(String[] args) {

        int num1 = 9, num2 = 7;

        int maximo = Math.max(num1, num2);

        System.out.println("El numero mas grande es el " + maximo);

        double decimales = 345.671;

        Long entero = Math.round(decimales);

        System.out.println("Numero redondeado " + entero);

        int numaleatorio = (int) (Math.random() * 10);

        System.out.println("Aleatorio " + numaleatorio);

        int negativo = Math.negateExact(6);

        System.out.println("Numero negativo " + negativo);

        double exponente = Math.pow(2, 2);

        System.out.println("Potencia 2 eleveado a 2 = " + exponente);

    }

}
