import java.util.Scanner;

public class linearSearch {
    public static boolean lsearch(int arr[],int n,int num){
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        System.out.println(lsearch(arr, n, num));
    }
}
