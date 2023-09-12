// WAP to print whether given no is Palindrom or not. 
// (for eg. 121, 212 etc) 

import java.util.*;
public class _13_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,rem,rev=0,no;
        System.out.print("Enter any number to check : ");
        n =sc.nextInt();
        no = n;

        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(rev==no){
            System.out.println(no+" is a Palindrome number.");
        }else{
            System.out.println(no+" is not a Palindrome number.");
        }
    }
}
