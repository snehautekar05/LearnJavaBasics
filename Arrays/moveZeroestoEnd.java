import java.util.Arrays;
import java.util.Scanner;

public class moveZeroestoEnd {
    public static int[] zeroess(int arr[],int n){
        int j=-1;
        for(int i=0;i<n;i++){
            //store the index of the zero
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        
        if(j==-1) return arr;

        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                //swap the elements
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        
       return arr;

    }

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []zeroAtEnd=zeroess(arr, n);
        System.out.println(Arrays.toString(zeroAtEnd));
    }
}
