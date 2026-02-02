package com.example.apitest.dto;

public class UserProfileResponse {
    private Long id;
    private String fullName;
    private int age;
    private String email;
    private String address;

    public UserProfileResponse(Long id, String fullName, int age, String email, String address) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
