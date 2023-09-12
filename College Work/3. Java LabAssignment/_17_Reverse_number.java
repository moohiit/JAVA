// WAP to print reverse number? 
// (for eg. 123   -   321

import java.util.*;
public class _17_Reverse_number {
    public static void main(String[] args) {
        long rem, rev=0, n,no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to reverse : ");
        n = sc.nextInt();
        no=n;
        while(n>0){
            rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        System.out.println("Reverse of "+no+" is "+rev+".");
    }
}
