package com.driver;

public class RWOnly {
    private String name;
    String test;

    public String getName() {
        return this.name;
    }
    
    public String setName(String name){
        this.name=name;
        return this.name;
    }
}
