class A{
    public A(){
        System.out.println("This is constructor A.");
    }
    public void hello(){
        System.out.println("Function of class of A.");
        System.out.println("Helloo..");
    }
}
class B extends A{
    public B(){
        System.out.println("This is constructor of B.");
    }
    public void m1(){
        System.out.println("Function of class B.");
    }
}

public class Constructor {
    public static void main(String[] args) {
        B b1 = new B();
        b1.hello();
        b1.m1();
    }
    
}
