import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        double pi= 3.14 , area;
        System.out.print("Enter radius :");
        r = sc.nextInt();
        area =  pi*r*r;
        System.out.println("Area = "+area);

    }
}
