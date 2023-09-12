import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,flag,no;
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        no = n;
        i = 2;
        flag = 0;
        while(i<n/2){
            if(n%i==0){
                flag = 1;
                break;
            }
            i++;
        }
        if(flag==0){
            System.out.println(no+" is a prime number.");
        }else{
            System.out.println(no+" is not a prime number.");
        }
        sc.close();
    }
}
