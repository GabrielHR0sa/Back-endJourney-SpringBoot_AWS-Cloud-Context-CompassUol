package com.example.demo;

import java.io.Serializable;

public class Person implements Serializable{
    
    private long Id;

    private String name;


    public Person(long Id, String name) {
        super();
        this.Id = Id;
        this.name = name;
    }


    public long getId() {
        return this.Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
