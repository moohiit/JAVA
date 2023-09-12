class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "black";
    void printcolor(){
        System.out.println("Color using normal call : "+color);
        System.out.println("Color using super call : "+super.color);
    }
}

public class Super1 {
    public static void main(String args []){
        Dog d1 = new Dog();
        d1.printcolor();
    }
}
