package nf3;

import java.util.Scanner;

public class Vectors2
{
    public static void main(String[] args)
    {
        Scanner ent = new Scanner(System.in);

        int numCaselles;  // --> ho introduïra l'usuari
        int [] vector;    // --> de moment no l'instanciem

        //......
        // Demanem a l'usuari la quantitat de caselles necessàries
        System.out.println("Quantes caselles necessites (>=0)?: ");
        numCaselles = ent.nextInt();

        // A partir d'aquí ja que sé quantes caselles necessita el vector i per tant ja el puc instanciar
        vector = new int[numCaselles];  // --> són sempre número enters

        //...més instruccions
        numCaselles ++;

        System.out.println("Fins quina casella vols tractar (>=0 i <=?: ");
        int finsQuinaCasella = ent.nextInt();

        // Recorregut del vector
        for (int i = 0; i < finsQuinaCasella; i++)
        {
            System.out.println(vector[i]);
        }
    }
}
