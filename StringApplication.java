import java.util.Scanner;
/**
 * With the Scanner, when inputing Strings, the output we want is given.
 *
 * @author Umasathvik Pantham
 * @version 02/27/2021
 */
public class StringApplication
{
    public static void main(String[] args)
    {
        //Declare a Scanner object to read input from the keyboard
        Scanner in = new Scanner(System.in);
        
        //Ask the user to enter a book title using prompt "Enter a book title: "
        System.out.print("Enter a book title: ");
        
        //Read in the book title
        String line = in.nextLine();
        line = line.trim();
        
        //Print the first character of the book title within single quotes.
        System.out.println("The first character is " + "'" + line.charAt(0) + "'" + ".");
        
        //Print the first word of the book title within double quotes.
        int firstPos = line.indexOf(" ");
        int lastPos = line.lastIndexOf("");
        System.out.println("The first word is \"" + line.substring(0, firstPos) + "\"" + ".");
        
        //Print the rest of the book title without the space after the first word within double quotes
        System.out.println("The rest of title is \"" + line.substring(firstPos + 1, lastPos) + "\"" + ".");
        
        //Ask the user to enter the starting position for a substring
        System.out.print("Enter the starting position for a substring: ");
        
        //Read in the starting position and store it in an integer variable
        int pos = in.nextInt();
        
        //Ask the user to enter the length for the substring 
        System.out.print("Enter the length for the substring: ");
        
        //Read in the length and store it in an integer variable
        int length = in.nextInt();
        
        //Print the substring of the book title specified by the starting position and the length within
        //double quotes
        System.out.print("The " + length + "-char substring starting at index " + pos + " is \"" + line.substring(pos, length + pos) + "\"" + ".");
    }
}
