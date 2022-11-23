/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m05;

import java.util.Scanner;

/**
 *
 * @author chrcr
 */
public class Ex6_ZodiacoRefactorizado {

    /**
     * 6) Obre la classe Ex6_Zodiaco i aplica les següents refraccions: 1.
     * Canvia el nom de la classe per Ex6_ZodiacoRefractorizado 2. Canvia el nom
     * de dues variables, les que vulguis. 3. Converteix el número 31 i el
     * número 12 en constants. 4. Ubica el codi al voltant de la fase 3 en un
     * mètode apart.
     */
    public static void main(String[] args) {
        //Fase uno (Coge los datos del usuario)
        System.out.println("Adivina tu signo del Zodiaco.");
        Scanner sc = new Scanner(System.in);
        boolean respuestasOKCambio = true;

        System.out.println("¿Que dia naciste?(1-31)");
        int diaNCambio = sc.nextInt();

        System.out.println("¿En que mes naciste?(1-12)");
        int mesN = sc.nextInt();

        //Fase dos (Verifica los datos del usuario)
        respuestasOKCambio = diaNCambio > 0 && diaNCambio <= Dia31;
        respuestasOKCambio = respuestasOKCambio && mesN > 0 && mesN <= Dia12;

        System.out.println();
        String Signo = "";
        if (respuestasOKCambio) {
            Signo = Fase3(diaNCambio, mesN, Signo);

            //Fase cuatro, mostrar resultado.
            System.out.println("Tu signo es " + Signo);
        } else {
            System.out.println("El mes o el dia no son correctos.");
        }
    }

    private static String Fase3(int diaNCambio, int mesN, String Signo) {
        //Fase tres (Calculando datos)
        System.out.println("Calculando");
        if (diaNCambio >= 21 && mesN == 3 || diaNCambio <= 20 && mesN == 4) {
            Signo = "Aries";
        }
        if (diaNCambio >= 21 && mesN == 4 || diaNCambio <= 21 && mesN == 5) {
            Signo = "Tauro";
        }
        if (diaNCambio >= 22 && mesN == 5 || diaNCambio <= 21 && mesN == 6) {
            Signo = "Geminis";
        }
        if (diaNCambio >= 21 && mesN == 6 || diaNCambio <= 27 && mesN == 7) {
            Signo = "Cancer";
        }
        if (diaNCambio >= 24 && mesN == 7 || diaNCambio <= 23 && mesN == 8) {
            Signo = "Leo";
        }
        if (diaNCambio >= 24 && mesN == 8 || diaNCambio <= 23 && mesN == 9) {
            Signo = "Virgo";
        }
        if (diaNCambio >= 24 && mesN == 9 || diaNCambio <= 23 && mesN == 10) {
            Signo = "Libra";
        }
        if (diaNCambio >= 24 && mesN == 10 || diaNCambio <= 22 && mesN == 11) {
            Signo = "Escorpio";
        }
        if (diaNCambio >= 23 && mesN == 11 || diaNCambio <= 21 && mesN == 12) {
            Signo = "Sagitario";
        }
        if (diaNCambio >= 22 && mesN == 11 || diaNCambio <= 20 && mesN == 1) {
            Signo = "Capricornio";
        }
        if (diaNCambio >= 21 && mesN == 1 || diaNCambio <= 19 && mesN == 2) {
            Signo = "Acuario";
        }
        if (diaNCambio >= 20 && mesN == 2 || diaNCambio <= 20 && mesN == 3) {
            Signo = "Picis";
        }
        //Fin fase tres (Calculando datos)
        return Signo;
    }
    private static final int Dia12 = 12;
    private static final int Dia31 = 31;
}
