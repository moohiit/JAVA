// WAP  to print bill and discount according to Customer purchasing  
//                Purchasing(Rs.)                         Discount 
//                Less than 2000                     print sorry no discount 
//                Above 2000                              Get 15%

import java.util.Scanner;

public class _7_Purchasing_bills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int purchasing;
        System.out.print("Enter your Purchasing Amount : ");
        purchasing = sc.nextInt();

        //Check for discount:
        if(purchasing>=2000){
            purchasing = purchasing*(100-15)/100;
            System.out.println("You got 15% Discount!\nYour bill : "+purchasing);
        }else{
            System.out.println("Sorry No Discount!\nYour bill : "+purchasing);
        }
    }
}
