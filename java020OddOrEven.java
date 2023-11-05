import java.util.Scanner;

public class java020OddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
