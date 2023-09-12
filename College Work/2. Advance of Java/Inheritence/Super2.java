class A {
    int x = 5; 
}
class B extends A {
    int x = 10;
    void printVal(){
        System.out.println("Varible of class B : x = "+x);
        System.out.println("Varible of class A : x = "+super.x);
    }
}
public class Super2 {
    public static void main(String args[]) {
        B b1 = new B();
        b1.printVal();
    }
}
