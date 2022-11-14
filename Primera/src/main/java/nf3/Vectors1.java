package nf3;

import java.util.Scanner;

public class Vectors1
{
    public static void main(String[] args)
    {
        Scanner ent = new Scanner(System.in);

        // Declaració de variables no vector
        int numero;
        String text;

        // Instanciació d'una variable no vector
        numero = 1;
        text = "Sóc un text";
        // text = new String("hola mundo"); ----> És el mateix de dalt, però no s'obliga

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        // Declaració de vectors
        int [] vector;
        char [] caracter;
        float [] temperatures;
        String [] cadena;

        // Instanciació de vectors
        // vector = new int [-1];  ----> No admet valors negatius ok!! (És una matriu)

        vector = new int[0];       // Molt important !! Una vegada declarada la dimensió del vector ja no la podem canviar
        caracter = new char[23];
        temperatures = new float[3];
        cadena = new String[3];

        // Declaració e intanciació de vectors en una sola línia en una sola instrucció

        int [] diesMesos =  {31,28,31,30,31,30,31,31,30,31,30,31};   // Dono valors a la meva matriu i ja me la fa de new int [12]

        // El mateix però en 2 instruccions separades:

        int [] diesMesBixest;
        diesMesBixest =  new int[] {31,28,31,30,31,30,31,31,30,31,30,31};

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Accés a les caselles d'un vector

        // No vector
        numero ++;
        numero = numero + 1;
        numero += 1;

        //Acccedim a la casella en index 1, o sigue, la 2º casella del vector
        /*
        diesMesos [1] ++;
        diesMesos [1] = diesMesos[1] + 1;
        diesMesos [1] += 1;
        */

        // Recorregut d'un vector utilitzant estructures repetitives
        for (int i = 0; i < diesMesos.length; i++)
        {
            System.out.format("El mes tal %d té %d dies %n", i+1, diesMesos[i]);  // el %d mostra després els valors que indico i+1, diesMesos[i]

        }

        for (int i = diesMesos.length-1; i >= 0; i--)
        {
            System.out.format("El mes tal %d té %d dies %n", i+1, diesMesos[i]);

        }

        System.out.println("Introdueix un número de mes(1-12)");
        int mesTriat = ent.nextInt();
        System.out.format("El mes %d té %d dies%n", mesTriat, diesMesos[mesTriat-1]);  // -1 perquè el nostre index sempre comença des de 0

    }
}
