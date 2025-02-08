import java.util.Arrays;
import java.util.Scanner;

public class leftrotateArraybyOne {
    public static int[]leftrotate(int arr[],int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return Arrays.copyOf(arr, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []rotatedArray=leftrotate(arr, n);
        System.out.println(Arrays.toString(rotatedArray));
    }
}
