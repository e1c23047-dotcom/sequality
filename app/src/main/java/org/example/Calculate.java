package org.example;

public class Calculate {
    public int sum(int x, int y) {
        return x + y;
    }

    public int getIndividualFee(int age) {
        if (age < 13) {
            return 1000; // Fee for children
        } else {
            return 2000; // Fee for seniors
        }
    }
    public int getTotalFee(int age , int groupSize) {
        int individualFee = getIndividualFee(age);
        int result = individualFee * groupSize;
        if (groupSize >= 10) {
            result = (int)(result * 0.9);
        }
        return result;
    }
}
