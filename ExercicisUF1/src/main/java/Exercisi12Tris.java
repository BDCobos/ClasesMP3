import java.util.Scanner;

public class Exercisi12Tris
{
    public static void main(String[] args)
    {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int num = ent.nextInt();
        int suma = 0;


        for (int div = 1; div < num;  div++)
        {
            if (num%div==0) suma = suma+ div;
        }
        if (num==suma) System.out.println(num +" és perfecte");
        else System.out.println(num +" no és perfecte");

    }

}
