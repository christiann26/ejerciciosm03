
package recursivitat;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class suma2numeros {
    
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
          System.out.println("Dime el numero minimo");
          int num1 =  sc.nextInt();
          System.out.println("Dime el numero maximo");
          int num2 =  sc.nextInt();
          
          int sumaTotal=sumaEntreDosNumeros(num1,num2);
            System.out.println("La suma es " + sumaTotal);
        }

    private static int sumaEntreDosNumeros(int minimo, int maximo) {
        int v1;
        if(minimo>maximo)
        {
          v1 = maximo;
          maximo=minimo;  
          minimo=v1;
        }
        
        
        
        if(minimo==maximo)
        {
            return minimo;
        }
        else if(maximo>minimo)
        {
            return maximo + sumaEntreDosNumeros(minimo, maximo-1);
        }
        return -1;
    }
          
}



