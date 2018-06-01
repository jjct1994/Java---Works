
package oddeven;

/** 
 * @author Jossue Cervantes Torres
 * INSY 4305 -002
 * OddEven.java
 */
import java.util.Scanner;


//Program to Determine if integer is odd or even
public class OddEven{

    public static void main(String[] args)
    {
        
//Variables
        int integer;
        int remainder;
        Scanner input = new Scanner(System.in);
        
        
//Program Title
        System.out.println("Program to determine if intiger is Odd or Even.");
       
     
//Call for int       
        System.out.println("Enter Integer:");
//Input of int        
        integer = input.nextInt();
        
        remainder = integer%2;
//If else to determin even odd        
        if (remainder != 0)
        {
            System.out.println("The number " + integer + " is an ODD integer.");
        }
        else if (remainder == 0)
        {
            System.out.println("The number " + integer + " is an EVEN integer.");
        }
       
}
}
