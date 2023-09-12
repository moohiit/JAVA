
// 4.WAP to take input of two number by using InputStreamReader and 
// BufferedReader class and swap them for eg. 
// ( Enter number one 
// 4 
// Enter number two 
// 5 
// After swapping number are 5 and 4)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _4_Swap {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        int a,b;
        System.out.print("Enter the value of a:");
        a = Integer.parseInt(br.readLine());
        System.out.print("\nEnter the value of b:");
        b = Integer.parseInt(br.readLine());
        System.out.println("\nBefore Swapping value :\na = "+a+"\nb = "+b);

        //Swapping the numbers:
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping value :\na = "+a+"\nb = "+b);
    
    }
}
