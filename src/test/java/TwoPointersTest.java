import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoPointersTest {

    @Test
    public void testIsPalindrome() {
        assertTrue( TwoPointers.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testTwoSumSortedArray() {
        assertArrayEquals(new int[]{1,2}, TwoPointers.twoSum(new int[]{2,7,11,15}, 9));
    }
    @Test
    public void testThreeSum() {
        assertArrayEquals(Arrays.asList(Arrays.asList(-1,-1,2),Arrays.asList(-1,0,1)).toArray(), TwoPointers.threeSum(new int[]{-1,0,1,2,-1,-4}).toArray());
    }

}
