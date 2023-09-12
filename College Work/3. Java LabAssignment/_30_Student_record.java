// WAP to create a class student record system. 
// (by using getinfo() and putinfo() method

import java.util.Scanner;

public class _30_Student_record {

    String name;
    long rollno;
    int sub1,sub2;
    public void getinfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student Name : ");
        name= sc.nextLine();
        System.out.print("Enter Roll No : ");
        rollno = sc.nextInt();
        System.out.print("Enter marks of Sub1 : ");
        sub1 = sc.nextInt();
        System.out.print("Enter marks of Sub2 : ");
        sub2 = sc.nextInt();
    }
    public void putinfo(){
        System.out.println("** Student Record **");
        System.out.println("Student Name : "+name);
        System.out.println("Roll No : "+rollno);
        System.out.println("Marks of Sub1 : "+sub1);
        System.out.println("Marks of Sub2 : "+sub2);
    }
    public static void main(String[] args) {
        _30_Student_record sr = new _30_Student_record();
        sr.getinfo();
        sr.putinfo();
    }
}
