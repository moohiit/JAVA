// WAP to print Remainder of given no. without using % operator.

import java.util.Scanner;

public class _20_Remainder_without_using_sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,div,rem,que;
        System.out.print("Enter any number : ");
        num = sc.nextInt();
        System.out.print("Enter the divisor : ");
        div = sc.nextInt();

        //Remainder of given number without using % sign.
        if(div<0){
            div = div*(-1);
            if(num>0){
                que = num/div;
                rem = num - que*div;
                System.out.println("Remainder : "+rem); 
            }else if(num<0){
                num = num*(-1);
                que = num/div;
                rem = num - que*div;
                System.out.println("Remainder : "+rem); 
            }else if(num==0){
                rem = 0;
                System.out.println("Remainder : "+rem); 
            }
        }else if(div>0){
            if(num>0){
                que = num/div;
                rem = num - que*div;
                System.out.println("Remainder : "+rem); 
            }else if(num<0){
                num = num*(-1);
                que = num/div;
                rem = num - que*div;
                System.out.println("Remainder : "+rem); 
            }else if(num==0){
                rem = 0;
                System.out.println("Remainder : "+rem); 
            }
        }else if(div == 0){
            System.out.println("Error : Divide by Zero");
        }
    }
}
