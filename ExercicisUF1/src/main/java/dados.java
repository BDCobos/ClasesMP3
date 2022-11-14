import java.util.Random;

public class dados {
    public static void main(String[] args) {

        Random r = new Random();
        int d6 = r.nextInt(6) + 1;
        System.out.println(d6);
    }
}