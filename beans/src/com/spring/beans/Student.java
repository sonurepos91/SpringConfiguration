package com.spring.beans;

import javax.annotation.PostConstruct;

public class Student {
    private String name;
    private String gender;

    private Address address;

    public Student(String name, String gender, Address address) {
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + ", address=" + address + '}';
    }

    public void initialize() {
        System.out.println("Bean is initialized");
    }
}
