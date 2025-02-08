package Functions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        // Calculate the number of digits
        int numberOfDigits = String.valueOf(num).length();

        // Alternate way to calculate digits
        // public static int countDigitsUsingLoop(int num) {
        //     int count = 0;
        //     while (num != 0) {
        //         num /= 10; // Divide the number by 10
        //         count++;   // Increment the count
        //     }
        //     return count;
        // }
        

        // Calculate the sum of the digits raised to the power of the number of digits
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

     
    }
}
