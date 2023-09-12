// WAP to print whether given no is Armstrong or not. 
// (An Armstrong number is an n-digit number that is equal to the sum 
// of the nth powers of its digits. 
// for eg.153 
//  1^3 + 5^3 + 3^3 =153. 
// Another Armstrong number are 370,371 and 407) 
 


import java.util.Scanner;

public class _12_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,n,rem,no;
        System.out.print("Enter any Number to check : ");
        n =sc.nextInt();
        no = n;

        while(n>0){
            rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if(sum==no){
            System.out.println(no+" is an armstrong number.");
        }else{
            System.out.println(no+" is not an armstrong number.");
        }
    }
}
