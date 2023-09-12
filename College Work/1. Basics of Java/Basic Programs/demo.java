import java.util.Scanner;
import java.util.*;

class demo{
    public static void main(String arg[]){
        System.out.println("Enter two number :");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= a+b;
        System.out.println("Sum = "+c);
    }
}