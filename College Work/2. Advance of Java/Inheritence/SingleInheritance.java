class A{
    public void dis(){
        System.out.println("Ok");
        System.out.println("Class A: function dis()");
    }
}
class B extends A{
    public void show(){
        System.out.println("Class B: function show()");
        System.out.println("Hello");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
        b1.dis();
    }
    
}
