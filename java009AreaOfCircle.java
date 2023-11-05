
import java.util.*;
public class java009AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter Radius : ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();

        float area =  r * r * 3.14f;

        System.out.println("Area is : ");
        System.out.println(area);
    }

}
