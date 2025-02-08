package Functions;
import java.util.Scanner;

public class ClosestPalindrome {

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int rem = num % 10;
            reversedNum = reversedNum * 10 + rem;
            num = num / 10;
        }

        // Check if original number and reversed number are the same
        return originalNum == reversedNum;
    }

    // Function to find the closest palindrome greater than the given number
    public static int findClosestPalindrome(int num) {
        int nextNum = num + 1; // Start checking from the next number

        while (true) {
            if (isPalindrome(nextNum)) {
                return nextNum; // Return the first palindrome found
            }
            nextNum++; // Increment to check the next number
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int closestPalindrome = findClosestPalindrome(num);
        System.out.println("The closest palindrome greater than " + num + " is " + closestPalindrome);
        
        sc.close();
    }
}
