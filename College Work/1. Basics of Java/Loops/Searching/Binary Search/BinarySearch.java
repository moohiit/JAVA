import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();        
    }
    System.out.println("Enter the element to be searched :");
    int key = sc.nextInt();
    
    int result = binarySearch(arr,key);
    if(result==-1){
        System.out.println("Element not found");
    }else{System.out.println("Element Found.");}
    }
    public static int binarySearch(int[] arr,int key){
       
        //sorting the array in ascending order.
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];                    
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        //Printing sorted array:
        System.out.print("Sorted Array :\n[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println("]");
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }   
}
