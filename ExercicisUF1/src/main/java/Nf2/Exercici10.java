package Nf2;

import java.util.Scanner;

public class Exercici10
{
    public static void main(String[] args)
    {

        Scanner ent = new Scanner(System.in);

        String text = "";

        System.out.println("Introdueix un text acabat acabat en punt ('.')");
        // Demanem el text al usuari
        do
        {
            text += ent.nextLine().trim();  // trim ---> elimina si el usuari deixa espais tant al a la dreta o a la esquerra
            if (text.endsWith(".")) break;  // Sortir del bucle, si el text acaba en punt
            else text += "\n";              // afegim salt de línia només si no
                                            // a l'última línia
        } while (true);


        // Eliminem els separadors del text
        String noespai = "", separadors = " ,'.\n;:-";
        for (int i = 0; i < text.length() ; i++)
        {
            char c = text.charAt(i);
            //if (c != ' ' && c != ',' && c != '\'' && c != '.' && c != '\n')
            if (!separadors.contains(Character.toString(c)))  // (c+"")     // Això remplaza el if anterior i conté els separadors
            {
                noespai = noespai + c;

            }
        }

        // Copiem el text original i sense espais i convertit a minúscules
        text = noespai.toLowerCase();

        //
        int i;
        for (i = 0; i <= (text.length()/2)-1; i++)
        {
            char j = text.charAt(text.length()-1 -i);
            if (text.charAt(i) != j) break;
        }

        if (i > (text.length()/2)-1)
        {
            System.out.println("És palíndrom!");
        } else
            System.out.println("No és palíndrom!");
    }
}
