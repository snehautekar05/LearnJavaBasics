import java.util.Scanner;

public class MaxOddSubarraySum {
    public static int maxSubarraySum(int[] arr, int n, int k) {
        // Step 1: Convert all even numbers to odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 1; // Convert even to odd by adding 1
            }
        }
        // Step 2: Use sliding window technique to find the maximum sum of subarrays of size k
        int maxSum = Integer.MIN_VALUE; // Initialize with the smallest value
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            // Add the current element to the current sum
            currentSum += arr[i];
            // If we have processed at least k elements, calculate the sum of the current subarray
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, currentSum); // Update maxSum if the current subarray sum is greater
            // Slide the window by subtracting the first element of the current window
                currentSum -= arr[i - (k - 1)];
            }
        }
        return maxSum; // Return the maximum subarray sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the subarray size (k)
        System.out.print("Enter the size of the subarray (k): ");
        int k = sc.nextInt();

        // Check if the subarray size is valid
        if (k > n) {
            System.out.println("Subarray size k cannot be greater than the size of the array.");
        } else {
            // Output the maximum subarray sum
            System.out.println("The maximum subarray sum is: " + maxSubarraySum(arr, n, k));
        }
    }
}
