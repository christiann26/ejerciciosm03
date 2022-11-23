/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicador10;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Multiplicador10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int multiplicacion;

        for (int num = 0; num <= 10; num++) {
            for (int cont = 0; cont <= 10; cont++) {

                multiplicacion = num * cont;
                System.out.println("" + num + "x" + cont + "=" + multiplicacion + " ");

            }
        }
    }

}
