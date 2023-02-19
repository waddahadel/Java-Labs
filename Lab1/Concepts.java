package Lab1;


// this file covers almost every topic mentioned in Lab 1

public class Concepts{
    public static void main(String[] args) {
       //declaring variables and performing some operations
       int x = 20;
       int y = 15;
       int z = x + y;
       float price =  2.99f;
       System.out.println(z + 5);

       // some simple typeCasting
       int floattoint = (int) price;
       System.out.println(floattoint);

       //simple if statements
       int grade = 90;
       if (grade >= 90){
        System.out.println("A+");
       }
       else{
        System.out.println("Not A+");
       }

       // simple switch statement
       int month = 1;
       switch(month){
        case 1:
        System.out.println("The year has just started");
        break;
        case 12:
        System.out.println("The year is drawing to a close");
        break;
        default:
        System.out.println("Some month of the year");
       }
       
    }
}

      