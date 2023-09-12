// WAP to sort the element.

import java.util.Scanner;

public class _24_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10],tem;
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

        //Sorting the array.
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(arr[i]<arr[j]){
                    tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        // Print the array:
        System.out.print("Sorted Array : [ ");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");

    }
}
