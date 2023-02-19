package Lab2;
// this is just some simple implementation of methods in java
public class Main {
    static void myMethod(){
        System.out.println("Hello World!");
    }
    
    // an implementation with another method but this one has parameters
    static void methodWithParameters(String person, int age){
        System.out.println(person + " is " + age + " years old");
    }

    static int addition(int x, int y){
        return x + y;
    }

    // this method uses some of the predefined function of java to calculate the length of the third vertics of a triangle given the length of the other two vertices by the pythagreon theorem 
    static int pythagreon(int vertics1,int vertics2){
        return (int) Math.sqrt( (Math.pow(vertics1, 2) + Math.pow(vertics2, 2)));
    }

    //we call our defined methods in the following lines 
    public static void main(String[] args) {
        myMethod();
        methodWithParameters("Philip", 22);
        int result = addition(5,7);
        System.out.println(result);
        int vertics3 = pythagreon(4, 3);
        System.out.println(vertics3);
    }
}