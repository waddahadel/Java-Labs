package Lab3;
import java.util.Scanner;;

public class Counter {
    public static void main(String[] args) {
        try(Scanner userinputs = new Scanner(System.in)){
            System.out.println("enter three numbers, one to start with, and another to stop with and another one to define the step");
            
            // we collect the user inputs and store them into variables
            
            int start = userinputs.nextInt();
            int stop = userinputs.nextInt();
            int step = userinputs.nextInt();

            for( int i =  start ; i < stop  ;   i = i + step){
                System.out.println(i);
            }

        }
    }
}
