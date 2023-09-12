// WAP to print average of three real numbers taken as input from 
// user. 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_Average {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your numbers:");
        double a,b,c,avg;
        System.out.print("a = ");
        a = Integer.parseInt(scan.readLine());
        System.out.print("b = ");
        b = Integer.parseInt(scan.readLine());
        System.out.print("c = ");
        c = Integer.parseInt(scan.readLine());

        avg =(a+b+c)/3;
        System.out.println("Average : "+avg);
    }
}
