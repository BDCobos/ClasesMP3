package nf2;

import java.util.Scanner;

public class Cadenes5
{
    public static void main(String[] args)
    {

        Scanner ent = new Scanner(System.in);

        //  LECTURA D'UN SOLL CARÀCTER EN L'SCANNER

        System.out.println("Introdueix un càracter: ");
        char c = ent.nextLine().charAt(0);
        System.out.println("Has introduït: "+c);

        System.out.println("Introdueix una caràcter: ");
        String resposta = ent.nextLine();
        if (resposta.length()!= 0) c= resposta.charAt(0);
        else c = ' ';
        System.out.println("Has introduït: "+c);



    }

}
