
/**
 * Gets 2 strings and uses methods to display data to user.
 *
 * @author Haley Sanchez
 * @version 10/7/18
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class StringCompare

{
    private String originalString;
    private String string2;
    private String x;
    private String w;
    public StringCompare()
    {
        originalString = "";
        string2 = "";
    }
    public  StringCompare(String a, String b)
    {
        originalString = a;
        string2 = b;
    }
    public String getValue()
    {
        return "originalstring: " + originalString + "\n" + "string2: " + string2;
    }
    public String getLength()
    {
        return "Length of originalString: " + originalString.length() + "\n" + "Length of string2: " + string2.length();
    }
    public String getOccur()
    {
        return "first  occurance of string2 in originalString is at the index: " +  originalString.indexOf(string2);
    }
    //next two had toruble implementing, would get null values
    public String getEquals()
    {
        boolean compare = originalString.equals(string2);
        if (compare == true)
        {
        String x = "The strings are equal.";
        }
        else 
        {
        String x = "The strings are not equal.";
        } 
        return x;
    }
    public String findW()
    {
        int firstw = 0;
        if (originalString.indexOf(" ") > 0)
        {
            firstw = originalString.indexOf(" ");
            String w = "The first word in originalString is: " + originalString.substring(0,firstw);
        }
        else
        {
            String w = "The first word in originalString is: " + originalString;
        }
        return w;
    }
}
