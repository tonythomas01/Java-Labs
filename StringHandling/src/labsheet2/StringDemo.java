/**
 * Class to show various string handling functions
 */
package labsheet2;

import java.util.Scanner;

/**
 @author Tony Thomas <01tonythomas@gmail.com>
 */
public class StringDemo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Hello world ");
        String string1, string2;
        System.out.println("Enter the first string ");
        Scanner in = new Scanner( System.in );
        string1 = in.nextLine();
        System.out.println("Enter the second string ");
        string2 = in.nextLine();
        if ( compareStrings(string1, string2) ) {
            System.out.println( "The strings are equal ");
        } else {
            System.out.println( "The strings are unequal " );
        }
        System.out.println( "The length of "+string1 +"is: "+ lengthOfString(string1) );
        System.out.println( "The length of "+string2 +"is: "+ lengthOfString(string2) );
        
        /*To find the number of words */
        int numOfWords1 = countWords( string1 );
        int numOfWords2 = countWords( string2 );
        System.out.println( " The number of words in string 1 is " + numOfWords1 );
        System.out.println( " The number of words in string 2 is " + numOfWords2 );
        
        /*To convert string to Uppercaes */
        System.out.println( " The Uppercased string is :"+ convertToUpperCase(string1 ));
        System.out.println( " The Uppercased string is :"+ convertToUpperCase(string2 ));
        
        /*To find the occurence of a pattern */
        System.out.println( " Enter the regex to search in string:" );
        String regex = in.nextLine();
        if ( checkPatternExists( string1, regex) ) {
            System.out.println( "The pattern exists in the string" );
        }
        
        /*Replace a character */
        String rep, newchar;
        System.out.println( " Enter the character to be replaced :" );
        rep = in.nextLine();
        
        System.out.println( " Enter the character to replace it to :" );
        newchar = in.nextLine();
        
        System.out.println(" The converted string is :"+  string1.replace( rep, newchar) );
        
        /* Start With or end with */
        String prefix, sufix;
        System.out.println( " Enter the prefix to check to :" );
        prefix = in.nextLine();
        System.out.println( " Enter the suffix to check to :" );
        sufix = in.nextLine();
       
        if ( string1.startsWith(prefix) ) {
            System.out.println( " It starts with "+prefix );
        }
        if ( string1.endsWith(sufix) ) {
            System.out.println( "It ends with " + sufix );
        }
        
        // TODO code application logic here
    }
    public static boolean compareStrings( String s1, String s2 ) {
        if( s1.equals(s2) ) {
            return true;
        } else {
            return false;
        }
    }
    
    public static int lengthOfString( String s1 ) {
        return s1.length();
    }
    
    public static int countWords( String s1 ) {
        String[] splittedString = s1.split(" ");
        return splittedString.length;
    }
    
    public static String convertToUpperCase( String s1 ) {
        return s1.toUpperCase();
    }
    
    public static boolean checkPatternExists( String s1, String exp ) {
        if( s1.contains(exp) ) {
            return true;
        } else {
            return false;
        }
    }
}
