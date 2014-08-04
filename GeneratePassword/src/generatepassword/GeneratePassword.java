
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
        int studAge = in.nextInt();
        generatePassword( studName, studAge );
        // TODO code application logic here
    }
    
    public static void generatePassword( String studName, int studAge ) {
        char delim = '_';
        StringBuilder pass = new StringBuilder();
        String[] contents = studName.split( " " );
        for( int i = 0; i < contents.length; i++ ) {
            char a = contents[i].charAt(0);      
            pass.append(a);
        }

        pass.append( delim );
        for ( int j = 1; j< contents[0].length(); j++ ) {
            char c = contents[0].charAt(j);
            pass.append( c );
        }    
        pass.append( delim );
        pass.append( studAge );        
        String npass = pass.toString().toLowerCase();
        System.out.println( npass );
    }
}
