package com.example.core;

public interface PersonRepository {

    void create(Person person);

    Person findById(Long id);
}
