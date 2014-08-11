/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managebank;

/**
 *
 * @author Tony Thomas
 */
public class SavingsAccount extends Account {
    double interestRate;
    
    public SavingsAccount(double initialBalance, double interestRate ) {  
        super(initialBalance);
        interestRate = interestRate;
    }
    
    public double calculateInterest() {
        double calculatedInterest = super.accountBalance*interestRate;
        return calculatedInterest;     
    }
       
}
