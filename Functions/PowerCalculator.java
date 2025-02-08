package Functions;

import java.util.Scanner;

public class PowerCalculator {
     public static int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();

        System.out.println(x + "^" + n + " = " + power(x, n));
        
    
    }
}
