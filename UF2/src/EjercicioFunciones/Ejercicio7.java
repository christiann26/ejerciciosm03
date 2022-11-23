/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioFunciones;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double altura, anchura, area, perimetro;

        System.out.println("Introduce la altura");
        altura = lector.nextDouble();

        System.out.println("Introduce la anchura");
        anchura = lector.nextDouble();

        perimetro = perimetro(altura, anchura);
        
        area = area(altura,anchura);
        
        
        System.out.println("El perimetro es de "+perimetro);
        System.out.println("El area es de "+area);

    }

    public static double perimetro(double alto, double ancho) {
        double perimetro;

        perimetro = 2 * (alto + ancho);

        return perimetro;

    }
    
    public static double area(double alto, double ancho){
    double area;
    
    area = alto * ancho;
    
    return area;
    
    }
    
    
}
