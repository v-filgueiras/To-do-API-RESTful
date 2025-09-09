package com.victor.todo_list.todo_list.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table 
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "username", nullable = false, length = 100)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;
    
    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "e-mail", nullable = false, length = 124)
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