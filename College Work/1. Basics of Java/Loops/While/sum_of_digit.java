import java.util.Scanner;


public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum,rem;
        sum=0;
        System.out.print("Enter any number : ");
        n = sc.nextInt();

        while(n>0){
            rem = n%10;
            sum = sum +rem;
            n/=10;
        }
        System.out.println("Sum of digits = "+sum);
        sc.close();
    }
}
