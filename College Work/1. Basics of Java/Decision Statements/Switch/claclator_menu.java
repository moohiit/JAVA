import java.util.Scanner;

public class claclator_menu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Select one of the follwing :\n1. Add\n2. Sub\n3. Mul\n4. Div\n5. Mod");
        System.out.print("Enter your choice :");
        int choice,a,b;
        choice = s.nextInt();
        System.out.print("a = ");
        a = s.nextInt();
        System.out.print("b = ");
        b = s.nextInt();
        switch(choice){
            case 1:
            System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
            break;
            case 2:
            System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
            break;
            case 3:
            System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
            break;
            case 4:
            if(b==0){
                System.out.println("Cannot divide by Zero");
            }else{
                System.out.println("Division of "+a+" and "+b+" is "+(a/b));
            }
            break;
            case 5:
            System.out.println("Modulus of "+a+" and "+b+" is "+(a%b));
            break;
            default:
            System.out.println("Invalid choice");
            
        }
    }
}
