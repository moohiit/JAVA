class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Eating bread..");
        System.out.println("Barking..");
        super.eat();
    }
}
public class Super_method {
    public static void main(String[] args) {
        Dog d1 = new  Dog();
        d1.eat();
    }
}
