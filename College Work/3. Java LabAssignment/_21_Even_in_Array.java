// WAP to print only even number of an array.

import java.util.Scanner;

public class _21_Even_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10];
        System.out.println("Enter the elements in the array : ");
        for(int i =0;i<10;i++){
            System.out.print("a["+i+"] = ");
            arr[i]= sc.nextInt();
        }

        //Ckeck for even element in the array and print them.
        System.out.println("Even element : ");
        for(int i=0;i<10;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+"\t");
            }
        }
    }    
}
