// WAP to print whether given no is  Handsome or not. 
// (for eg. 459  
// (sum of starting two digit is equal to last digit  4+5=9) 
import java.util.*;
public class _14_Handsome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,n,rem,last,no,num;
        System.out.print("Enter any number to check : ");
        num =sc.nextInt();
        last = num%10;
        n = num/10;
        no = num;

        while(n>0){
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        if(sum==last){
            System.out.println(num+" is a Handsome number.");
        }else{
            System.out.println(num+" is not a Handsome number.");
        }
    }
}
