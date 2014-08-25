/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package3;

/**
 *
 * @author Tony Thomas
 */
public class DemoClass {
    
    public static void main( String[] args ) {
        Student s1 = new Student();
        s1.setName( "Tony" );
        s1.setId( 12 );
        s1.enterMarks(90, 80, 95, 99);
        double totalMark = s1.evaluate();
        System.out.println( "The total mark of student is :" + totalMark );
    }
    
}
