package com.Airtribe.Project.service;
import com.Airtribe.Project.entity.enrollment;
import java.util.List;
import java.util.ArrayList;
import com.Airtribe.Project.Util.IdGenerator;
public class EnrollmentService {
    List<enrollment> enrollmentList = new ArrayList<>();
    IdGenerator i = new IdGenerator();
    public void enrollStudent(int studentID, int courseID) {
        enrollment e = new enrollment(i.getNextEnrollementIDCounter(),
                studentID,
                courseID,
                java.time.LocalDate.now(),
                enrollment.Status.ACTIVE
        );
        enrollmentList.add(e);
    }

    public List<enrollment> viewEnrollmentsByStudent(int studentID) {
        List<enrollment> result = new ArrayList<>();
        for (enrollment e : enrollmentList) {
            if (e.getStudentID() == studentID) {
                result.add(e);
            }
        }
        return result;
    }
    public boolean updateEnrollmentStatus(int enrollmentID, enrollment.Status newStatus) {
        for (enrollment e : enrollmentList) {
            if (e.getID() == enrollmentID) {
                e.setStatus(newStatus);
                return true;
            }
        }
        return false;
    }
    public List<enrollment> getEnrollmentsByStudent(int studentID) {
        List<enrollment> result = new ArrayList<>();
        for (enrollment e : enrollmentList) {
            if (e.getStudentID() == studentID) {
                result.add(e);
            }
        }
        return result;
    }

}
