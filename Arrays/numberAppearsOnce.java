import java.util.Scanner;

public class numberAppearsOnce {
    public static int numbers(int[]arr,int n){
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        return xor;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(numbers(arr, n));

    }
}
