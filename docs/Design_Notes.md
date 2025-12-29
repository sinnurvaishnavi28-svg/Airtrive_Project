1️⃣ Why ArrayList instead of Array

I used ArrayList instead of a plain array because:
-> ArrayList is dynamic, meaning it can grow or shrink at runtime, while arrays have a fixed size.

-> ArrayList provides built-in methods like add(), remove(), contains(), and get() which make managing collections of objects much easier.

-> Using ArrayList improves readability and reduces manual array resizing code.

Example:
List<Student> students = new ArrayList<>();
students.add(new Student(1000, "John", "Singh", "C-17"));

2️⃣ Where static members are used and why

I used static members in the IdGenerator utility class:

private static int studentIdCounter = 1000;
public static int getNextStudentIDCounter() {
return studentIdCounter++;
}

Reason:
-> Static fields and methods belong to the class rather than an instance, so we can maintain a global counter for IDs.

-> Ensures that all students and courses get unique IDs, without creating multiple objects of IdGenerator.


3️⃣ Where inheritance is used and what we gained

I used inheritance to create a class hierarchy:

Person (base class)
└─ Student (subclass)


Person class contains common fields: id, firstName, lastName, email.

Student class extends Person and adds batch and active fields.

Benefits of inheritance:

Avoids code duplication for common fields and methods.

Makes it easier to extend functionality later (e.g., adding a Trainer class).

Allows polymorphism, e.g., we could treat any Student as a Person if needed.

4. Class Diagram (Text Representation)
   +----------------+
   |     Person     |
   +----------------+
   | - ID           |
   | - firstName    |
   | - lastName     |
   | - email        |
   +----------------+
   ^
   |
   +-----------------------+
   |       Student         |
   +-----------------------+
   | - batch               |
   | - isActive            |
   +-----------------------+
   | +getDisplayName()     |
   +-----------------------+

+----------------+     +----------------+     +----------------+
|   Course       |     | Enrollment     |     | StudentService |
+----------------+     +----------------+     +----------------+
| - ID           |     | - ID           |     | - studentList  |
| - courseName   |     | - studentID    |     +----------------+
| - description  |     | - courseID     |     | +addStudent()  |
| - duration     |     | - enrollmentDate|    | +removeStudent()|
| - isActive     |     | - status       |     | +findStudentByID()|
+----------------+     +----------------+     +----------------+
| +toString()    |     | +getStatus()   |     
+----------------+     | +setStatus()   |
+----------------+

+----------------+     +----------------+
| CourseService  |     | EnrollmentService|
+----------------+     +----------------+
| - courseList   |     | - enrollmentList |
+----------------+     +----------------+
| +addCourse()   |     | +enrollStudent()|
| +findCourseByID()|   | +viewEnrollmentsByStudent()|
+----------------+     | +updateEnrollmentStatus()|
+----------------+

Notes:
Person → Student: Inheritance (Student extends Person).
StudentService manages Student objects.
CourseService manages Course objects.
EnrollmentService manages Enrollment objects and links Students with Courses.
Use composition: Enrollment has studentID and courseID instead of full objects (simpler for in-memory management).