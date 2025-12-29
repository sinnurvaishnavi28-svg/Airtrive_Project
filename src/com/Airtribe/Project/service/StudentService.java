package com.Airtribe.Project.service;

import java.util.ArrayList;
import com.Airtribe.Project.entity.student;
import java.util.List;
import com.Airtribe.Project.exception.InvalidInputException;
public class StudentService {

    private List<student> student = new ArrayList<>();


    public void addStudent(int ID, String firstName, String lastName, String batch){
        student s = new student(ID ,firstName, lastName,batch);
        student.add(s);
        s.setisAtive(true);
    }

    public boolean removeStudent(int ID){
//        student.removeIf(student -> student.getID() == ID);
//        student s = new student(ID ,null,null,null);
//        s.setisAtive(false);
//        return false;
        for(student s : student){
            if(s.getID() == ID) {
                s.setisAtive(false);
                return true;
            }
        }
            return false;
    }

    public void updateStudent(int ID, String newBatch){
        for(student s : student){
            if(s.getID() == ID){
                s.setBatch(newBatch);
                break;
            }
        }
    }

    public List<student> listStudents(){
        return student;
    }

    public student findStudentByID(int ID) throws InvalidInputException {
        for(student s : student){   // make sure your list is named studentList
            if(s.getID() == ID) {
                return s;
            }
        }
        throw new InvalidInputException("Student with ID " + ID + " not found!");
    }


}
