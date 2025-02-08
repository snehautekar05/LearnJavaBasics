package Functions;

import java.util.Scanner;

public class Average {
    public static int avg(int a,int b,int c){
         int average=(a+b+c)/3;
         return average;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Average of three nos.:"+avg(a, b, c));
    }
}
