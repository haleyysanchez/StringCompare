
/**
 * Gets 2 strings and uses methods to display data to user.
 *
 * @author Haley Sanchez
 * @version 10/7/18
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class StringCompareViewer extends StringCompare

    {   public static void main(String[] args)   
       {   
        
        //gets original string through an inout dialog window
        String originalString = JOptionPane.showInputDialog("Input a string");
        //gets string2 from another input dialog window
        String string2 = JOptionPane.showInputDialog("Input another string");
        //new added part to construct an object
        StringCompare v = new StringCompare(originalString, string2);
        System.out.println(v.getValue());
        System.out.println(v.getLength());
        System.out.println(v.getOccur());
        //System.out.println(v.getEquals());
        //System.out.println(v.findW());
        
        
        //prints the values of the strings
        /*System.out.println("originalString value is: " + originalString);
        System.out.println("string2 value is: " + string2);
        //prints the lengths of the strings
        System.out.println("Length of originalString is: " + originalString.length());
        System.out.println("Length of string2 is: " + string2.length());
        //finds and prints out the number of occurances of string 2 in originalString
        System.out.println("first  occurance of string2 in originalString is at the index: " +  originalString.indexOf(string2));
        //determines if the strings are equal and prints out a string accordingly
        */
        boolean compare = originalString.equals(string2);
        if (compare == true)
        {
            System.out.println("The strings are equal.");
        }
        else 
        {
            System.out.println("The strings are not equal.");
        }
        //finds the 1st space in originalString
        //int firstw = 0;
        if (originalString.indexOf(" ") > 0)
        {
            int firstw = originalString.indexOf(" ");
            System.out.println("The first word in originalString is: " + originalString.substring(0,firstw));
        }
        else
        {
            System.out.println("The first word in originalString is: " + originalString);
        }
        //prints the first word that is seperated by a space
        //System.out.println("The first word in originalString is: " + originalString.substring(0,firstw));
        //extra credit part 1
        //determines number of words in originalString
        int y = 1;
        String space = " ";
        int num = originalString.indexOf(space,0);
        while (num >= 0)
        {  y = y + 1;
           num = originalString.indexOf(space, num + space.length());
        
        }
        //prints number of words in originalString
        System.out.println("The number of words in originalString is: " + y);
        
        //extra credit part 2
        //determines the number of occurances of string2 in originalString
        int x = 0;
        int number = originalString.indexOf(string2,0);
        while (number >= 0)
        {  x = x + 1;
           number = originalString.indexOf(string2, number + string2.length());
           
        }
        //prints out numnber of occurance of string2 in originalString
        System.out.println("Number of occurances of string2 in originalString is: "+ x);
    
     }
}
