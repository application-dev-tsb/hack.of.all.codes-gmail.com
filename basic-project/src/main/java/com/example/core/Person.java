package com.example.core;

public record Person(Long id, String name) {

    Person(String name) {
        this(null, name);
    }
}
