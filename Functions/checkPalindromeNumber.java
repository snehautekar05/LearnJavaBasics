package Functions;

import java.util.Scanner;

public class checkPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num; // Store the original number to compare later
        int result = 0;

        // Reverse the number
        while (num != 0) {
            int rem = num % 10;
            result = result * 10 + rem;
            num = num / 10;
        }

        // Check if the original number is equal to its reverse
        if (originalNum == result) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
