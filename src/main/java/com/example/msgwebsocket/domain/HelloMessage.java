package com.example.msgwebsocket.domain;

public class HelloMessage {
    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HelloMessage setName(String name) {
        this.name = name;
        return this;
    }
}
