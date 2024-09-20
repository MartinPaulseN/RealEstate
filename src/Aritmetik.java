public class Aritmetik {
    public static void main(String[] args) {
        int i = 34;
        int j = 56;
        int heltal = i * j + 56;
        System.out.println(heltal);
        double d = 45.78;
        double decimalTal = d / 2.23;
        System.out.println(decimalTal);
        System.out.println(heltal * decimalTal);
        int avhugget = (int) decimalTal;          // chop off decimals
        System.out.println(avhugget);

    }
}





