class test{

    public void dis(){
        System.out.println("Hii");
    }
    public void show(String str){
        System.out.println(str);
    }
    public int add(int a, int b){
        int c;
        c = a+b;
        return c;
    }
    public void sub(int a, int b){
        int c;
        c = a-b;
        System.out.println("Sub = "+c);
    }
    public static void main(String[] args) {
        test t1 = new test();
        t1.dis();
        t1.show("Welcome");
        int sum = t1.add(5,10);
        System.out.println("Sum = "+sum);
        t1.sub(8, 6);
    }
}