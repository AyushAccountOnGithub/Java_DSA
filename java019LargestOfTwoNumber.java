import java.util.*;

public class java019LargestOfTwoNumber {
    public static void main(String[] args) {
        System.out.println("Enter First Number : ");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int second = sc.nextInt();

        if (first>second){
            System.out.println("Largest number is : " +first);
        }
        else {
            System.out.println("Largest number is : " +second);
        }

    }
}
