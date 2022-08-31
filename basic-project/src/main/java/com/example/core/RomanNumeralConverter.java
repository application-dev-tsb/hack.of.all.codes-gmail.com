package com.example.core;

public class RomanNumeralConverter {

    Integer convertToInteger(String romanNumeral) {
        if (romanNumeral.isEmpty()) return 0;
        if (romanNumeral.length() == 1) {
            return convertSingleDigit(romanNumeral);
        }

        Integer left = convertToInteger(romanNumeral.substring(0, 1));
        Integer right = convertToInteger(romanNumeral.substring(1, 2));
        Integer remaining = romanNumeral.length() > 2
                ? convertToInteger(romanNumeral.substring(2))
                : 0;

        if (right > left) {
            return right - left + remaining;
        }

        return right + left + remaining;
    }

    private Integer convertSingleDigit(String digit) {
        switch (digit) {
            case "I": return 1;
            case "V": return 5;
            case "X": return 10;
            case "L": return 50;
            case "C": return 100;
            case "D": return 500;
            case "M": return 1000;
        }
        throw new RuntimeException("TODO");
    }
}
