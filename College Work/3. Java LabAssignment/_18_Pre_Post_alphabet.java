// WAP to input an alphabet as character and print its predecessor and 
// successor character. 
// (for eg.  
// You have entered D Character 
// The predecessor character is: C 
// The Successor character is: E

import java.util.Scanner;

public class _18_Pre_Post_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch,pre,post;
        System.out.print("Enter any character : ");
        ch = sc.next().charAt(0);
        pre = --ch;
        post = ++ch;
        System.out.println("You have entered character : "+ ch);
        System.out.println("The predecessor character is : "+ pre);
        System.out.println("The Successor character is : "+ ++post);

    }
}
