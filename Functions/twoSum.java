package Functions;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class twoSum {
//     public static int [] twoo(int[]nums,int target){
       
//         Map<Integer,Integer>numsToIndex=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int complement=target-nums[i];
//             if(numsToIndex.containsKey(complement)){
//                 // return new int[]{numsToIndex.get(complement,i)};
//                 return new int[]{numsToIndex.get(complement, i)};

//             } 
//             numsToIndex.put(nums[i],i);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int target=sc.nextInt();
//         int nums[]=new int[n];
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         int[] result = twoo(nums, target);
//         System.out.println("Indices:"+result[0]+","+result[1]);
//     }
// }
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twoSum {
    public static int[] twoo(int[] nums, int target) {
        Map<Integer, Integer> numsToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsToIndex.containsKey(complement)) {
                // Found the pair; return their indices
                return new int[]{numsToIndex.get(complement), i};
            }
            numsToIndex.put(nums[i], i);
        }
        // Return null if no two numbers add up to the target
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int[] result = twoo(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two indices found that add up to the target.");
        }
        
        sc.close();
    }
}
