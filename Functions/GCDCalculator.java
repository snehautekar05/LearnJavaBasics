//The Euclidean algorithm works based on the property that the GCD of two numbers a and b is the same as the GCD of b and the remainder of a divided by b (i.e., a % b). The process is repeated until the remainder is 0, at which point a holds the GCD of the original two numbers.

// Step-by-Step Explanation
// Initial Setup: The method takes two integers, a and b.
// Loop: As long as b is not 0, the algorithm continues:
// Store b in temp: This preserves the current value of b for the next step.
// Update b: Replace b with a % b, which is the remainder when a is divided by b.
// Update a: Replace a with the previous value of b (stored in temp).
// Result: When b becomes 0, a holds the GCD of the original two numbers, so the method returns a.

// Example
// Let's find the GCD of 12 and 18:

// Factors of 12: 1, 2, 3, 4, 6, 12
// Factors of 18: 1, 2, 3, 6, 9, 18
// The common factors of 12 and 18 are 1, 2, 3, and 6. The largest of these is 6, so the GCD of 12 and 18 is 6.

// Euclidean Algorithm
// The GCD can also be found using the Euclidean algorithm, which is more efficient for larger numbers. For example, to find the GCD of 12 and 18 using this method:

// Divide 18 by 12, getting a remainder of 6.
// Divide 12 by 6, getting a remainder of 0.
// When the remainder is 0, the last non-zero remainder (6) is the GCD.
// So, the GCD of 12 and 18 is 6.


package Functions;
import java.util.Scanner;

public class GCDCalculator {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd(num1, num2));
        
      
    }
}


