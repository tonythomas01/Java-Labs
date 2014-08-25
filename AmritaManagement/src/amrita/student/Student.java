/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amrita.student;

import amrita.Person;
import interest.Hobby;
import java.util.Scanner;

/**
 *
 * @author Tony Thomas
 */
public class Student extends Person implements Hobby{
    private Integer sem;
    private String course;
    
    public void setSem( int se ) {
        sem = se;
    }
    
    public void setCourse( String courseName ) {
        course = courseName;
    }
    
    public String toString() {
        String semester = sem.toString();
        String details = "Student is studying for "+ course + " in "+ semester +" Semester";
        return details;
    }
    @Override
    public void myFav() {
        for( int i = 0; i<hobbies.length; i++ ) {
            System.out.println( hobbies[i] );
        }     
    }
    
    @Override
    public void goodAt() {
        System.out.println( " Enter 3 talents :");
        Scanner in = new Scanner( System.in );
        for ( int i = 0; i < 3 ; i++ ) {
            String hob = in.nextLine();
            hobbies[i] = hob;
        }
    }
    
   
}
