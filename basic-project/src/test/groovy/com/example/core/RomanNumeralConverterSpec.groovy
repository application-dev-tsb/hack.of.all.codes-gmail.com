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
}
