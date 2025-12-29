package com.Airtribe.Project.service;

import com.Airtribe.Project.entity.course;
import com.Airtribe.Project.entity.student;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

    private List<course> courses = new ArrayList<>();


    // Adding a course
    public void addCourse(int ID, String courseName, String description, String durationInWeeks){
        course c = new course(ID ,courseName, description,durationInWeeks);
        courses.add(c);
        c.setstatus(true);
    }

//     Deactivate a course (don’t delete)
    public boolean removeCourse(int ID){
        for(course c : courses){
            if(c.getID() == ID) {
                c.setstatus(false);
                return true;
            }
        }
        return false;
    }

     // Listing all courses
    public List<course> listCourses(){
        return courses;
    }
    // Finding a course by ID
    public course findCourseByID(int ID){
        for(course c : courses){
            if(c.getID() == ID) {
                return c;
            }
        }
        return null;
    }



}


