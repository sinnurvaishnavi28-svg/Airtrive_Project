package com.Airtribe.Project.entity;
import com.Airtribe.Project.Util.IdGenerator;
public class Person {
   protected int ID;
   protected String firstName;
    protected String lastName;
    protected String email;

    IdGenerator i = new IdGenerator();
    public Person( int ID,String firstName,String lastName,String email) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public Person( int ID,String firstName,String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getDisplayName(){
        return firstName;
    }
}
