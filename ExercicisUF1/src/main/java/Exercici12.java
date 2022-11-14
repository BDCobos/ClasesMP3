import java.util.Scanner;
public class Exercici12
{
    public static void main(String[] args)
    {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int num = ent.nextInt();
        int fact = 2;

        System.out.print(num + " = 1");

        //Instruccions si num%fact == 0 guardará el valor --- Cas contrari fact anirá sumant +1 fins % doni 0
        if (num == 0) System.out.print(num + " = No té descomposició factorial");

        while (num != 1)
        {
            if (num % fact == 0)
            {
                System.out.print(" * " + fact);
                num = num / fact;      //Se pot abreviar num /= fact; (es un equivalent)
            }else fact ++;
        }
    }
}