package com.example.core

import spock.lang.Specification

class PersonServiceSpec extends Specification {

    def "FindPersonById"() {
        given: "a service with mock stuffs"
        PersonRepository mockRepo = Stub(PersonRepository.class)
        PersonService sut = new PersonService(mockRepo)

        and: "some fake data"
        def fakeCustomer = new Person(1,"Test")
        mockRepo.findById(1) >> fakeCustomer

        when: "we try to fetch"
        def actualCustomer = sut.findPersonById(1)

        then:
        actualCustomer == fakeCustomer
    }

    def "Create"() {
    }
}
