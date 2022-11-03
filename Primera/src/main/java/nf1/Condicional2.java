package nf1;

import java.util.Scanner;

public class Condicional2
{
    public static void main(String[] args)
    {
        /* Estructura condicional ---> si la expressió booleana es true executem el codi de dins de les claus
                                       i si el codi és false continuem l'execució a continuació {
        if (expressió booleana)
        {
         codi....
         } else {
            codi continuació
            Sino aplica el if continua amb el else i mostra el interior
         }
         */

        Scanner sc = new Scanner(System.in);
        int a, b;

        // 1.- Demanem valors al usuari

        System.out.println("Introdueix dos valors enters;");
        a = sc.nextInt();
        b = sc.nextInt();

        // 2.- Escrivim "Són divisibles" si els números ho son i cas contrari mostra "No són divisibles"

        // Altra manera de fer-ho es if (a % b != 0)
        if (a % b == 0)
        {
            System.out.println("Són divisibles");
        }else {
            System.out.println("Nó son divisibles");
        }
    }
}