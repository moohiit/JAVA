import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float units, bill;
        System.out.print("Enter the measure of units : ");
        units = sc.nextFloat();
        if(units<100){
            bill = units*1.50f;
        }else if(units >100 && units<200){
            bill = units*2.5f;
        }else if(units >200 && units<300){
            bill = units*3.5f;
        }else{
            bill = units*5;
            System.out.println("Overloaded");
        }

        System.out.println("Your total bill Amount : "+bill);
    }
}
