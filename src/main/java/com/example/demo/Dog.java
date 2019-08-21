package com.example.demo;

import javax.validation.constraints.Min;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Dog
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Min(1)
    private long id;


    @NotNull
    //@Size(min=3, max=20)
    private String name;

    @NotNull
    @Min(1)
    private int age;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}