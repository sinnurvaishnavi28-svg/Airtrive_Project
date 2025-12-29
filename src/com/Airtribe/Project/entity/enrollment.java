package com.Airtribe.Project.entity;
import java.time.LocalDate;

public class enrollment {

    public enum Status{
        ACTIVE,
        COMPLETED,
        CANCELLED
    }
    private int ID;
    private int studentID;
    private int courseID;
    private LocalDate enrollmentDate;
  private Status status;

    public enrollment(int ID,int studentID,int courseID,LocalDate enrollmentDate,Status status){
            this.ID = ID;
            this.studentID=studentID;
            this.courseID = courseID;
            this.enrollmentDate = enrollmentDate;
            this.status = status;

    }

    //gettters
    public int getID(){
        return ID;
    }
    public int getStudentID(){
        return studentID;
    }
    public int getCourseID(){
        return courseID;
    }
    public LocalDate getEnrollmentDate(){
        return enrollmentDate;
    }
    public Status getStatus(){
        return status;
    }

    //gettters
    public void setID(int ID){
        this.ID = ID;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public void setCourseID(int courseID){
        this.courseID = courseID;
    }
    public void setEnrollmentDate(LocalDate enrollmentDate){
        this.enrollmentDate = enrollmentDate;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    @Override
    public String toString() {
        return "Enrollment{" +
                "ID=" + ID +
                ", studentID=" + studentID +
                ", courseID=" + courseID +
                ", date=" + enrollmentDate +
                ", status=" + status +
                '}';
    }
}
