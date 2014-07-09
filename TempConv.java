import java.util.Scanner; //To get user input from the command line

public class TempConv {
    /** 
     * Converts a temperature in degrees
     * fahrenheit to the equivalent in
     * degrees celsius
     */
    public static void main(String[] args) {
        Double fahr; //Temperature in fahrenheit will have a type Double
        Double cel; //same for the temperature in celsius
        Scanner input; //Command line input is of type Scanner
        
        input = new Scanner(System.in);
        System.out.println("Enter the temperature in F: ");

        /* if the user input is not a number I directly 
         * return a message to tell the user to enter a number*/
        if (input.hasNextDouble()) {
            fahr = input.nextDouble();
            
            cel = (fahr - 32) * 5.0 / 9.0;
            System.out.println("Temperature in C is: " + cel);
            
            System.exit(0);
        } else {
            System.out.println("Please enter a number");
        }
    }

}
