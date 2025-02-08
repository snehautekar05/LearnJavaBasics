package variables;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
       //Input
       Scanner sc=new Scanner(System.in); //take input from terminal
       String name=sc.next();//takes the single word
       String name2=sc.nextLine();//takes the entire line
       //nextInt() used to input the integer number
       //nextFloat() used to input floating number
       System.out.println(name);
       System.out.println(name2);

    }
}
