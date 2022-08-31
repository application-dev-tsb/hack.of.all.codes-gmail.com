package com.example.ports;

import com.example.core.Person;
import com.example.core.PersonRepository;
import jakarta.inject.Singleton;

import java.util.HashMap;
import java.util.Map;

@Singleton
public class InMemoryPersonRepository implements PersonRepository {

    private final Map<Long, Person> storage = new HashMap<>();

    @Override
    public void create(Person person) {

    }

    @Override
    public Person findById(Long id) {
        if (storage.containsKey(id)) return storage.get(id);
        return null;
    }
}
