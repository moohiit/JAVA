class A {
    final public void dis(){
        System.out.println("This is final Method.");
    }
}
class B extends A{
    public void dis(){
        System.out.println("This function can't be created.");
    }
}
public class Final_method {
    public static void main(String[] args) {
        B b = new B();
        b.dis(); //error: dis() in B cannot override dis() in A since it is final method
    }
}
