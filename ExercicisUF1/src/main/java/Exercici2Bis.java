import java.util.Scanner;
public class Exercici2Bis
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Declaració de variables
        byte comptador;
        byte numIni;
        byte numFin;

        //Demanem l'entrada a l'usuari  ---> límit inferior de la seqüencia a mostrar
        System.out.println("Introdueix un enter (-128....127)");
        numIni = sc.nextByte();
        comptador = numIni;

        //Demanem l'entrada a l'usuari  ---> límit superior de la seqüencia a mostrar
        System.out.println("Introdueix un enter (-128....127)");
        numFin = sc.nextByte();

        //Mostrar la sortida
        while (comptador <= numFin && comptador >= numIni && comptador != 127)
        {
            System.out.print(comptador);
            if (comptador % 2 == 0)System.out.println(" és parell");
            else System.out.println(" és imparell");
            comptador = (byte) (comptador + 1);
        }

        //Mirem si hem de mostrar el 127
        if (numFin == 127)
        {
            System.out.println("127 és imparell");
        }


    }
}