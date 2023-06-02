package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class Name {
    private String firsName;
    private String lastName;


    public Name(String firsName, String lastName) {
        super();
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return this.firsName;
    }

    public String getLastName() {
        return this.lastName;
    }


    @Override
    public String toString() {
        return "{" +
            " firsName='" + getFirsName() + "'" +
            ", lastName='" + getLastName() + "'" +
            "}";
    }

}
