package com.victor.todo_list.todo_list.domain.entity;

public class UserEntity {
    private String name;
    private int age;
    private String cpf;
    private String email;

    public UserEntity(String name, int age, String cpf, String email) {
        setName(name);
        setAge(age);
        setCpf(cpf);
        setEmail(email);
    }

    public UserEntity() {}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}