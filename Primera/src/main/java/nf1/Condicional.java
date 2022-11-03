package nf1;

import java.util.Scanner;

public class Condicional
{
    public static void main(String[] args)
    {
        /* Estructura condicional ---> si la expressió booleana es true executem el codi de dins de les claus
                                       i si el codi és false continuem l'execució a continuació {
        if (expresio booleana)
        {
         codi....
         }
         codi continuació
         */

        Scanner sc = new Scanner(System.in);
        int a, b;

        // 1.- Demanem valors al usuari

        System.out.println("Introdueix dos valors enters;");
        a = sc.nextInt();
        b = sc.nextInt();

        // 2.- Escrivim "Són divisibles" si els números ho son i cas contrari mostra "No són divisibles"

        if (a % b == 0)
        {
            System.out.println("Són divisibles");
        }else {
            System.out.println("No són divisibles");
        }


    }
}
