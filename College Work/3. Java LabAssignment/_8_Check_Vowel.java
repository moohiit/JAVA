import java.util.Scanner;

public class _8_Check_Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Enter any character : ");
        ch = sc.next().charAt(0);

        //Check for Vowel :
        if(ch== 'a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'
            ||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                System.out.println("Your character is Vowel.");
            }else{
                System.out.println("Your character is other than Vowel.");
            }
    }
}
