import java.util.Scanner;

public class longestSubarraySum {
    public static int longestSubarray(int[] arr, int n, int k) {
        int maxlen = 0;
        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < n) {
            // Expand the window by adding the current element
            sum += arr[right];

            // Shrink the window from the left if the sum exceeds k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Check if the current window has a sum equal to k
            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }

            // Move the right pointer to expand the window
            right++;
        }

        return maxlen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the desired sum (k)
        System.out.print("Enter the desired sum (k): ");
        int k = sc.nextInt();

        // Output the length of the longest subarray with sum k
        System.out.println("The length of the longest subarray with sum " + k + " is: " + longestSubarray(arr, n, k));
    }
}
