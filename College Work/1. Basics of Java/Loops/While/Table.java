import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        i=1;
        System.out.print("Enter your number : ");
        n = sc.nextInt();
        while(i<=10){
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        }
        sc.close();

    }
}
