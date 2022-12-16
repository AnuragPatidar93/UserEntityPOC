package com.in.web.entity;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;*/
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

@Validated
/*@ApiModel(description = "This is user Entity")*/
public class User implements Serializable {


    private int id;
    /*@ApiModelProperty(notes = "name of user")*/
    private String name;
    /*@ApiModelProperty(notes = "age of user")*/
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
