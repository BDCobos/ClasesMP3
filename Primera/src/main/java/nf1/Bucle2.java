package nf1;

import java.util.Scanner;
public class Bucle2
{
    public static void main(String[] args)
    {
        // Programa que demana un entera l'usuari i mostra la seqüencia
        //d'1 fins al número introduït

        //Declaració de variables
        Scanner sc = new Scanner(System.in);
        int num, comptador=0;

        //Demanem l'entrada a l'usuari
        num = sc.nextInt();

        //Mostrar la sortida
        /*while (condició) --- Mentre la condició es certa entrem al bucle, si és falsa anem a les instruccions que hi ha a continuacó del bucle
        {

            Instruccions

        } -- Final del bucle --> Tornem a l'inici del bucle, on está la paraula while

        Instruccions després del bucle
        System.out.println("Hem sortit del bucle");
        */

        //Fem la prova del while
        while (comptador<=num)
        {
            System.out.println(comptador);
            comptador = comptador + 1;

        }
        System.out.println();
        System.out.println("Ha finalitzat el bucle");
    }
}