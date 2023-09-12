class A{
    public void M1(){
        System.out.println("Class A : Fun : M1");
    }
}
class B extends A{
    public void M2(){
        System.out.println("Class B : Fun : M2");
    }
}
class C extends B{
    public void M3(){
        System.out.println("Class C : Fun : M3");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        C c1 = new C();
        c1.M1();
        c1.M2();
        c1.M3();
    }
    
}
