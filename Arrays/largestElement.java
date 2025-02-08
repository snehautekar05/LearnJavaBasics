import java.util.*;

public class largestElement {
    public static int largest(int []a,int n){
        int largest=a[0];
        for (int i=0;i<n;i++){
            if(a[i]>largest){
                largest=a[i];
               
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println(largest(a, n));
    }
}
