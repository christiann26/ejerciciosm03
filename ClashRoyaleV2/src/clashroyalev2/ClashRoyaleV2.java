/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyalev2;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class ClashRoyaleV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int copas;
        System.out.println("Cuantas copas tienes");
        copas = lector.nextInt();
        System.out.println("Escoge Carta");

        if (copas > 0 && copas < 2000) {
            System.out.println("A.Mago Electrico");
            System.out.println("B.Mega Esbirro");
            char opcion = lector.next().charAt(0);

            switch (opcion) {
                case 'a':
                case 'A':
                    System.out.println("Has escogido Mago Electrico");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Has escogido Mega Esbirro");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        } else if (copas >= 2000 && copas < 3000) {
            System.out.println("A.Caballero");
            System.out.println("B.Bandida");
            char opcion2 = lector.next().charAt(0);
            switch (opcion2) {
                case 'a':
                case 'A':
                    System.out.println("Has escogido Caballero");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Has escogido Bandida");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        } else if (copas >= 3000) {
            System.out.println("A.Esqueletos");
            System.out.println("B.Gigante Noble");
            char opcion3 = lector.next().charAt(0);
            switch (opcion3) {
                case 'a':
                case 'A':
                    System.out.println("Has escogido Esqueletos");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Has escogido Gigante noble");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }
    }

}
