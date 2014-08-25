/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package package3;
import package2.Evaluation;

/**
 *
 * @author Tony Thomas
 */
public class Student implements Evaluation {
    String Name;
    int Id;
    double marksHomeAssignmet;
    double marksClassTests;
    double marksPeriodicals;
    double marksEndSem;

    @Override
    public double evaluate() {
        double marksCT = marksClassTests*ClassTestsWeightage;
        double marksES = marksEndSem*endSemWeightage;
        double marksHS = marksHomeAssignmet*HomeAssignmentsWeightage;
        double marksP = marksPeriodicals*PeriodicalsWeightage;
        return (marksCT+marksES+marksHS+marksP )/100;    
    }

    
    public void setName( String name ) {
        Name = name;
    }
    
    public void setId( int id ) {
        Id = id;
    }
    
    public void enterMarks( int w, int x, int y, int z ) {
        marksHomeAssignmet = w;
        marksClassTests = x;
        marksPeriodicals = y;
        marksEndSem = z;
    }
  
}
