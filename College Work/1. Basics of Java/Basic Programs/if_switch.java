import java.util.Scanner;

public class if_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Hello\n2 : Namaste\n3 : Ram Ram\nEnter Choice:\n");
        int button = sc.nextInt();


        //Using if else statements.
        // if(button == 1){
        //     System.out.println("Hello");
        // }else if(button == 2){
        //     System.out.println("Namaste");
        // }else if(button == 3){
        //     System.out.println("Ram Ram");
        // }else{
        //     System.out.println("Invalid Choice");
        // }

        //Using Switch statements:
        switch (button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Ram Ram");
            break;
            default : System.out.println("Invalid Choice");
        }

    }   
}
