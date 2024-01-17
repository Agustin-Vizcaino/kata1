import java.util.Random;

public class Main {
    static String[] fates;
    static Random random;

    static {
        fates = new String[] { "luck", "wealth", "misfortune" };
        random = new Random();
    }

    public static void main(String[] args) {
        System.out.println(fates[random.nextInt(fates.length)]);
    }
}