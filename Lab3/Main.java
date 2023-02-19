package Lab3;
// this file is to discuss some of the topics of lab3 like loops and arrays and stuff like that
public class Main {
    public static void main(String[] args) {
        
        // some simple example of a while loop

        int counter = 5;
        while (counter > 0){
            System.out.println("the current counter value is " + counter);
            counter -- ;
        }

        // some simple example of do/while loop
        int i = 0;
        do{
            System.out.println("the current value of i is " + i);
            i++;
        }
        while(i < 5);
    
    
    // a simple example of a for loop, this snippet just prints all the even numbers between-and including- 0 and 20
    for(int n = 0; n <= 20 ;  n = n + 2 ){
        System.out.println(n);
    }

    //some practice with nested loops
    for(int h = 1; h < 3; h++){
        System.out.println("Outer loop iterator value : " + h);
        for(int j = 1 ; j < 4 ; j ++ ){
            System.out.println("Inner loop iterator value : " + j);
        }
    }

    // example of the usage of the break/countinue statement - I did the break on my own , the continue is written
    for(int k = 0 ; k < 10 ; k ++){
    if (k == 3){continue;}
     System.out.println(k);
}}
}
