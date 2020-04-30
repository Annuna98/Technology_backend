package com.myamikova.blog.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private Integer weight;

    @Column
    private Integer height;

    @Column
    private Integer desired_weight;

    @Column
    private String fname;

    @Column
    private String surname;

    @Column
    private String gender;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private int age;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getDesired_weight() {
        return desired_weight;
    }

    public void setDesired_weight(Integer desired_weight) {
        this.desired_weight = desired_weight;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
