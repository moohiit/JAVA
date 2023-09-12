import java.util.Scanner;

public class check_vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.print("Enter any letter (a-z or A-Z): ");
        choice = sc.nextLine().charAt(0);

        switch(choice){
            case ('a'):
            System.out.println(choice+" is a vowel");
            break;
            case ('e'):
            System.out.println(choice+" is a vowel");
            break;
            case ('i'):
            System.out.println(choice+" is a vowel");
            break;
            case 'o':
            System.out.println(choice+" is a vowel");
            break;
            case 'u':
            System.out.println(choice+" is a vowel");
            break;
            case 'A':
            System.out.println(choice+" is a vowel");
            break;
            case 'E':
            System.out.println(choice+" is a vowel");
            break;
            case 'I':
            System.out.println(choice+" is a vowel");
            break;
            case 'O':
            System.out.println(choice+" is a vowel");
            break;
            case 'U':
            System.out.println(choice+" is a vowel");
            break;
            default:
            System.out.println(choice+" is a consonent.");
        }
        sc.close();


    }
}
