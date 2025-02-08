import java.util.Arrays;
import java.util.Scanner;

public class rightrotateArrayByD {
    public static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of positions to right rotate:");
        int d = sc.nextInt();
        d = d % n; // Ensure d is within the bounds of the array size
        
        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);
        
        // Step 2: Reverse the first d elements
        reverse(arr, 0, d - 1);
        
        // Step 3: Reverse the remaining n-d elements
        reverse(arr, d, n - 1);

        System.out.println("Right rotated array: " + Arrays.toString(arr));
    }
}
