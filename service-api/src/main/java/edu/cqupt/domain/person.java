/*
  Copyright (C), 2011-2018, 微贷网.
 */
package edu.cqupt.domain;

/**
 * @author wd 2018/12/6.
 */
public class person {
    private String name;
    private String password;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public person(String name, String password) {

        this.name = name;
        this.password = password;
    }

    public person() {
    }
}
