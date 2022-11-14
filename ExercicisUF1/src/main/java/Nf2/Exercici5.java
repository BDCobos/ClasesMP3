package Nf2;

import java.util.Scanner;

public class Exercici5
{
    public static void main(String[] args)
    {
       
        Scanner ent = new Scanner(System.in);
        String text = "";

        System.out.println("Introdueix un text acabat acabat en punt ('.')");

        do {
            text += ent.nextLine().trim();  // trim ---> elimina si el usuari deixa espais tant al a la dreta o a la esquerra
            if (text.endsWith(".")) break;  // Sortir del bucle, si el text acaba en punt
            else text += "\n";              // afegim salt de línia només si no
                                            // a l'última línia

        }while (true);

        // Anem a llegir un text no buit format per una sola línia
        String busquem;

        System.out.println("Introdueix un text no buit acabat en intro (INTRO)");
        do {
            busquem = ent.nextLine().trim();
        }while (busquem.isEmpty());


        //Anem a buscar el segon text dins del primer
        int index = 0, comptador = 0;
        do {
            index =text.indexOf(busquem,index);
            if (index != -1){
                index ++;
                comptador++;
            }

        }while (index != -1);
        System.out.format ("El text: %n\"%s\"%nconté el text: %n\"%s\"%n%d vegades.%n", text, busquem,comptador);
    }
}