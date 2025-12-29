package com.Airtribe.Project.entity;

public class course {
    private int ID;
    private String courseName;
    private String description;
    private String durationInWeeks;
    private boolean active;

    public course(int ID,String courseName, String description,String durationInWeeks){
        this.ID = ID;
        this.courseName = courseName;
        this.description = description;
        this.durationInWeeks = durationInWeeks;
        this.active = active;
    }
    public course(int ID,String courseName, String description,String durationInWeeks,boolean active){
        this(ID,courseName,description,durationInWeeks);
        this.active = active;
    }
    //setters
    public void setetID(int ID){
        this.ID = ID;
    }
    public void setcourseName(String courseName){
        this.courseName = courseName;
    }
    public void setdescription(String description){
        this.description = description;
    }
    public void setgetdurationInWeeks(String durationInWeeks){
        this.durationInWeeks = durationInWeeks;
    }
    public void setstatus(boolean active){
        this.active = active;
    }

    // getters
    public int getID(){
        return ID;
    }
    public String getcourseName(){
        return courseName;
    }
    public String description(){
        return description;
    }
    public String getdurationInWeeks(){
        return durationInWeeks;
    }
    public boolean getstatus(){
        return active;
    }

    @Override
    public String toString() {
        return "Course{" +
                "ID=" + ID +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", durationInWeeks=" + durationInWeeks +
                ", active=" + active +
                '}';
    }

}
