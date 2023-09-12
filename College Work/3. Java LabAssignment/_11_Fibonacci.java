// .  WAP  to print Fibonacci series. 
// (0 1 1 2 3 5 8 13 21.......................) 

import java.util.Scanner;

public class _11_Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int f1,f2,fn,n,i;

        f1 = 0;
        f2 = 1;
        System.out.print("Enter the length of Fibonacci Series : ");
        n = sc.nextInt();
        System.out.println("\nFibonacci series : ");
        System.out.print(f1+"\t"+f2+"\t");

        //Fibonacci Series:
        for(i=1;i<=(n-2);i++){
            fn = f1+f2;
            f1 = f2;
            f2 = fn;
            System.out.print(fn+"\t");
            if((i+2)%10==0){
                System.out.println("");
            }
        }
    }
}
