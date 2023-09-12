import java.util.*;

public class check_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter your numbers:\na = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();
// Checking the number by comparing
        if(a>b && a>c){
            System.out.println("A is greater.");
        }else if(b>a && b>c){
            System.out.println("B is greater.");
        }else if(a==b && a>c){
            System.out.println("A and B are equal and greater than C.");
        }else if(b==c && b>a){
            System.out.println("B and c are equal and greater than A.");
        }else if(a==c && c>b){
            System.out.println("C and A are equal and greater than B.");
        }else{
            System.out.println("C is greater.");
        }
        sc.close();
    }
}
