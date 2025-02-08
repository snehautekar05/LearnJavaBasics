package Functions;

import java.util.Scanner;

public class factorial {
    public static void fact(int a){
        int factorial=1;
        for(int i=a;i>=1;i--){
             factorial=factorial*i;
         }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        fact(a);
    }
}
