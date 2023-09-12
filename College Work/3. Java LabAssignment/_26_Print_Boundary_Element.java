import java.util.Scanner;

public class _26_Print_Boundary_Element {
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

        // Print boundary elements of the array:
        System.out.println("Array : ");
        for(int i =0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==0||j==0||i==arr.length-1||j==arr.length-1){
                   System.out.print(arr[i][j]+" "); 
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
