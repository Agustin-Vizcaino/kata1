public class Main {
    static String[] fates;

    static {
        fates = new String[] { "luck", "wealth", "misfortune" };
    }

    public static void main(String[] args) {
        System.out.println(fates[1]);
    }
}