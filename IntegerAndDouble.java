import java.util.Scanner;
/**
 * Using the scanner, by inputing numbers, it calculates the output the way we want it.
 *
 * @author Umasathvik Pantham
 * @version 02/27/21
 */
public class IntegerAndDouble
{
    public static void main(String[] args)
    {
        //Declare a Scanner object to read input from the keyboard
        Scanner in = new Scanner(System.in);
        
        //Ask the user to enter an integer using prompt "Enter an integer: " 
        System.out.print("Enter an integer: ");
        
        //Get the integer and store it in an integer variable
        int intNum = in.nextInt();
        
        //Print the integer on a new line
        System.out.println("The integer number is " + intNum + ".");
        
        //Ask the user to enter a double number using prompt "Enter a double number: " 
        System.out.print("Enter a double number: ");
        
        //Get the double number and store it in a double variable
        double doubleNum = in.nextDouble();
        
        //Print the double number on a new line 
        System.out.println("The double number is " + doubleNum + ".");
        
        //Calculate and display the square root of the double number
        System.out.println("The square root of the double number is " + Math.sqrt(doubleNum) + ".");
        
        //Get the integer part of the double number and store it in an integer variable
        int intNum2 = (int)doubleNum;
        
        //Display the integer part of the double number on a new line
        System.out.println("The integer part of the double number is " + intNum2 + ".");
        
        //Calculate and display the quotient of the integer number divided by the double number
        System.out.println("The quotient of the integer number divided by the double number is " 
                            + (intNum / doubleNum) + ".");
                            
        //Calculate and display the double quotient of the integer number divided by the integer 
        //part of the double number
        System.out.println("The double quotient of the integer number divided by the integer part of the double number is "
                            + ((double)intNum / intNum2) + ".");
                            
        //Calculate and display the integer quotient of the integer number divided by the integer 
        //part of the double number
        System.out.println("The integer quotient of the integer number divided by the integer part of the double number is "
                            + (intNum / intNum2) + ".");
                            
        //Calculate and display the remainder of the integer number divided by the integer part of
        //the double number
        System.out.println("The remainder of the integer number divided by the integer part of the double number is "
                            + (intNum % intNum2) + ".");
                            
    }
}
