package com.Airtribe.Project.Util;

public class IdGenerator {

    private static int studentIDCounter = 1000;
    private int studentID;
    private static int courseIDCounter = 2000;
    private static int enrollementIDCounter = 3000;
//    public IdGenerator(){
//        this.studentID = studentIDCounter++;
//    }

    public  int getNextStudentIDCounter(){
        return studentIDCounter++;
    }
    public  int getNextCourseIDCounter(){
        return courseIDCounter++;
    }
    public static int getNextEnrollementIDCounter(){
        return ++enrollementIDCounter;
    }


}
