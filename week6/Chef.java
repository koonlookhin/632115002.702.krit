package week6;

public class Chef extends Person {
    String kindOfChef;
    public Chef (String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void WhatChef(){
        System.out.println(name+" is "+kindOfChef+" chef ");
    }
}

