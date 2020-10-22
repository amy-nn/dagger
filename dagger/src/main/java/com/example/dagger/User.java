package com.example.dagger;

import javax.inject.Inject;

/**
 * 依赖需求方
 */
public class User {

    private String name = "默认";

    private Job job;


    public User(){
    }

    @Inject
    public User(Job job){
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", job=" + job +
                '}';
    }
}
