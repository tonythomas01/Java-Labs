/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import amrita.employee.Teaching;
import amrita.student.Student;

/**
 *
 * @author Tony Thomas
 */
public class AmritaManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setSem(5);
        s1.setCourse("CSE");
        String stud = s1.toString();
        System.out.println( stud );
        s1.goodAt();
        s1.myFav();
        
        Teaching t1 = new Teaching();
        t1.setDesignation("HOD");
        t1.setSubject("Maths");
        String teach1 = t1.toString();
        System.out.println( teach1 );
        
        // TODO code application logic here
    }
}
