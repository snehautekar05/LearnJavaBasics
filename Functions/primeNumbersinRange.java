package Functions;

import java.util.Scanner;

public class primeNumbersinRange {
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
              return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println("Prime numbers:");

        for(int num=num1;num<=num2;num++){
            if(isPrime(num)){
                System.out.println(num);
            }
        }


    }
}
