package nf1;

import java.util.Scanner;

public class Bucle1
{
    public static void main(String[] args) {

        // Bucle for ---> com es realitza
        /*
        for ( inicialització var_control; condició var_control ; actualització var_control)
        {
        instruccions que s'han de repetir;
        {
        */

        /*   ---> Les barres t'ajuden a separar els blocs i només et reconeix els valors que hi ha dins i no fora
        {
            int i = 0;
            System.out.println(i);
        }
        System.out.println(i);
        */

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int diners;

        //Entrada de dades
        diners = ent.nextInt();

        //Sortidad de dades
        for (int milio = 1000000; milio <= diners ; milio = milio + 1000000)
        {
            System.out.println(milio);
        }

        //Tot això equival a un while, en ocasions (while és mes potent)
    }
}