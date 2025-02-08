import java.util.ArrayList;
import java.util.Scanner;

public class intersectionofArrays {
    public static ArrayList<Integer> intersection(int[] a, int[] b, int m, int n) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                // Add the common element if it's not already in the intersection list
                if (intersection.isEmpty() || intersection.get(intersection.size() - 1) != a[i]) {
                    intersection.add(a[i]);
                }
                i++;
                j++;
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int m = sc.nextInt();
        int[] a = new int[m];
        System.out.println("Enter the elements of the first array (sorted):");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int n = sc.nextInt();
        int[] b = new int[n];
        System.out.println("Enter the elements of the second array (sorted):");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> result = intersection(a, b, m, n);

        System.out.println("Intersection of the two arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
