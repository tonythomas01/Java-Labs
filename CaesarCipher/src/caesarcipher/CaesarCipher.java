package caesarcipher;

import java.util.Scanner;

/**
 *
 */
public class CaesarCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int ans;
        
        System.out.println( "Enter your option: " );
        System.out.println( "\n 1: Encode \n 2: Decode" );
        ans = in.nextInt();
        in.nextLine();
        int shift;
        
        switch( ans ) {
            case 1 :    System.out.println( "Enter the plain text :" );
                        String plainText = in.nextLine();
                        System.out.println( "Enter the shift amount :" );
                        shift = in.nextInt();
                        String encoded = encodeCipher( plainText, shift );
                        System.out.println( " CipherText: " + encoded );
                break;
             case 2 :   System.out.println( "Enter the encoded text :" );
                        String encodedText = in.nextLine();
                        System.out.println( "Enter the shift amount :" );
                        shift = in.nextInt();
                        String decodedText = decodeCipher( encodedText, shift );
                        System.out.println( "The plain text is: " + decodedText );
                 break;
        }
        
      
        
       
        // TODO code application logic here
    }
    
    public static String encodeCipher(String msg, int shift){
    String s = "";    
    int len = msg.length();
    for(int x = 0; x < len; x++){
        char c = (char)(msg.toLowerCase().charAt(x) + shift);
        if (c > 'z')
            s += (char)(msg.charAt(x) - (26-shift));
        else
            s += (char)(msg.charAt(x) + shift);
    }
    return s;   
    }
    
    public static String decodeCipher(String msg, int shift){
    String s = "";    
    int len = msg.length();
    for(int x = 0; x < len; x++){
        char c = (char)(msg.toLowerCase().charAt(x) - shift);
        if (c < 'a')
            s += (char)(msg.charAt(x) + (26-shift));
        else
            s += (char)(msg.charAt(x) - shift);
    }
    return s;
    }
}
