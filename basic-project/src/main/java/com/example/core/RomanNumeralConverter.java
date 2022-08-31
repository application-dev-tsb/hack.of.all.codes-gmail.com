package com.example.core;

public class RomanNumeralConverter {

    Integer convertToInteger(String romanNumeral) {
        if (romanNumeral.length() == 1) {
            return convertSingleDigit(romanNumeral);
        }

        Integer tail = convertToInteger(romanNumeral.substring(0, romanNumeral.length()-1));
        Integer head = convertToInteger(romanNumeral.substring(romanNumeral.length()-1));

        if (head > tail) {
            return head - tail;
        }

        return 1;
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
