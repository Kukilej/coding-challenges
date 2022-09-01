import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysAndHashingTest {


    @Test
    public void testContainsDuplicate() {
        assertTrue(ArraysAndHashing.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void testIsAnagram() {
        assertTrue( ArraysAndHashing.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void testTwoSum() {
        assertArrayEquals(new int[]{0,1},ArraysAndHashing.twoSum(new int[]{2,7,11,15}, 9));
    }
}