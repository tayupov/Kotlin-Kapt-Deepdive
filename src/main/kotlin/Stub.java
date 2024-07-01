package com.example;

import javax.inject.Inject;

public final class Stub {
    private final String name;
    private final int age;

    @Inject
    public Stub(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return this.name;
    }

    public final int getAge() {
        return this.age;
    }
}
