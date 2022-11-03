package nf1;

import java.util.Scanner;
public class Practica
{
    public static void main(String[] args)
    {
        //Programa que demana a l'usuari 2 valors enters
        //i escriu true si son divisibles entre ells
        //i false cas contrari

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix 2 valors enters: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // No cal declarar boolea
        /*/boolean divisible = true;
        divisible = num1 % num2 == 0;
        System.out.println(divisible);*/

        // Mostra el valor
        System.out.println(num1 % num2 == 0);  //Més directe
    }
}