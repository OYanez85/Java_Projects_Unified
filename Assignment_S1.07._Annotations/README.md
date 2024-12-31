# Assignment_S1.07._Annotations

Assignment_S1.05._Java_Utils

This project contains several exercises involving Java annotations, including creating custom annotations, overriding methods, and using external libraries for JSON serialization. The project has been developed and run using Debian Linux commands.

Project Structure

The project is divided into three levels, each containing exercises. Each level demonstrates the use of annotations in Java:

Assignment_S1.07._Annotations/

├── level_1

│   ├── Exercise_1

│   └── Exercise_2

├── level_2

│   └── Exercise_1

└── level_3

    └── Exercise_1
    
Exercises Overview

Level 1

Exercise 1: Involves creating a hierarchy of workers (Worker, OnlineWorker, InPersonWorker) and demonstrating method overriding with the @Override annotation.

Exercise 2: Adds deprecated methods using @Deprecated and demonstrates the use of @SuppressWarnings to suppress deprecation warnings.

Level 2

Exercise 1: Implements a custom annotation @JsonSerializable for serializing objects into JSON files. Utilizes the external org.json library to handle JSON serialization.

Level 3
Exercise 1: Expands upon the custom annotation from Level 2 and demonstrates runtime annotation processing using Java Reflection.
Prerequisites

To compile and run this project, you will need:

Java Development Kit (JDK) 8 or higher
The json-20210307.jar library for JSON handling in Level 2 and Level 3. You can download it from here.

How to Run the Exercises
This project was developed using Debian Linux commands. Below are the steps to compile and run each exercise:

Level 1: Exercise 1

Navigate to the directory:

cd ~/Assignment_S1.07._Annotations/level_1/Exercise_1

Compile all the Java files:

javac *.java

Run the MainClass:

java MainClass

Level 1: Exercise 2

Navigate to the directory:

cd ~/Assignment_S1.07._Annotations/level_1/Exercise_2

Compile all the Java files:

javac *.java

Run the MainClass:

java MainClass

Level 2: Exercise 1

Navigate to the directory:

cd ~/Assignment_S1.07._Annotations/level_2/Exercise_1

Ensure the json-20210307.jar library is in the lib/ directory:

ls lib/
Compile the Java files with the library:

javac -cp .:lib/json-20210307.jar *.java
Run the MainClass:

java -cp .:lib/json-20210307.jar MainClass

Level 3: Exercise 1

Navigate to the directory:

cd ~/Assignment_S1.07._Annotations/level_3/Exercise_1

Ensure the json-20210307.jar library is in the lib/ directory:

ls lib/

Compile the Java files with the library:

javac -cp .:lib/json-20210307.jar *.java

Run the MainClass:

java -cp .:lib/json-20210307.jar MainClass

License

This project is licensed under the Creative Commons License.
