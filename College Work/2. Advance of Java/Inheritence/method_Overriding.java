class A {
    public void dis(){
        System.out.println("Class A Method ");
    }
}
class B extends A{
    public void dis(){
        super.dis(); // method of class A is called.
        System.out.println("class B method");
    }
}
public class method_Overriding {
    public static void main(String[] args) {
        B b1 = new B();
        b1.dis();
    }
}
