package Functions;

import java.util.Scanner;

public class Multiplication {
    public static int mul(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Multiplication:"+mul(a,b));
    }
}
