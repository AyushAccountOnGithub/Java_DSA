public class java017AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;

        int b = a;
        System.out.println(b); // 10
        a+=10;
        System.out.println(a); // 20
        a++;
        System.out.println(a); // 21

        a-=10;
        System.out.println(a); // 11
        a--;
        System.out.println(a); // 10

        a*= 10;
        System.out.println(a); // 100

        a/=10;
        System.out.println(a); // 10


    }
}
