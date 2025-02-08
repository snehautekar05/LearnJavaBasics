import java.util.ArrayList;
import java.util.Scanner;

public class UnionofArrays {
    public static int[] union(int[] a1, int[] a2) {
        ArrayList<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = a1.length, n2 = a2.length;

        // Merge two sorted arrays
        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != a1[i]) {
                    unionList.add(a1[i]);
                }
                i++;
            } else if (a1[i] > a2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != a2[j]) {
                    unionList.add(a2[j]);
                }
                j++;
            } else { // When a1[i] == a2[j]
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != a1[i]) {
                    unionList.add(a1[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements from a1
        while (i < n1) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != a1[i]) {
                unionList.add(a1[i]);
            }
            i++;
        }

        // Add remaining elements from a2
        while (j < n2) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != a2[j]) {
                unionList.add(a2[j]);
            }
            j++;
        }

        // Convert ArrayList to array
        int[] unionArray = new int[unionList.size()];
        for (int k = 0; k < unionList.size(); k++) {
            unionArray[k] = unionList.get(k);
        }
        return unionArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter elements of the first array (sorted):");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter elements of the second array (sorted):");
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        int[] unionArray = union(a1, a2);
        System.out.println("Union of the two arrays:");
        for (int num : unionArray) {
            System.out.print(num + " ");
        }
    }
}
