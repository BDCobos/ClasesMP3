package nf2;

import java.util.Scanner;

public class MaximMinim
{
    public static void main(String[] args)
    {
        Scanner ent = new Scanner(System.in);

        // No donem valors sino que donem máxim i mínim
        int maxim = Integer.MIN_VALUE;
        int minim = Integer.MAX_VALUE;
        int num;

        for (int i = 0; i <5 ; i++)
        {
            num = ent.nextInt();
            if (num>maxim) {
                maxim =num;
            }
            if (num<minim){
                minim= num;

            }
        }
        System.out.println("El valor máxim es: "+maxim);
        System.out.println("El valor mínim es: "+minim);

    }
}
