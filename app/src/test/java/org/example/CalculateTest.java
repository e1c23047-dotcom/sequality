package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sum(2, 3), "Sum of 2 and 3 should be 5");
    }
    @Test
    public void getTotalFeeTest() {
        Calculate calculate = new Calculate();
        int expected = 1000;
        assertEquals(expected, calculate.getTotalFee(10, 1), "Total fee for age 10 and group size 1 should be 1000");
    }
    @Test
    public void getTotalFeeTest_kadai2() {
        Calculate calculate = new Calculate();
        assertEquals(9000, calculate.getTotalFee(0, 9), "Total fee for age 0 and group size 9 should be 9000");
        assertEquals(9000, calculate.getTotalFee(12, 9), "Total fee for age 12 and group size 9 should be 9000");
        assertEquals(18000, calculate.getTotalFee(13, 9), "Total fee for age 13 and group size 9 should be 18000");
        assertEquals(18000, calculate.getTotalFee(99, 9), "Total fee for age 99 and group size 9 should be 18000");
        
        assertEquals(9000, calculate.getTotalFee(0, 10), "Total fee for age 0 and group size 10 should be 9000");
        assertEquals(9000, calculate.getTotalFee(12, 10), "Total fee for age 12 and group size 10 should be 9000");
        assertEquals(18000, calculate.getTotalFee(13, 10), "Total fee for age 13 and group size 10 should be 18000");
        assertEquals(18000, calculate.getTotalFee(99, 10), "Total fee for age 99 and group size 10 should be 18000");
    }
}
