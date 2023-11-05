public class java012TypePromotion {
    public static void main(String[] args) {
        byte a = 2;
        short b = 4;
        char c = 'z';
        System.out.println(a+b+c); // output type is int

        long d = 45;
        float e = 50;
        double f = 55;
        System.out.println(d+e+f); // output type is in double
    }
}
