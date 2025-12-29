1. What is JDK, JRE, JVM?
-> The Java Virtual Machine (JVM) : is a program that runs on your computer that interprets Java Byte Code, and basically translates it to your operating systems of choice.

-> The Java Runtime Environment (JRE) is some standard packages, that are supposedly always there. When I compile a Java application, these packages are not compiled into my Java Binaries, as they are expected to be there. If you delete these packages from your operating system, a lot of Java programs will most likely fail.

-> The Java Development Kit (JDK) contains a Java Compiler that can compile Java Source Code into Java Byte Code, and various other tools for developing Java applications.
   It also contains even more packages that are common enough to warrant they always be available for the compiler, but not so common that they are in the JRE. I don’t have to write these classes myself, but they will be compiled into the Java Binaries at compile time.

2. what is Bytecode?
-> It’s code that can run on a JVM, We can write a program that can run on a Mac, we can also make a program that runs on a windows PC, but making one that runs on both is not possible.
   Java solves the problem by creating a sort of virtual computer called Java virtual machine, so you only have to write bytecode that can run on this machine, the JVM.
   The developers of java take care of writing a program that lets a computer execute code for a JVM on any pc, so only they have to make the code work on all platforms and you don’t care

3. What does “write once, run anywhere” mean (1–2 short paragraphs)
-> Write Once, Run Anywhere means that a Java program is written only one time, but it can run on different operating systems like Windows, Linux, or macOS without changing the code. When we write a Java program, it is not converted directly into machine code. Instead, it is compiled into bytecode, which can be understood by the JVM present on each operating system.
   A real-world example is like writing a document in English. Anyone who understands English can read it, no matter which country they are in. Similarly, Java bytecode can be run on any system as long as that system has a JVM installed. This is why Java is called platform-independent.