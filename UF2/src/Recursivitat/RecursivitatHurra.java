/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursivitat;

/**
 *
 * @author chsa9814
 */
public class RecursivitatHurra {

    public static void main(String[] args) throws InterruptedException {
        int num = 5;

        salud(num);

    }

    public static void salud(int n) {
        //casobase

        if (n == 0) {
            System.out.println("Hurra!!");
        } else {
            System.out.println(n + " Hip");
            salud(n - 1);
        }
    }

}
