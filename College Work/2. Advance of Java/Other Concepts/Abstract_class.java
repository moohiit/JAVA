abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class Asix extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        Bank b;
        b= new SBI();
        System.out.println("Intrest Rate of SBI Bank : "+b.getRateOfInterest());
        b = new Asix();
        System.out.println("Intrest rate of Axis Bank : "+b.getRateOfInterest());
    }
}
