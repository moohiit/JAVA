import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Check_two_number_greater{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a,b;
        System.out.print("Enter your number :\na = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();

        if(a>b){
            System.out.println("A is greater.");
        }else if(a==b){
            System.out.println("A is equal to B.");
        }else{
            System.out.println("B is greater");
        }
        sc.close();
    }
}