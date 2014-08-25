/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amrita.employee;

import amrita.Person;
import interest.Hobby;
import interest.*;

/**
 *
 * @author Tony Thomas
 */
public class Teaching extends Person implements Hobby{
    private String designation;
    private String subject;
    
    public void setDesignation( String desig ) {
        designation = desig;
    }
   
    public String toString() {
        String TeachDetails = "Teacher with designation "+ designation +" teaching "+ subject;
        return TeachDetails;
    }
    
    public void setSubject( String sub ) {
        subject = sub;
    }
    
    @Override
    public void myFav() {
        System.out.println( "Enter your favourite hobbies " );
        
        
        
    }
    
    @Override
    public void goodAt() {
        
    }
    
    

}
