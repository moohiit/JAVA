import java.util.Scanner;

public class discount_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float purchase,discount,bill;
        System.out.print("Enter your purchase amount : ");
        purchase = sc.nextFloat();
        if (purchase>=2000) {
            discount = purchase*0.2f;
            bill = purchase - discount;
            System.out.println("Wooho! You got 20% Discount");
            System.out.println("Your Bill : "+bill);
        }else{
            System.out.println("Sorry! No discount.");
            bill = purchase;
            System.out.println("Your Bill : "+bill);
        }
        sc.close();
    }
}
