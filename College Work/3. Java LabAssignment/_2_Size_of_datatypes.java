
//2. WAP to print the size of all the data types  in well format. 
// (byte,short, int,long,float,double,char,Boolean)
public class _2_Size_of_datatypes {
    public static void main(String[] args) {
        System.out.println("Datatype\tSize");
        System.out.println("Byte   \t\t"+Byte.SIZE/8+" Bytes");
        System.out.println("Short  \t\t"+Short.SIZE/8+" Bytes");
        System.out.println("Int    \t\t"+Integer.SIZE/8+" Bytes");
        System.out.println("Long   \t\t"+Long.SIZE/8+" Bytes");
        System.out.println("Float  \t\t"+Float.SIZE/8+" Bytes");
        System.out.println("Double \t\t"+Double.SIZE/8+" Bytes");
        System.out.println("Char   \t\t"+Character.SIZE/8+" Bytes");
    }
}
