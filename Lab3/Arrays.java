package Lab3;
// this file focuses on array implementation and manipulation methods in java
public class Arrays {
    public static void main(String[] args) {
        String[] Clubs = {"madrid" , "barcelona" ,"milan", "chelsea"};
        System.out.println(Clubs[1]);
        Clubs[0] = "manchester";
        System.out.println(Clubs[0]);
        // looping through the elements of the array
        for(int i = 0 ; i < Clubs.length ; i++){
            System.out.println(Clubs[i]);
        }

        //two dimensional array implementation with a function to loop thrrough it

        int[][] NumbersArray = { {1,2,3,4}  , {5,6,7,8}   };
        for(int j = 0; j < NumbersArray.length; j++){
            for(int k = 0 ; k < NumbersArray[j].length ; k ++){
                System.out.println(NumbersArray[j][k]);
            }
        }

    }
}
