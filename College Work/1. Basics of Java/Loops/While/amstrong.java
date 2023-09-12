import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,rem,arm=0,no;
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        no=n;
        while(n>0){
            rem = n%10;
            arm = arm + rem*rem*rem;
            n/=10;
        }
        if(no==arm){
            System.out.println(no+" is armstrong number.");
        }else{
            System.out.println(no+" is not armstrong number.");
        }
        sc.close();
    }
}
