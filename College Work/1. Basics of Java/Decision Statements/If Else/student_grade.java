import java.util.Scanner;

public class student_grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.print("Enter Your marks: ");
        marks = sc.nextInt();

        if(marks<=33){
            System.out.println("Fail!");
        }else if(marks>33 && marks<=45){
            System.out.println("Grade : D");
        }else if(marks>45 && marks<=60){
            System.out.println("Grade : C");
        }else if(marks>60 && marks<=80){
            System.out.println("Grade : B");
        }else if(marks>80 && marks<=90){
            System.out.println("Grade : A");
        }else if(marks>90 && marks<=100){
            System.out.println("Grade : A+");
        }else{
            System.out.println("Invalid Marks.");
        }
        sc.close();

    }
}