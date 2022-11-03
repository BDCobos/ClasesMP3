package nf1;

public class Format {
    public static void main(String[] args) {
        System.out.println("El valor "+Math.PI+" és de la constant");
        System.out.println();
        System.out.println();
       // No es pot deixar buit

        System.out.format("El valor %e de la constant PI", Math.PI);
        System.out.println();
        System.out.format("El valor %E de la constant PI", Math.PI);
        System.out.println();
        System.out.format("El valor %g de la constant PI", Math.PI);
        System.out.println();
        System.out.format("El valor %G de la constant PI", Math.PI);
        System.out.println();
        System.out.println();

        //CODIS DE FORMAT COMPLEXOS
        System.out.println("Codis de format més complexos");
        System.out.format("El valor %5.4f és de la constant PI", Math.PI);
        System.out.println();
        System.out.format("Salt de línia en codi de format %%n%n");

        System.out.println("Estic en una altra línia");

    }
}
