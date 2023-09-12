abstract class A{
    abstract public void show();
    public void dis() {
        System.out.println("Hello.. : Abstract Class.");
    }
}
class B extends A{
    public void show(){
        System.out.println("Abstract method of class A");
    }

}
class Abstract_keyword{
    public static void main(String[] args) {
        A b = new B();
        b.dis();
        b.show();
    }
}