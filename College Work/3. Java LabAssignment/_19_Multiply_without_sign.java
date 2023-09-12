// WAP to print multiplication of two no without using * operator 

import java.util.Scanner;

public class _19_Multiply_without_sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,mul = 0;
        System.out.println("Enter two numbers to multiply : ");
        System.out.print("a = ");
        a =sc.nextInt();
        System.out.print("b = ");
        b =sc.nextInt();

        //Multiplying two numbers without using * sign.
         for(int i=1;i<=b;i++){
            mul = mul + a;
         }
         System.out.println("Multiplication of "+a+" and "+b+" : "+mul);
    }
}
