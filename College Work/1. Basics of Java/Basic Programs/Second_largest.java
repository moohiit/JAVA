public class Second_largest {
    public static void main(String[] args) {
        int arr[] ={ 1,2,3,3,3,4};
        int max =arr[0];
        int seclar = arr[0];

        // finding the largest element:
        System.out.println("Array :\n[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if(arr[i]>max){
                max = arr[i];
            }
        }System.out.println("]");
        // finding the second largest element:
        for(int i=0;i<arr.length;i++){
            if(arr[i]>seclar && arr[i]<max){
                seclar = arr[i];
            }
        }
        System.out.println("Second largest element :"+seclar);
    }
}
