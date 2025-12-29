package com.Airtribe.Project.ui;
import com.Airtribe.Project.service.StudentService;
import com.Airtribe.Project.Util.IdGenerator;
import com.Airtribe.Project.entity.student;
import com.Airtribe.Project.service.CourseService;
import com.Airtribe.Project.entity.course;
import java.util.*;
import com.Airtribe.Project.service.EnrollmentService;
import java.time.LocalDate;
import com.Airtribe.Project.entity.enrollment;
import com.Airtribe.Project.exception.InvalidInputException;
public class Main {
    public static void main(String[] args) {

        IdGenerator i = new IdGenerator();

        StudentService s = new StudentService();
        s.addStudent(i.getNextStudentIDCounter(), "John", "Singh", "C-17");
        s.addStudent(i.getNextStudentIDCounter(), "Nick", "Rajput", "C-19");
        s.addStudent(i.getNextStudentIDCounter(), "Donald", "Kapoor", "C-13");
        s.addStudent(i.getNextStudentIDCounter(), "Messi", "Don", "C-15");

        System.out.println("=======================================================================================");
        System.out.println("Listing the students");
        for (student st : s.listStudents()) {
            System.out.println(st);
        }


        System.out.println("=======================================================================================");
        System.out.println("searching student By ID");
        try {
            student result = s.findStudentByID(1000); // s is your StudentService object
            System.out.println(result);
        } catch (InvalidInputException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("================================================================================");
        System.out.println("deactivating a student instead of removing");
        System.out.println(s.removeStudent(1000));


        System.out.println("=======================================================================================");
        System.out.println("Listing the students");
        for (student st : s.listStudents()) {
            System.out.println(st);
        }

        System.out.println("=======================================================================================");
        System.out.println("Adding a courses");

        CourseService c = new CourseService();
        c.addCourse(i.getNextCourseIDCounter(), "Java", "this is a java course", "24 weeks");
        c.addCourse(i.getNextCourseIDCounter(), "Web Development", "this is a Web Developemt course", "20 weeks");
        c.addCourse(i.getNextCourseIDCounter(), "NodeJS", "this is a NodeJS course", "54 weeks");
        c.addCourse(i.getNextCourseIDCounter(), "MangoDB", "this is a MangoDB course", "44 weeks");
        c.addCourse(i.getNextCourseIDCounter(), ".NET", "this is a .NET course", "74 weeks");

        System.out.println("=======================================================================================");
        System.out.println("listing a courses");
        for(course co : c.listCourses()){
            System.out.println(co);
        }


        System.out.println("=======================================================================================");
        System.out.println("searching course By ID");
        course courseresult = c.findCourseByID(2000);
        if(courseresult != null){
            System.out.println(courseresult);
        }
        else{
            System.out.println("course not found");
        }

        System.out.println("================================================================================");
        System.out.println("deactivating a student instead of removing");
        System.out.println(c.removeCourse(1000));


        System.out.println("=======================================================================================");
        System.out.println("Listing the students");
        for(course co : c.listCourses()){
            System.out.println(co);
        }

        System.out.println("==========================================================================================");
        System.out.println("enrollment operations");
        EnrollmentService e = new EnrollmentService();

        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("===== LearnTrack Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Deactivate Student");
            System.out.println("5. Add Course");
            System.out.println("6. List Courses");
            System.out.println("7. Enroll Student in Course");
            System.out.println("8. View Enrollments for Student");
            System.out.println("9. Update Enrollment Status");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = sc.nextLine();
                    int studentID = i.getNextStudentIDCounter();
                    s.addStudent(studentID, firstName, lastName, batch);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    for (student st : s.listStudents()) {
                        System.out.println(st);
                    }

                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchID = sc.nextInt();

                    try {
                        student result = s.findStudentByID(searchID);
                        System.out.println(result);
                    } catch (InvalidInputException ex) {
                        System.out.println("Student not found! " + ex.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to deactivate: ");
                    int deactivateID = sc.nextInt();
                    boolean deactivated = s.removeStudent(deactivateID);
                    System.out.println(deactivated ? "Student deactivated." : "Student not found!");
                    break;

                case 5:
                    System.out.print("Enter Course Name: ");
                    String courseName = sc.nextLine();
                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();
                    int courseID = i.getNextCourseIDCounter();
                    c.addCourse(courseID, courseName, description, courseresult.getdurationInWeeks());
                    System.out.println("Course added successfully!");
                    break;

                case 6:
                    List<course> courses = c.listCourses();
                    for (course c1 : courses) {
                        System.out.println(c1);
                    }
                    break;

                case 7:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();
                    e.enrollStudent(sid, cid);
                    System.out.println("Student enrolled successfully!");
                    break;

                case 8:
                    System.out.print("Enter Student ID to view enrollments: ");
                    int sId = sc.nextInt();
                    List<enrollment> studentEnrollments = e.viewEnrollmentsByStudent(sId);
                    for (enrollment e1 : studentEnrollments) {
                        System.out.println(e1);
                    }
                    break;



                case 9:
                    System.out.print("Enter Enrollment ID: ");
                    int eId = sc.nextInt();
                    System.out.println("Select Status: 1=ACTIVE, 2=COMPLETED, 3=CANCELLED");
                    int statusChoice = sc.nextInt();

                    enrollment.Status status;
                    switch (statusChoice) {
                        case 1 -> status = enrollment.Status.ACTIVE;
                        case 2 -> status = enrollment.Status.COMPLETED;
                        case 3 -> status = enrollment.Status.CANCELLED;
                        default -> {
                            System.out.println("Invalid choice, setting to ACTIVE by default");
                            status = enrollment.Status.ACTIVE;
                        }
                    }

                    boolean updated = e.updateEnrollmentStatus(eId, status);
                    System.out.println(updated ? "Enrollment updated." : "Enrollment not found!");
                    break;

                case 0:
                    System.out.println("Exiting LearnTrack. Bye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println();
        }

        sc.close();
    }
}