// WAP  to  print whether given no is Perfect or not. 
// A number is said to be perfect number if it is equal to sum of its 
// factors(excluding the number) 
// (for eg. 6 is perfect no as 6=1+2+3)
import java.util.*;
public class _15_Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,n,i;
        System.out.print("Enter any number to check : ");
        n =sc.nextInt();
        i=1;

        while(i<=n/2){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==n){
            System.out.println(n+" is a perfect number.");
        }else{
            System.out.println(n+" is not a perfect number.");
        }
    }
}
