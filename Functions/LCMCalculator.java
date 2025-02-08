package Functions;

// To find the Least Common Multiple (LCM) of two numbers, you can use the relationship between LCM and GCD (Greatest Common Divisor):


// LCM(a, b) = (|a * b|)/{GCD(a, b)}

// This formula is efficient because calculating the GCD is straightforward using the Euclidean algorithm. Once you have the GCD, you can easily compute the LCM.

// Least Common Multiple (LCM)
// The LCM of two numbers is the smallest positive integer that is a multiple of both numbers. In other words, it's the smallest number that both original numbers can divide without leaving a remainder.

// Example
// Let's find the LCM of 12 and 18:

// Multiples of 12: 12, 24, 36, 48, 60, ...
// Multiples of 18: 18, 36, 54, 72, 90, ...
// The common multiples of 12 and 18 are 36, 72, etc. The smallest of these is 36, so the LCM of 12 and 18 is 36.

// Using the GCD to Find LCM
// You can also use the relationship between LCM and GCD:
// LCM(a, b) = (|a * b|)/{GCD(a, b)}

// For 12 and 18:

// GCD is 6.
// LCM = (12 × 18) / 6 = 36.
// So, the LCM of 12 and 18 is 36.


import java.util.Scanner;

public class LCMCalculator {

    // Function to calculate the GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);  // Using the relation between LCM and GCD
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Call lcm method and print the result
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm(num1, num2));
   
    }
}
