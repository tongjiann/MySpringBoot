package com.xiw.bean;

import org.springframework.context.annotation.PropertySource;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-05-30 13:56
 */
public class Person {
    private int id;

    private Name name;
    private int sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", sex=" + sex +
                '}';
    }
}
