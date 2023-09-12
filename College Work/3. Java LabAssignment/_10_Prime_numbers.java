//10. WAP to display all the prime no’s between 1 to 1000.

import java.util.Scanner;

public class _10_Prime_numbers {
    public static void main(String[] args) {
        int n = 2,num;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to which you want calculate prime :");
        num = sc.nextInt();
        
        while(n<=num){
            int isprime = 0;
            int i=2;
            while(i<=n/2){
                if(n%i==0){
                    isprime = 1;
                    break;
                    }
                i++;
            }
            if(isprime==0){
                count++;
                System.out.print(n+"\t");
                if(count%10==0){
                    System.out.println("");
                }
            }
            
            n++;
        }
        System.out.println("\nTatal prime number between "
                            +1+"-"+(n-1)+" : "+(count));
    }
}
