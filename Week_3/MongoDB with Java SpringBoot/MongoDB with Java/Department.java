//package com.exemple.entity

//import org.springframework.data.mongodb.core.mapping.Document;

//@Document
public class Department {
    
    private String departmentName;

    private String location;

    //@Field(name = "department_name")
    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
