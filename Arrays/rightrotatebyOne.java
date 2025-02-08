import java.util.Arrays;
import java.util.Scanner;

public class rightrotatebyOne {
     public static int[]rightrotate(int arr[],int n){
        int temp=arr[n-1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // Shift elements to the right
        }
        arr[0]=temp;
        return Arrays.copyOf(arr, n);
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int rightRotatedArray[]=rightrotate(arr, n);
        System.out.println("Right Roatated Array:"+Arrays.toString(rightRotatedArray));
    }
}
