interface Item{
    public void dis();
}
interface Product{
    public void show();
}
class A implements Item,Product{
    public void show(){
        System.out.println("Hello Interface");
    }
    public void dis(){
        System.out.println("Hello Dis()");
    }
    public void M1(){
        System.out.println("Function : M1");
    }
}

public class Interface {
    public static void main(String[] args) {
        A a1 = new A();
        a1.dis();
        a1.M1();
        a1.show();
    }
    
}
