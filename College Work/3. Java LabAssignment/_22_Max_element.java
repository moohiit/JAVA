// .  WAP to find maximum element of an array.

import java.util.Scanner;

public class _22_Max_element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10],max;
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

        // Checking for the max element in the array.
        max=arr[0];
        for(int i=0;i<10;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element : "+max);
    }
}