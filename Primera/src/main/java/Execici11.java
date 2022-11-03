import java.util.Scanner;

public class Execici11 {
    public static void main(String[] args) {

        //DECLARACIÓ DE VARIABLES
        Scanner ent = new Scanner(System.in);
        double base;

        //ENTRADA DE VALORS
        System.out.println("Ingresa un valor");
        base = ent.nextDouble();
        for (int i = 0; i <=10 ; i++) {
            System.out.println(Math.pow(base, i));
        }




    }
}
