public class Exercici2
{
    public static void main(String[] args)
    {

        byte cont = -50;
        while (cont<=50){
            System.out.print(cont);
            if (cont%2 ==0)
            {
                System.out.println(" és parell");
            } else{
                System.out.println(" és imparell");
            }
            cont = (byte) + (cont + 1) ;
        }
    }
}