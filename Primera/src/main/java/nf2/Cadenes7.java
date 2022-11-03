package nf2;

public class Cadenes7
{
    public static void main(String[] args) {

        //ET DIU SI EL CARÀCTER INICIAL COMENÇA ES LA LLETRA

        if ("hola".startsWith("ho")) System.out.println("Si");
        else System.out.println("No");

        if ("hola".startsWith("o")) System.out.println("Si");
        else System.out.println("No");

        //ET DIU SI EL CARÀCTER FINAL ES LA LLETRA
        if ("hola".endsWith("ola")) System.out.println("Si");
        else System.out.println("No");

        if ("hola".endsWith("ol")) System.out.println("Si");
        else System.out.println("No");

        // CONTÉ AQUEST TEXT
        if("Anem a buscar un tros de text".contains("de text")) System.out.println("Si");
        else System.out.println("No");

        // SI AFEGIM TROS QUE NO SON NO HO BUSCARÁ O LLETRES MAJÚSCULES ENTRE ALTRES
        if("Anem a buscar un tros de text".contains("de")) System.out.println("Si");
        else System.out.println("No");

    }
}
