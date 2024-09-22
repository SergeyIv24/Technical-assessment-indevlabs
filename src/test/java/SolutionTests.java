import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTests {

    @Test
    public void shouldReturn4() {
        int[] nums1FromDescription = {5, 0, 1, 3, 2};
        int expected = 4;
        Assertions.assertEquals(expected, Solution.findMissingNumber(nums1FromDescription));
    }

    @Test
    public void shouldReturn8() {
        int[] nums1FromDescription = {7, 9, 10, 11, 12};
        int expected = 8;
        Assertions.assertEquals(expected, Solution.findMissingNumber(nums1FromDescription));
    }

    @Test
    public void shouldReturn() {
        int[] numsDesc = {10, 9, 8, 6, 5, 4};
        int expected = 7;
        Assertions.assertEquals(expected, Solution.findMissingNumber(numsDesc));
    }

    @Test
    public void shouldReturn795() {
        int[] numsOf800Elements = new int[800];
        for (int i = 0; i < numsOf800Elements.length; i++) { //Fill array elements except 795
            if (i == 795) {
                continue;
            }
            numsOf800Elements[i] = i;
        }
        int expected = 795;
        Assertions.assertEquals(expected, Solution.findMissingNumber(numsOf800Elements));
    }

    @Test
    public void shouldReturn100001() {
        int[] numsOf100001 = new int[100001];
        for (int i = 0; i <= (numsOf100001.length - 1); i++) { //Fill array elements except 100001
            numsOf100001[i] = i;
        }
        int expected = 100001;
        Assertions.assertEquals(expected, Solution.findMissingNumber(numsOf100001));
    }

    @Test
    public void shouldReturnNegativeWhenArrayIsNull() {
        int expected = -1;
        Assertions.assertEquals(expected, Solution.findMissingNumber(null));
    }

    @Test
    public void shouldReturnNegativeWhenArrayContainsOneElement() {
        int[] numsWithOneElement = {1};
        int expected = -1;
        Assertions.assertEquals(expected, Solution.findMissingNumber(numsWithOneElement));
    }
}
