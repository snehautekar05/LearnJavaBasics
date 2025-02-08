package Functions;

import java.util.Scanner;

public class equilibriumIndex {
    public static int equilibrium(int []arr){
        int totalSum=0;
        int leftSum=0;
       
        for(int i:arr){
            totalSum+=i;
        }

        for(int i=0;i<arr.length;i++){
            int rightSum=totalSum-leftSum-arr[i];

            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Index:"+equilibrium(arr));
    }
}
