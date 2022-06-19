package com.greatlearning.model;

public class Employee {
    String firstname;
    String lastName;

    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName) {

        this.firstname = firstName;
        this.lastName = lastName;

    }
}
