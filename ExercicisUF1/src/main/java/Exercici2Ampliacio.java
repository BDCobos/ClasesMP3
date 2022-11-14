import java.util.Scanner;

public class Exercici2Ampliacio
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int cont = -50;
        while (cont<=val && cont>= -50){
            System.out.print(cont);
            if (cont%2 ==0)System.out.println(" és parell");
            else System.out.println(" és imparell");
            cont = cont + 1;
        }
    }
}