// WAP to input any number and print it in words. 
// ( 123 - ONE TWO THREE)

import java.util.Scanner;

public class _9_Number_to_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter your Number: ");
        num = sc.nextInt();
        int rev = 0,no,rem;
        no = num;
        System.out.println("Your Number in Words:");
        while(num>0){
            rem = num%10;
            rev = rev*10 + rem;
            num /=10;
        }
        while(rev>0){
            rem = rev%10;
            rev/=10;
            switch(rem){
                case 1: System.out.print("One ");break;
                case 2: System.out.print("Two ");break;
                case 3: System.out.print("Three ");break;
                case 4: System.out.print("Four ");break;
                case 5: System.out.print("Five ");break;
                case 6: System.out.print("Six ");break;
                case 7: System.out.print("Seven ");break;
                case 8: System.out.print("Eight ");break;
                case 9: System.out.print("Nine ");break;
                case 0: System.out.print("Zero ");break;
            }
        }
    }
}
