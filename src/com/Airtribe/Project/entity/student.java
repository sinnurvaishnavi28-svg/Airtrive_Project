package com.Airtribe.Project.entity;

public class student extends Person{
    //  Need to remove these variables bez to show the inheritance we created these variables in a class Person

//    private int ID;
//    private String firstName;
//    private String lastName;
//    private String email;


    private String batch;
    private boolean isAtive;



    public student(int ID,String firstName,String lastName,String batch,boolean isAtive ){
       super(ID,firstName,lastName);
        this.batch = batch;
        this.isAtive = isAtive;
    }
    public student(int ID, String firstName,String lastName,String batch){
       super(ID,firstName,lastName);
        this.batch = batch;
    }

    //Demonstrated constructor overloading
    public student(int ID,String firstName,String lastName,String email,String batch,boolean isAtive){
        super(ID,firstName,lastName,email);
        this.batch = batch;
        this.isAtive = isAtive;

    }

    public int getID(){
        return this.ID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getBatch(){
        return this.batch;
    }
    public boolean getisAtive(){
        return this.isAtive;
    }

    //setters
    public void setID(int ID){
        this.ID =  ID;
    }
    public void setFirstName(String firstName){
        this.firstName= firstName;
    }
    public void getLastName(String lastName){
        this.lastName= lastName;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public void setBatch(String batch){
        this.batch= batch;
    }
    public void setisAtive(boolean isAtive){
         this.isAtive = isAtive;
    }

    public String getDisplayName(int ID,String batch){
        this.ID = ID;
        this.batch = batch;
        return firstName;
    }

    // Display name
    public String getDisplayName() {
        return getFirstName() + " " + getLastName() + " (" + batch + ")";
    }

    // toString()
    @Override
    public String toString() {
        return "Student{" +
                "ID=" + getID() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", batch='" + batch + '\'' +
                ", active=" + isAtive +
                '}';
    }
}

