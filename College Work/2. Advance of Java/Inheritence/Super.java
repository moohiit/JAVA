class A{
    int eid;
    public A(int i){ //constructor of A
        eid = i;
        System.out.println("Eid = "+eid);
    }
}
class B extends A{
    int roll, marks;
    public B(int r,int m,int e){ //constructor of B
        super(e);
        roll = r;
        marks = m;
        System.out.println("Roll = "+roll);
        System.out.println("Marks = "+marks);
    }
}
class Super{
    public static void main(String[] args) {
        B b1 =  new B(100, 23, 1221);
    }
}