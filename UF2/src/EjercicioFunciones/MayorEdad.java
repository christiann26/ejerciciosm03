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
public class MayorEdad {

    /**
     *
     * @author chsa9814
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int edad;
        System.out.println("Introduce tu edad");
        edad = lector.nextInt();
        
        boolean MayorEdad = EsMayorDeEdad(edad);
        if (MayorEdad == true) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    }

    public static boolean EsMayorDeEdad(int num) {
        boolean EsMayor;

        if (num >= 18) {

            EsMayor = true;
        } else {
            EsMayor = false;
        }
        return EsMayor;
    }

}
