/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicar;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class Multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num, multiplicacion;
        System.out.println("Introduce un numero");
        num = lector.nextInt();

        for (int cont = 0; cont <= 10; cont++) {

            multiplicacion = num * cont;
            System.out.print(""+num+"x"+cont+"="+multiplicacion+" ");

        }

    }

}
