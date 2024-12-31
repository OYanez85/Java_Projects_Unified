Assignment_S1.06._Generics

📄 Description
This project demonstrates the use of Java generics through a series of exercises organized into three levels (Level 1, Level 2, and Level 3). The exercises focus on key concepts such as generic methods, variable arguments, type restrictions, and the use of interfaces. The goal of this project is to strengthen understanding of generics in Java and apply object-oriented programming principles. The code was developed and tested on Debian Linux.

💻 Technologies Used
Java SE Development Kit (JDK): Version 8 or higher
Debian Linux: For development and execution of the Java code
Git/GitHub: For version control and repository management
Logger: Used in some exercises for output

📋 Requirements
Java SE Development Kit (JDK): Version 8 or higher installed on your local machine
Git: To clone the repository and manage version control
Logger: Available by default in Java for handling output in certain exercises

🛠️ Installation
Clone the repository:

git clone https://github.com/OYanez85/Assignment_S1.06._Generics.git

▶️ Execution
After cloning the repository, navigate to the appropriate exercise folder and compile/run the Java files using the following commands.

Level 1
Exercise 1:

cd level_1/Exercise_1
javac NoGenericMethods.java
java NoGenericMethods

Exercise 2:

cd level_1/Exercise_2
javac GenericMethods_1.java Persona.java
java GenericMethods_1

Level 2
Exercise 1:

cd level_2/Exercise_1
javac GenericMethodsModified.java Persona.java
java GenericMethodsModified

Exercise 2:

cd level_2/Exercise_2
javac VarArgsMethods.java Persona.java
java VarArgsMethods

Level 3
Exercise 1:

cd level_3/Exercise_1
javac Generica.java Principal.java Smartphone.java Telefon.java

java Principal

🌐 Deployment
This is a locally executed Java project, and no server deployment is required. The project can be packaged using tools like Maven or Gradle to distribute it as a JAR file if needed.

🤝 Contributions
You can contribute to this project by forking the repository on GitHub and making any necessary changes. Follow the steps below:

Fork the repository on GitHub.
Clone the forked repository:

git clone https://github.com/YOUR-USERNAME/Assignment_S1.06._Generics.git

Create a new branch for your changes:

git checkout -b feature/your-feature-name
Make your changes and commit them:

git add .
git commit -m "Your commit message"
Push the branch to your forked repository:

git push origin feature/your-feature-name

Open a pull request to merge your changes into the main repository.

📋 Level 1 Exercises

Exercise 1: NoGenericMethods

File: NoGenericMethods.java

Description: A class NoGenericMethods stores three arguments of the same type. The class provides methods to store and extract the objects. The code demonstrates that the arguments can be passed in any order in the constructor.

Exercise 2: Generic Methods

Files: GenericMethods_1.java, Persona.java

Description: A generic method in GenericMethods_1 accepts three different types of arguments and prints them. The Persona class represents a person and is passed as one of the generic arguments.

📋 Level 2 Exercises

Exercise 1: Generic Method with a Non-Generic Argument

Files: GenericMethodsModified.java, Persona.java

Description: This exercise modifies the generic method to include one non-generic argument. The method prints three arguments, one of which is non-generic.

Exercise 2: Generic Method with Variable Arguments

Files: VarArgsMethods.java, Persona.java

Description: Implements a generic method using Java’s varargs feature to handle an unspecified number of arguments. It demonstrates how to iterate through the variable arguments using a logger.

📋 Level 3 Exercises

Exercise 1: Interface and Generic Class

Files: Generica.java, Principal.java, Smartphone.java, Telefon.java

Description: A generic class Generica defines two methods. One accepts an argument limited by the Telefon interface, and the other by the Smartphone class. The Principal class demonstrates both methods by creating a Smartphone object and calling the makeCall() and takePhoto() methods.

📄 GitHub Repository
The complete project is hosted at the following GitHub repository: https://github.com/OYanez85/Assignment_S1.06._Generics.git

To push the project to your GitHub repository, follow these steps:

git add .
git commit -m "Add all exercises for Assignment S1.06 Generics"
git push -u origin main
