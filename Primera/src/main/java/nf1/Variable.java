package nf1;

public class Variable  // nom de classes PascalCase
{
    public static void main(String[] args)
    {
        // Zona de declaració de variables

        int num; // Declaració de variable
        num = 25;

        char lletra;
        int any = 2023;   // ---> variable de tipo int i nom any
        byte mes = 9;  // Declaració + inicialització de la variable
        short diaMes = 12;  // nom de variables ---> camelCase
        double real= 2.3;
        double _1real = 2.4;
        double real1, real2 = 3.4;   //Declaro 2 variables del mateix tipo
        boolean int1 = true;

        // Codi del programa
        System.out.println("Estem al any = "+any);
        System.out.println("Estem al mes = "+mes+1);
        System.out.println("Estem al mes = "+(mes+1));  // Si a mes li faig mes + 1 ==> me sumarà ja que son dos números, si fico parentesis prioritza
        System.out.println("Estem al dia = "+diaMes);
        System.out.println("Estem al any "+any+" mes "+mes+" dia "+diaMes);



        //inicialització de la lletra

        lletra = 'a';
    }
}
