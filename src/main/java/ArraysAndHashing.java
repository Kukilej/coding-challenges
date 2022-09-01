import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraysAndHashing {

    //https://leetcode.com/problems/contains-duplicate/
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctNumbers = new HashSet<>();
        for (int num : nums) {
            if (distinctNumbers.contains(num)) return true;
            else distinctNumbers.add(num);
        }
        return false;
    }

    //https://leetcode.com/problems/valid-anagram/
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) != 0) return false;
        }
        return true;
    }

    //https://leetcode.com/problems/two-sum/
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> previousElements = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(previousElements.containsKey(target - nums[i])) return new int[]{previousElements.get(target - nums[i]), i};
            else previousElements.put(nums[i], i);
        }
        return new int[]{};
    }




}
