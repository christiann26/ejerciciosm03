/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionprueba;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class FuncionPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int idioma = 1;
        //int x = 1;
        //char hola_adios = 'A';
        //System.out.println(x);
        //imprimeHelloWorldconIdioma(x, hola_adios);
        int calculo = doble(idioma);
        System.out.println(calculo);
    }

    public static int doble(int a) {
        int resultado = a * 2;
        return resultado;
    }

    public static void imprimeHelloWorldconIdioma(int idioma, char helloGoodbye) {

        switch (idioma) {
            case 1:
                if (helloGoodbye == 'H') {
                    System.out.println("Hello World");
                } else if (helloGoodbye == 'A') {
                    System.out.println("Goodbye");
                }
                break;
            case 2:
                System.out.println("Hola Mon");
                System.out.println("Adeu");
                break;
            default:
                System.out.println("Hola mundo");
                System.out.println("Adios");
                break;
        }

    }

}
