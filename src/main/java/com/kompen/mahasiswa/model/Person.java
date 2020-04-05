package com.kompen.mahasiswa.model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    private final UUID id;
    private final String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}