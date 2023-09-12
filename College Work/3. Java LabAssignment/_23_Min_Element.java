// .  WAP to find Minimum element of an array.

import java.util.Scanner;

public class _23_Min_Element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10],min;
        System.out.println("Enter the elements in the array : ");
        for(int i =0;i<10;i++){
            System.out.print("a["+i+"] = ");
            arr[i]= sc.nextInt();
        }

        // Print the array:
        System.out.print("Array : [ ");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");

        // Checking for the min element in the array.
        min=arr[0];
        for(int i=0;i<10;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min element : "+min);

    }
}