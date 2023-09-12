import java.util.Scanner;

public class Conversion_ferenhiet_to_celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenhiet, celsius;
        System.out.print("Enter temperature in (Fahrenhiet) : ");
        fahrenhiet = sc.nextInt();
        celsius = (fahrenhiet-32)*5/9;
        System.out.println("Temperature in celsius :"+celsius);
    }
}
