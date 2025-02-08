package Functions;
import java.util.Scanner;

public class countNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        
        System.out.print("Enter a number (or type 'exit' to stop): ");
        
        // Check if input is an integer or if the user wants to exit
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            
            if (num > 0) {
                positiveCount++;
                System.out.println("Positive count: " + positiveCount);
            } else if (num < 0) {
                negativeCount++;
                System.out.println("Negative count: " + negativeCount);
            } else {
                zeroCount++;
                System.out.println("Zero count: " + zeroCount);
            }
            
            System.out.print("Enter another number (or type 'exit' to stop): ");
        }
        
        // Display the final counts when exiting
        System.out.println("\nFinal Count of Positive Numbers: " + positiveCount);
        System.out.println("Final Count of Negative Numbers: " + negativeCount);
        System.out.println("Final Count of Zeros: " + zeroCount);

        sc.close();
    }
}
