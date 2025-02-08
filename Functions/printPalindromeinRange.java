package Functions;

import java.util.Scanner;

public class printPalindromeinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int num2 = sc.nextInt();

        System.out.println("Palindrome numbers in the range:");

        for (int i = num1; i <= num2; i++) {
            int temp = i;    // Store the current number in a temporary variable
            int result = 0;  // Reset result for each number

            // Reverse the number
            while (temp != 0) {
                int rem = temp % 10;
                result = result * 10 + rem;
                temp = temp / 10;
            }

            // Check if the number is a palindrome
            if (i == result) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
