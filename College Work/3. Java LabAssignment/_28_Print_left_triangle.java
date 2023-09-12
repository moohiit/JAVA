// WAP to print only left triangle element of a matrix.

import java.util.Scanner;

public class _28_Print_left_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [4][4];
        System.out.println("Enter the elements in the array : ");
        for(int i =0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("a["+i+"]["+j+"] = ");
                arr[i][j]= sc.nextInt();
            }
        }

        // Print Left Trianle elements of the array:
        System.out.println("Array : ");
        for(int i =0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i>=j){
                   System.out.print(arr[i][j]+" "); 
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
