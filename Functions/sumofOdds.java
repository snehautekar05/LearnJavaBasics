package Functions;

import java.util.Scanner;

public class sumofOdds {
    public static int oddnos(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
               sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of odd nos from 1 to n:"+oddnos(n));
    }
}
