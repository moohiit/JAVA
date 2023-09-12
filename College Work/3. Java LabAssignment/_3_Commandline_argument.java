// WAP to take input of  three number by using command line 
// argument and calculate sum.

public class _3_Commandline_argument {
    public static void main(String[] args) {
        int a,b,c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = a+b;
        System.out.println("a = "+a+"\nb = "+b+"\nSum = "+c);
    }
}
