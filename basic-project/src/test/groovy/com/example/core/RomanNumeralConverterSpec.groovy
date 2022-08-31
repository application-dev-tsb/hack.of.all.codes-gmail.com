package com.example.core

import spock.lang.Specification

class RomanNumeralConverterSpec extends Specification {

    def "should convert basic letters to integer"(String letter, Integer expectedResult) {
        given:
        RomanNumeralConverter converter = new RomanNumeralConverter()

        when:
        def converted = converter.convertToInteger( letter)

        then:
        converted == expectedResult

        where:
        letter  | expectedResult
        "I"     | 1
        "V"     | 5
        "X"     | 10
        "L"     | 50
        "C"     | 100
        "D"     | 500
        "M"     | 1000
    }

    def "should reduce the number in the front if previous is lower"(String letters, Integer expectedResult) {
        given:
        RomanNumeralConverter converter = new RomanNumeralConverter()

        when:
        def converted = converter.convertToInteger( letters )

        then:
        converted == expectedResult

        where:
        letters     | expectedResult
        "IX"        | 9
        "IV"        | 4
        "XXV"       | 25
        "XXXVI"     | 36
        "MXXIII"    | 1023
        "DXLII"     | 542
    }

    def "should reduce the number in the front if previous is higher or equals"(String letters, Integer expectedResult) {
        given:
        RomanNumeralConverter converter = new RomanNumeralConverter()

        when:
        def converted = converter.convertToInteger( letters )

        then:
        converted == expectedResult

        where:
        letters     | expectedResult
        "III"       | 3
        "XII"       | 12
    }


}
