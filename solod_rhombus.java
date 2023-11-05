public class solod_rhombus {
    public static void SolidRhombus(int n){
        for (int i =1; i<=n; i++){
            for (int j =1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int k = 1; k<n; k++){
                System.out.print("*");
            }
            for (int j =1; j<=(i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SolidRhombus(5);

    }
}




