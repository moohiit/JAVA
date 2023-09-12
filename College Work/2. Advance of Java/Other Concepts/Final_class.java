final class A { //this class can't be inherited
    public void dis(){
        System.out.println("This is final Method.");
    }
}
class B extends A{
    public void dis(){
        System.out.println("This function can't be created.");
    }
}
public class Final_class {
    public static void main(String[] args) {
        B b = new B();
        b.dis(); //error: cannot inherit from final A 
    }
}
