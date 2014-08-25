/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amrita.employee;

import amrita.Person;

/**
 *
 * @author Tony Thomas
 */
public class NonTeaching extends Person {
    private Integer salary;
    private String dept;
    
    public void setSalary( int sal ) {
        salary = sal;
    }
    public void setDept( String dep ) {
        dept = dep;
    }

}
