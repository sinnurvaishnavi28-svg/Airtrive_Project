package com.Airtribe.Project.entity;

public class Trainer extends Person{

    private int Experience;
    private int Salary;

    public Trainer(int ID,String firstName,String lastName,String email, int Experience, int Salary){
        super(ID,firstName,lastName,email);
        this.Experience= Experience;
        this.Salary = Salary;
    }

}
