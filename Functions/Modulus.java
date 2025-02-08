package Functions;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         // Check divisibility and print results based on conditions
         if (num % 12 == 0) {
            System.out.println("XY"); // Divisible by both 4 and 12
        } else if (num % 4 == 0) {
            System.out.println("X"); // Divisible by 4 only
        } else {
            System.out.println("Not divisible by 4 or 12"); // Not divisible by either
        }
    }
}
