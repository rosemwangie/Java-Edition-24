The TwoSum class provides a method twoSum that finds two numbers in an array whose sum equals a given target value. It utilizes a HashMap to efficiently find the two numbers in linear time.


Import the necessary Java utility package:

import java.util.HashMap;
Define the TwoSum class:

java

public class TwoSum {
Define the twoSum method that takes an array of integers (nums) and a target integer (target) as input and returns an array containing the indices of the two numbers whose sum equals the target:

java

public int[] twoSum(int[] nums, int target) {
Initialize a HashMap to store each number in the array (nums) along with its index:

java

HashMap<Integer, Integer> map = new HashMap<>();
Iterate through the array (nums):

java

for (int i = 0; i < nums.length; i++) {
Calculate the complement of the current number (nums[i]) with respect to the target:

java

int complement = target - nums[i];
Check if the complement exists in the HashMap:

java

if (map.containsKey(complement)) {
If the complement exists, return an array containing the indices of the current number and its complement:

java

return new int[] { map.get(complement), i };
If the complement does not exist, add the current number and its index to the HashMap:

java

map.put(nums[i], i);
If no two numbers sum up to the target, throw an IllegalArgumentException:

java

throw new IllegalArgumentException("No two sum solution");
End of the twoSum method.

Define the main method for testing:

java

public static void main(String[] args) {
Create an instance of the TwoSum class:

java

TwoSum solution = new TwoSum();
Define an array of integers (nums) and a target integer (target):

java

int[] nums = {2, 8, 11, 15, 7};
int target = 9;
Call the twoSum method with the array and target as arguments and store the result in indices:

java

int[] indices = solution.twoSum(nums, target);
Print the indices of the two numbers whose sum equals the target:

java

System.out.println("Index1: " + indices[0] + ", Index2: " + indices[1]);
End of the main method.

End of the TwoSum class.

Usage:
To use the TwoSum class, create an instance of it and call the twoSum method with an array of integers (nums) and a target integer (target). The method will return an array containing the indices of the two numbers in the array that sum up to the target. If no such numbers exist, it will throw an IllegalArgumentException.

Example Usage:

java

TwoSum solution = new TwoSum();
int[] nums = {2, 8, 11, 15, 7};
int target = 9;
int[] indices = solution.twoSum(nums, target);
System.out.println("Index1: " + indices[0] + ", Index2: " + indices[1])