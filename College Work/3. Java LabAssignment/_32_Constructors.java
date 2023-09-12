// WAP to Show the types of Constructor in one program. 
// 1.  Default constructor 
// 2.  Parameterized constructor 
// 3.  Copy constructor 

// (also use comment line to describe constructor)

import java.util.Scanner;

class A {
    void A(){ // This is non parameterised constructor.
        System.out.println("This is non parameterized Constructor.");
        Scanner sc =  new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two Numbers : ");
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        c= a+b;
        System.out.println("Sum = "+c);

    }
}
class B{
    void B(int a,int b){ //This is parameterised cunstructor.
        int c;
        System.out.println("This is parameterised cunstructor.");
        c = a+b;
        System.out.println("Sum = "+c);
    }
}

public class _32_Constructors {
    public static void main(String[] args) {
        A a =new A();
        a.A(); // Non parameterised
        B b =new B();
        b.B(5, 7); //Parameterised 
    }
}
