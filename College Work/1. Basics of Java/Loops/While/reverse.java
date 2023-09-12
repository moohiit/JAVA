import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,rem,rev=0,no;
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        no=n;
        while(n>0){
            rem = n%10;
            rev = rev*10 +rem;
            n/=10;
        }
        System.out.println("Reverse of "+no+" is "+rev);
        sc.close();
    }
}
