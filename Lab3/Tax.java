package Lab3;



public class Tax {
    public static void main(String[] args) {
        double[] originalprice = {1.99 , 2.99};
        double afterTax[] = new double[originalprice.length];
        
        // a loop to store the new values of the aftertax array
        for(int i = 0 ; i < originalprice.length ; i++){
            afterTax[i] = originalprice[i]*1.13;
        
        }

        // a loop to simply display the original prices and the prices after taxes

        for(int j = 0 ; j < afterTax.length ; j ++){
            System.out.println("The price of item " + (j + 1) +  "  before taxes is " + originalprice[j] + " and the price after taxes is " + afterTax[j]) ;
        }


    }
}
