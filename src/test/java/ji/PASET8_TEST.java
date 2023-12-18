package ji;

import static org.junit.Assert.*;
import org.junit.Test;

public class PASET8_TEST {
    PASET8 statsCalculator = new PASET8();

    @Test
    public void meanTest_PS8() {
        int[] arr = { 1, 2, 3, 4, 5 };
        double expectedMean = 3.0;
        assertEquals(expectedMean, statsCalculator.mean(arr), 0.001);
    }

    @Test
    public void minTest_PS8() {
        int[] arr = { 5, 3, 9, 1, 6 };
        int expectedMin = 1;
        assertEquals(expectedMin, statsCalculator.min(arr));
    }

    @Test
    public void maxTest_PS8() {
        int[] arr = { 5, 3, 9, 1, 6 };
        int expectedMax = 9;
        assertEquals(expectedMax, statsCalculator.max(arr));
    }

    @Test
    public void rangeTest_PS8() {
        int[] arr = { 5, 3, 9, 1, 6 };
        int expectedRange = 8;
        assertEquals(expectedRange, statsCalculator.range(arr));
    }

    @Test
    public void modeTest_PS8() {
        int[] arr = { 3, 5, 2, 5, 8, 5 };
        int expectedMode = 5;
        assertEquals(expectedMode, statsCalculator.mode(arr));
    }

    @Test
    public void medianTest_PS8() {
        int[] arr = { 7, 2, 10, 5, 9 };
        double expectedMedian = 7.0;
        assertEquals(expectedMedian, statsCalculator.median(arr), 0.001);
    }

    @Test
    public void iqrTest_PS8() {
        int[] arr = { 3, 7, 1, 9, 5 };
        double expectedIQR = 5.0;
        assertEquals(expectedIQR, statsCalculator.iqr(arr), 0.001);
    }
}
