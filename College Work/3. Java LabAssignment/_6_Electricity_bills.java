
//6. WAP to print Electricity bill according to following slab. 
// Fixed Monthly Rent: Rs. 65 per KV      
//         Unit                               Charges(Rs.) per Unit 
//       Less than 100                         1.50 
//       100 – 200                             2.50 
//       200 – 300                             3.50 
//       Above 300                             6.0

import java.util.Scanner;

public class _6_Electricity_bills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit,fixedRate = 65;
        float bill;
        System.out.print("Enter your meter Units:");
        unit =sc.nextInt();

        if(unit<100){
            bill = unit*1.50f+fixedRate;
            System.out.println("Your Bill Amount : "+bill);
        }else if(unit>=100 && unit<200){
            bill = unit*2.50f+fixedRate;
            System.out.println("Your Bill Amount : "+bill);
        }else if(unit>=200 && unit<300){
            bill = unit*3.50f+fixedRate;
            System.out.println("Your Bill Amount : "+bill);
        }else if(unit>=300){
            bill = unit*6+fixedRate;
            System.out.println("Your Bill Amount : "+bill);
        }
    }
}
