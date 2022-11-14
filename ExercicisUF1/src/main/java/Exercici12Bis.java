import java.util.Scanner;

public class Exercici12Bis
{
    public static void main(String[] args)
    {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int num = ent.nextInt();


        for (int i = 1 ; i <= num; i++)
        {
            if (num%i==0)
            System.out.println(i);
        }


    }
}
