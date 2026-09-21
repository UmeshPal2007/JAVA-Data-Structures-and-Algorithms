# Java Programming Fundamentals
Author-Umesh Pal
<br>
​A comprehensive collection of Java programs, exercises, projects and problem-solving practice designed to master the core concepts of the Java Programming language. This repository serves as a documented learning journey through Object-Oriented Programming (OOPs), data structures & algorithms (DSA), and Java syntax.

## 🚀 Overview
​This repository contains structured code examples and documentation for anyone looking to build a strong foundation in Java. It covers everything from basic syntax to advanced OOPs principles & Data Structures & Algorithms.
# Contents
## Java Fundamentals
​The repository is organized by topic to make navigation easy:<br>
​1. ☕ Java Programming Language – Overview<br>
2. Input/Output Variables & Data types<br>
3. Operators<br>
4. Conditional Statements<br>
5. Loops & Nesting<br>
6. Advanced Patterns Problems<br>
7. Functions (Methods)<br>
8. Binary Number System<br>
9. Bitwise Operators<br>
10. Bit Manipulation
11. Java Collections Framework
12. Object Oriented Programming (OOPs)

# JAVA-Data-Structures-and-Algorithms

## ​Data Structures & Algorithms (DSA) Foundation
Maths Required For Data Structures & Algorithms (DSA)<br>
Time & Space Complexity<br>
### Asymptotic Notation
Big-O Notation<br>
Big-θ Notation<br>
Big-Ω Notation<br>

## Linear Data Structures
### Arrays

### Linked Lists

### Stacks

### Queues

### Strings

## Searching Algorithms

## Sorting Algorithms
Bubble Sort<br>
Merge Sort<br>
Insertion Sort<br>
Quick Sort<br>
Selection Sort<br>
Heap Sort<br>

## Advanced Data Structure (Non-Linear Data Structures)
### Trees

### Graphs

### Sets & Hash Based Structures
HashMap<br>
HashSet<br>

## Important Problem Solving Techniques
Two Pointer Technique<br>
Brute Force<br>
Backtracking<br>
Greedy Algorithms<br>
Randomised Algorithms<br>
Divide & Conquer<br>
Kth Element<br>
Recursion<br>
Dynamic Programming<br>
Sliding Window Technique<br>
Island Traversal<br>
Multi-threaded<br>
two-heaps<br>
Merge Intevals<br>
Cyclic Sort<br>
Fast and Slow Pointers<br>

## Explore Java Libraries
Java Utility Package<br>
Java Collections Framework<br>
Java Streams<br>

## SDE SHEET - A Complete Guide for SDE Preparation
https://www.geeksforgeeks.org/dsa/sde-sheet-a-complete-guide-for-sde-preparation/<br>

<!-- Extras -->
# 375 Questions: Company Wise DSA Sheet
<br>
<!-- Starting  -->

# Starting Of Concepts:
## ☕ Java Programming Language – Overview
📌 Introduction
Java is a high-level, object-oriented programming language known for its platform independence, robustness, and strong security features.
It follows the principle:
“Write Once, Run Anywhere (WORA)”
Java was developed by James Gosling at Sun Microsystems in 1995 (now owned by Oracle).

🚀 Key Features of Java
🔹 Platform Independent
Java programs can run on any system with a Java Virtual Machine (JVM).
🔹 Object-Oriented
Based on concepts like classes, objects, inheritance, polymorphism, etc.
🔹 Secure & Robust
Built-in security features and strong memory management.
🔹 Open Source & Free
Widely accessible with a large developer community.
🔹 Rich Standard Library
Provides extensive APIs for:
Web development
Mobile applications (Android)
Enterprise-level systems

🧠 How Java Works
Java uses a two-step execution process:
High-Level Code → Compiler → Bytecode → JVM → Machine Code
Compiler converts Java code into bytecode
JVM (Java Virtual Machine) executes the bytecode on any platform

💻 High-Level Programming Language
A high-level language is: Easy to read and write , Human-friendly, Abstracted from machine-level complexity & Still powerful enough to control system operations
Examples:Python, Java, C++, JavaScript

🛠️ Requirements to Run Java Programs
Before writing your first Java program, you need:
1️⃣ JDK (Java Development Kit)
Includes:
Compiler
Development tools
Used for writing and compiling Java programs
2️⃣ Code Editor / IDE
Options:
Visual Studio Code (VS Code)
IntelliJ IDEA

🧩 Java Architecture
🔹 JRE (Java Runtime Environment)
Provides environment to run Java programs
Includes:
JVM (Java Virtual Machine)
Libraries
🔹 JVM (Java Virtual Machine)
Executes Java bytecode
Makes Java platform-independent
🔹 JDK (Java Development Kit)
Complete package for development
Includes:
JRE
Development tools (like compiler)

📊 Structure Overview
JDK (Java Development Kit)
│
├── JRE (Java Runtime Environment)
│   ├── JVM (Java Virtual Machine)
│   └── Libraries
│
└── Development Tools (Compiler, Debugger, etc.)

🎯 Summary
Java is a powerful, flexible, and widely-used programming language that enables developers to build applications across multiple platforms using the JVM. Its strong ecosystem, security, and scalability make it a top choice for modern software development.

⚙️ How Java Code Runs
Java follows a two-step execution process:
👉 Compilation → Execution

🧩 1. Compilation Phase
In this phase:
We write source code (.java file)
The code is passed to the Java Compiler (javac)
It gets converted into Bytecode (.class file)
🔑 Key Insight
Java is a portable language because:
Source code is converted into platform-independent bytecode
This bytecode can run on any system that has a JVM (Java Virtual Machine)

⚡ 2. Execution Phase
In this phase:
The Bytecode is executed by:
JVM (Java Virtual Machine)
JRE (Java Runtime Environment)
JVM converts bytecode into native machine code (understandable by the system)

🔄 Java Execution Flow

Source Code (.java)
        ↓
   Compiler (javac)
        ↓
   Bytecode (.class)
        ↓
   JVM (via JRE)
        ↓
   Native Machine Code
        ↓
     Output

🧠 Logic Representation
🔹 Flowchart Concept
In Java—or any programming language, for that matter—a flowchart is a visual representation of the logic, workflow, or algorithm of a program. It acts as a blueprint that developers use to map out how a piece of code will behave before they actually start typing syntax.
​Since Java is an object-oriented language, flowcharts are particularly useful for visualizing control flow (how the program moves from one line to the next) within methods.

🔹 Pseudocode
Pseudocode is a plain-English version of a program's logic. It isn't actual Java code, but it mimics the structure of code using simple language. Think of it as the bridge between a flowchart (the visual) and Java syntax (the technical).
​In pseudocode, you don't worry about semicolons, curly braces, or complex class declarations. You focus entirely on the steps required to solve a problem.

💻 Source Code
Source code refers to the high-level code or assembly code that is generated by a human/programmer. Source code is easy to read and modify. It is written by the programmer by using any High-Level Language or Intermediate language which is human-readable. Source code contains comments that the programmer puts for better understanding. 

Source code is provided to the language translator which converts it into machine-understandable code which is called machine code or object code. The computer can not understand direct source code, the computer understands the machine code and executes it. It is considered as the fundamental component of the computer. In simple, we can say source code is a set of instructions/commands and statements which is written by a programmer by using a computer programming language like C, C++, Java, Python, Assembly language, etc. So the statements written in any programming language is termed as source code.

🖨️ Output in Java
Basic Print Statement
<pre>
System.out.print("Hello World");
</pre>
👉 It auto-generates: System.out.println() 

\n is used to move the output to the next line.

## Input/Output Variables & Data Types
Variable in Java is a data container that stores the data values during Java program execution. Every variable is assigned a data type, which designates the type and quantity of values it can hold. Variable is a memory location name of the data. The Java variables have mainly three types: Local, Instance and Static.

Data Types are divided into two group -

Primitive (store values directly in memory) - byte,short,int,long,float,double,boolean and char
Non-Primitive (Reference types) - String, Arrays, Classes, Object and Interfaces

⚠️ Important Note
Java is a strongly typed programming language, which means:
👉 You must declare the data type of a variable before using it.


## Lifecycle of a Program
In Java, the program lifecycle consists of several distinct phases that work together to execute code. The process begins with developers writing Java source code in .java files using an IDE or text editor. This code is then compiled by the Java compiler (javac) into bytecode stored in .class files, with syntax and type checking performed during compilation. When the program runs, the Java Virtual Machine (JVM) loads these compiled class files into memory through a process involving loading of binary data, linking for verification and preparation, and initialization of class elements. The JVM then verifies the bytecode's security compliance, performs Just-In-Time (JIT) compilation to translate bytecode into native machine code for better performance, and executes the program instructions while managing system resources. Throughout execution, the JVM handles garbage collection by reclaiming memory from unused objects, and finally releases all resources upon program termination. This architecture enables Java's "write once, run anywhere" capability since the bytecode can execute on any device with a compatible JVM.

☕ The Java Life Cycle: From Code to Execution
The journey of a Java program follows the "Write Once, Run Anywhere" (WORA) philosophy, facilitated by the Java Virtual Machine (JVM).
1. Source Code Creation
The process begins with the developer writing human-readable code in a text editor or IDE (like IntelliJ IDEA or Eclipse).
File Extension: The source file must be saved with a .java extension (e.g., Main.java).
2. Compilation (Build Time)
The Java Compiler (javac), included in the JDK, translates the source code into an intermediate format.
Output: A .class file containing Bytecode.
Platform Independence: This bytecode is not specific to any OS, allowing it to run on any device with a compatible JVM.
3. Class Loading & Linking
When the program is run (using the java command), the JVM prepares the code:
Loading: The ClassLoader brings the .class files into memory.
Verification: The Bytecode Verifier checks for security violations or illegal instructions.
Linking: The JVM resolves symbolic references and prepares static variables.
4. Execution (Run Time)
The JVM’s Execution Engine converts the platform-neutral bytecode into machine-specific instructions (binary) for the local CPU.
Interpreter: Reads and executes bytecode line-by-line for a quick start.
Just-In-Time (JIT) Compiler: Identifies "hot" (frequently used) code and compiles it into native machine code to significantly boost performance.
5. Garbage Collection & Termination
Memory Management: The Garbage Collector automatically identifies and removes objects no longer in use to free up heap memory.
Exit: The program terminates once all non-daemon threads finish or a manual exit command (like System.exit()) is called.

## Operators