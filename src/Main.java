import java.util.Random;

public class Main {
    static String[] fates;
    static Random random;
    static int len;

    static {
        fates = new String[] { "luck", "wealth", "misfortune" };
        len = fates.length;
        random = new Random();
    }

    public static void main(String[] args) {
        System.out.println("Behold! Your fate for today is, as revealed by the Digital 8-Ball: " + fates[random.nextInt(len)]);
    }
}