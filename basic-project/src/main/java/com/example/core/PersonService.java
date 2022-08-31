package com.example.core;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Singleton
public class PersonService {

    private final PersonRepository repository;

    Person findPersonById(Long id) {
        return repository.findById(id);
    }

    void create(Person person) {
        var safePerson = new Person(person.name());
        repository.create(safePerson);
    }
}
