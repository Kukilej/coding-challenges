import java.util.*;

public class TwoPointers {

    //https://leetcode.com/problems/valid-palindrome/
    public static boolean isPalindrome(String s) {

        char[] convertedString = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : convertedString) {
            if (Character.isLetter(c) || Character.isDigit(c)) sb.append(c);
        }
        int start = 0;
        int end = sb.length() - 1;
        while (start < end) {
            if (sb.charAt(start) != sb.charAt(end)) return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }


    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) return new int[]{start + 1, end + 1};
            else if (sum > target) {
                end--;
            } else start++;
        }
        return new int[]{};
    }

    //https://leetcode.com/problems/3sum/
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return Collections.emptyList();
        Set<List<Integer>> distinctPairs = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    distinctPairs.add(List.of(nums[i], nums[start++], nums[end--]));
                } else if (sum > 0) end--;
                else start++;
            }
        }
        return distinctPairs.stream().toList();
    }

}

