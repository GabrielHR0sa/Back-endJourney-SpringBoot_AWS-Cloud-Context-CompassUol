package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties("field1") // ignora o campo definido
//@JsonIgnore //ignora o campo abaixo
@JsonFilter("SomeBeanFilter")
public class SomeBean {
    
    private String field1;
    private String field2;
    private String field3;


    public SomeBean(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }


    public String getField1() {
        return this.field1;
    }

    public String getField2() {
        return this.field2;
    }

    public String getField3() {
        return this.field3;
    }

    @Override
    public String toString() {
        return "{" +
            " field1='" + getField1() + "'" +
            ", field2='" + getField2() + "'" +
            ", field3='" + getField3() + "'" +
            "}";
    }

}
