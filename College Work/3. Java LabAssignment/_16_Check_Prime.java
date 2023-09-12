// WAP to check prime number? 
// (A Prime Number can be divided evenly only by 1, or itself.)  
// (for eg. 1 2 3 5 7 11)
import java.util.*;
public class _16_Check_Prime {
    public static void main(String[] args) {
        int n,i = 2,isprime = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check :");
        n = sc.nextInt();
        while(i<=n/2){
            if(n%i==0){
                isprime = 1;
                break;
                }
            i++;
        }
        if(isprime==0){
            System.out.print(n+" is a prime number.");
        }else{
            System.out.print(n+" is not a prime number.");
        }
    }
}
