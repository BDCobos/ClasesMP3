package nf1;

import java.util.Scanner;

public class Lectura
{
    public static void main(String[] args)
    {
        // 1- Declaro una variable de tipo Scanner
        Scanner ent = new Scanner(System.in);
        int numero;
        double real, suma;


        // 2- Vaig a llegir una dada... entera (int)
        // i la guardo en una variable entera
        System.out.println("Introdueix un valor enter i un valor decimal: ");
        numero = ent.nextInt();
        real = ent.nextDouble();

        // 3- Treballo en la variable de la manera que vulgue
        System.out.println("La variable val = "+numero);

        // Realitzem sumes
        System.out.println("La suma dels valors = "+numero+real);    // INCORRECTE, concatena i no suma
        System.out.println("La suma dels valors = "+(numero+real));  // CORRECTE
        suma = numero + real;
        System.out.println("La suma dels valors = "+suma);            // CORRECTE, però més llarg



    }
}
