import java.util.Scanner;

public class comparision {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

    if(a>b){
        System.out.println(a+" is greater than "+b);
    }else if(a<b){
        System.out.println(a+" is smaller than "+b);
    }else{
        System.out.println(a+" is equal to "+b);
    }
    }
}
