import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // 9 - 7 = 2
            //map is null
            // 9-2 = 7
            // 9-8 = 1
            // 9-11 = -2
            // 9-15 = -6
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
                // 0, 4
            }
            map.put(nums[i], i);
            // 2=0
            // 8 = 1
            // 11 = 2
            // 16 = 3
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 8, 11, 15, 7};
        int target = 9;
        int[] indices = solution.twoSum(nums, target);

        System.out.println("Index1: " + indices[0] + ", Index2: " + indices[1]);
    }
}

