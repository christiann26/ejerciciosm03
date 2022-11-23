/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examennf1;

import java.util.Scanner;

/**
 *
 * @author lule4853
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char TipoDia; 
        int TipoAlmuerzo;
        
        System.out.println("Que tipo de dia es: Laboral(L), sabado(S) o festio(F)?");
        TipoDia = sc.next().charAt(0);
        
        switch (TipoDia){
            
            case 'L','l':
                System.out.println("Que tipo de almuerzo quieres 1 o 2");
                TipoAlmuerzo = sc.nextInt();
                
                switch (TipoAlmuerzo) {
                    case 1:
                        System.out.println("El precio del almuerzo sera 2,00 euros");
                        break;
                    case 2:
                        System.out.println("El precio del almuerzo sera 2,50 euros");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                } 
            break;
            
            case 'S','s':
                System.out.println("Que tipo de almuerzo quieres 1 o 2");
                TipoAlmuerzo = sc.nextInt();
                
                switch (TipoAlmuerzo) {
                    case 1:
                        System.out.println("El precio del almuerzo sera 2,20 euros");
                        break;
                    case 2:
                        System.out.println("El precio del almuerzo sera 2,70 euros");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            break;

            case 'F','f':
                System.out.println("Que tipo de almuerzo quieres 1 o 2");
                TipoAlmuerzo = sc.nextInt();
                
                switch (TipoAlmuerzo) {
                    case 1:
                        System.out.println("El precio del almuerzo sera 2,30 euros");
                        break;
                    case 2:
                        System.out.println("El precio del almuerzo sera 2,80 euros");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
    
}
