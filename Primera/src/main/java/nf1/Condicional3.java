package nf1;

import java.util.Scanner;

public class Condicional3
{

    public static void main(String[] args)
    {
        /*switch (expressio1) {
            case valor1;    //Només podem tractar un valor a cada cas
                codi;
                break;   //OPCIONAL --> continua fins trobar el break
            case valor2;

            default:    //OPCIONAL!!
        } */

       // Declaració de Variables
        Scanner sc = new Scanner(System.in);
        int numero;

        // li diem a l'usuari que escrigue un número enter
        System.out.println("Escriu un número enter: ");
        numero = sc.nextInt();

        // Ara direm si el número val o 1 o 2
        switch (numero)
        {
            case 1:     //if (numero == 1) System.out.println("Val 1";
                System.out.println("Val 1");
                break;
            case 2:     //if (numero == 2) System.out.println("Val 2";
                System.out.println("Val 2");
                break;
            default:
                System.out.println("No val ni 1 ni 2");

        // If else equivalent al switch
        // if (nom.equals ("Donalds")) System.out.printl("Ets Donalds");
        // else System.out.println("No ets Donalds");
        }
    }
}