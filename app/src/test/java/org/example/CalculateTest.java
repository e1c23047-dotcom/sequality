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
}
