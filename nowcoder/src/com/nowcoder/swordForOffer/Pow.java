package com.nowcoder.swordForOffer;

public class Pow {
    public static void main(String[] args) {
        System.out.println(pow(2, -3));
    }

    private static double pow(double base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        double result = 1.0;
        boolean negFlag = (exponent < 0);
        if (negFlag) {
            exponent = -exponent;
        }
        System.out.println(exponent);
        while (exponent != 1) {
            if (exponent % 2 == 1) {
                result *= base;
            }
            result *= result;
            exponent /= 2;
        }
        result *= base;
        return (negFlag) ? (1 / result) : result;
    }
}
