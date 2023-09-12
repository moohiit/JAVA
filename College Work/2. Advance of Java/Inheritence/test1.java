public class test1 {
    public void m1(){
        System.out.println("Hii");
    }
    public static void m2(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        test1 t1 = new test1();
        t1.m1(); 
        m2();
        //test1.m2();
    }
}