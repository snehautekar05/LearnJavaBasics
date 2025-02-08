import java.util.Arrays;
import java.util.Scanner;

public class leftrotateArrayByD {
    public static void  reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        d=d%n;
        reverse(arr,0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        System.out.println("Left rotated array:"+Arrays.toString(arr));
    }
}
