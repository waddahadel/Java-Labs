package Lab1;
import java.util.Scanner;

// this file focuses on how to implement the user input in java

class Main{
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter your Name, Age and Salary");
            
            // some string input, in this case it should be the name of the user
            String name = myObj.nextLine();

            //Numerical input, in this case it's the user's age and salary
            int age = myObj.nextInt();
            double salary = myObj.nextDouble();

            // in the follwing lines we just output the inputs that are collected above from the user
            System.out.println( "your name is " + name);
            System.out.println("your age is " + age);
            System.out.println("your salary is " + salary);
        }
    }
}