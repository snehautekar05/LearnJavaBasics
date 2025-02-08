import java.util.Scanner;

public class missingNumber {
    public static int missing(int n,int arr[]){
        
        int sum=n*(n+1);
        int sum1=sum/2;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2+=arr[i];
        }
        return sum1-sum2;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(missing(n, arr));
    }
}
