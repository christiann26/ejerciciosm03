/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicarepasoviernes;

import java.util.Scanner;

/**
 *
 * @author chsa9814
 */
public class PracticarepasoViernes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escribe un programa que pida el limite inferior y superior de un intervalo.  Si el límite inferior es mayor que el superior lo tiene que volver a pedir.  A continuación se van introduciendo números hasta que introduzcamos el 0.
//Cuando termine el programa dará las siguientes informaciones
//– La suma de los números que están dentro del intervalo (intervalo abierto).
//– Cuantos números están fuera del intervalo.
//– Informa si hemos introducido algún número igual a los límites del intervalo.

        Scanner lector = new Scanner(System.in);
        int numero, inferior, superior, contador = 0, suma = 0;
        do {
            System.out.println("Introduce el valor inferior");
            inferior = lector.nextInt();
            System.out.println("Introduce el valor superior:");
            superior = lector.nextInt();
            System.out.println(inferior + "-" + superior);
        } while (inferior > superior);
        boolean limites = false;
        do {
            System.out.println("Introduce un valor:");
            numero = lector.nextInt();
            if (numero < inferior && numero != 0) {//System.out.println("Inferior");
                contador = contador + 1;
            } else if (numero > superior && numero != 0) {//System.out.println("Superior");
                contador = contador + 1;
            }
            if (numero >= inferior && numero <= superior) {
                suma = suma + numero;
            }
            if (numero == inferior || numero == superior) {
                limites = true;
                //System.out.println("Has puesto el mismo numero");
            }
        } while (numero != 0);

        System.out.println("Los numeros de fuera es " + contador);
        System.out.println("La suma de dentro de los intervalos es: " + suma);
        if (limites == true) {
            System.out.println("has puesto el mismo numero");
        }
    }

}

    
    

