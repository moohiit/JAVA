import java.util.Scanner;

public class Conversioin_inches_to_centimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your length in (Inches) : ");
        double Inches,centimeter;
        Inches = sc.nextInt();
        centimeter = 2.54*Inches;
        System.out.println("Length in Centimeter : "+centimeter);
        sc.close();
    }
}
