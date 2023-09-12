import java.util.Scanner;

public class swap {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        int a,b;
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a - b;
        System.out.println("After swap :\n"+"a = "+a+"\n"+"b = " +b);
        sc.close();

    }
}
