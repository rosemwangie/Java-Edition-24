The TwoSum class provides a method twoSum that finds two numbers in an array whose sum equals a given target value. It utilizes a HashMap to efficiently find the two numbers in linear time.


Import the necessary Java utility package:

```java
import java.util.HashMap;

// Define the TwoSum class:
public class TwoSum {}

// Define the twoSum method that takes an array of integers (nums) and a target integer (target) as input and returns an array containing the indices of the two numbers whose sum equals the target:
public int[] twoSum(int[] nums, int target) {

}

// Initialize a HashMap to store each number in the array (nums) along with its index:
HashMap<Integer, Integer> map = new HashMap<>();

// Iterate through the array (nums):
for (int i = 0; i < nums.length; i++) {}

// Calculate the complement of the current number (nums[i]) with respect to the target:
int complement = target - nums[i];


// Check if the complement exists in the HashMap:
if (map.containsKey(complement)) {

// If the complement exists, return an array containing the indices of the current number and its complement:
return new int[] { map.get(complement), i };
}


// If the complement does not exist, add the current number and its index to the HashMap:
map.put(nums[i], i);

// If no two numbers sum up to the target, throw an IllegalArgumentException:
throw new IllegalArgumentException("No two sum solution");


// End of the twoSum method.

int[] indices = solution.twoSum(nums, target);
// Print the indices of the two numbers whose sum equals the target:
```