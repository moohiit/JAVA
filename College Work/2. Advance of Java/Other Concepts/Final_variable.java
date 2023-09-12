public class Final_variable {
    final int x = 10; /// here value of x made final it cannot be updated.
    void printVal(){
        x = x+5; //  error: cannot assign a value to final variable x. 
        //if you want to run this program make comment of above line of code. 
        System.out.println("X = "+x);
    }
    public static void main(String[] args) {
        Final_variable f1 = new Final_variable();
        f1.printVal();
    }
}
