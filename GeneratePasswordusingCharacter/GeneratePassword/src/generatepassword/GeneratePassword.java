
package generatepassword;

import java.util.Scanner;

/**
 * Class to generate password of a given form. 
 * eg: input = Isaac Jackson Edwin.
 * pass =ije_saac_19 
 * 
 * @author Tony Thomas <01tonythomas@gmail.com> 
 */
public class GeneratePassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        
        System.out.println( "Enter the name of the person :" );
        String studName = in.nextLine();
        System.out.println( "Enter the age of the person :" );
        Integer studAge = in.nextInt();
        generatePassword( studName, studAge );
        // TODO code application logic here
    }
    
    public static void generatePassword( String studName, Integer studAge ) {
        Character delim = '_';

        String pass = new String();
        String[] contents = studName.split( " " );
        for( int i = 0; i < contents.length; i++ ) {
            Character a = contents[i].charAt(0);             
            pass = pass.concat( a.toString() );
        }

        pass = pass.concat( delim.toString() );
        for ( int j = 1; j< contents[0].length(); j++ ) {
            Character c= contents[0].charAt(j);
            pass = pass.concat( c.toString() );
        }    
        pass = pass.concat( delim.toString() );
        pass = pass.concat( studAge.toString()  );
        
        System.out.println( pass.toLowerCase() );
    }
}
