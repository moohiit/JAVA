// WAP to print 3*3 matrix.

import java.util.Scanner;

public class _25_Print_3x3_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [3][3];
        System.out.println("Enter the elements in the array : ");
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("a["+i+"]["+j+"] = ");
                arr[i][j]= sc.nextInt();
            }
        }

        // Print the array:
        System.out.println("Array : ");
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
