package Patterns;

import java.util.Scanner;

public class invertedHalfPyramid180 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
         //stars
         for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
