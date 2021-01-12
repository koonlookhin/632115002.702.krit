package week6;

public class Engineer extends Person{
    String thisEngineer;
    public Engineer(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void WhatEngineer(){
        System.out.println(name +" is "+thisEngineer +" engineer ");
    }
}
