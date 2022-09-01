import java.util.List;

public class TwoPointers {

    //https://leetcode.com/problems/valid-palindrome/
    //after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters
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






    public int[] twoSum(int[] numbers, int target) {
//    int start = 0;
//    int end = numbers.length - 1;
//        while (start < end) {
//        int sum = numbers[start] + numbers[end];
//        if (sum == target) return new int[]{start + 1, end + 1};
//        else if (sum >= target) {
//            end--;
//        } else start++;
//    }
//        return null;
        return null;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        return null;
    }

}
