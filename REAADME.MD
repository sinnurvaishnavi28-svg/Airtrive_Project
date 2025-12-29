# LearnTrack - Student & Course Management System

## Project Description
LearnTrack is a console-based Java application that allows admins to manage students, courses, and enrollments.
It demonstrates core Java concepts including object-oriented programming (inheritance, encapsulation, polymorphism), collections, and basic exception handling.

Features include:
- Adding, viewing, searching, and deactivating students
- Adding, viewing, searching, and activating/deactivating courses
- Enrolling students in courses and updating enrollment status
- Menu-driven console interface for user interaction

Airtrive_Project/
└─ src/
└─ com/
└─ Airtribe/
└─ Project/
├─ ui/
│   └─ Main.java
├─ service/
│   └─ StudentService.java
├─ entity/
│   └─ student.java
└─ Util/
└─ IdGenerator.java

this is how we to compile and run it step by step:

1️⃣ Open your terminal / command prompt and go to the project root:
            cd C:\Users\Vaishnavi212\Desktop\Airtrive_Project

2️⃣ Compile all .java files under src and output .class files to a new folder out:
            "javac -d out src/com/Airtribe/Project/**/*.java"

Explanation:
-d out → compiled .class files will go into the out folder, keeping package structure.
src/com/Airtribe/Project/**/*.java → compile all Java files recursively in your project.

3️⃣ Run the Main class:
           "java -cp out com.Airtribe.Project.ui.Main"


Explanation:
-cp out → tells Java to look for compiled classes inside the out folder.
 com.Airtribe.Project.ui.Main → fully qualified name of your Main class (package + class name).
his command runs your program from the command line, independent of the IDE. It's useful for testing builds or running on other machines.