package com.example.core

import spock.lang.Specification

class PersonSpec extends Specification {

    def "person should have a new"() {
        given: "a person instantiated with a name"
        def sut = new Person("John Doe")

        when: "the name is retrieved"
        def result = sut.name

        then: "it should be the same as input"
        result == "John Doe"
    }

}
