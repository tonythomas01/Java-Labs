/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managebank;

/**
 *
 * @author Tony Thomas
 */
public class Account {
    double accountBalance;

    public Account( double initialBalance ) {
        if ( initialBalance > 0.0 ) {
            accountBalance = initialBalance;
        } else {
            accountBalance = 0.0;
            System.out.println( "Recieved balance < 0 " );
        }
    }
    
    void credit( double amount ) {
        accountBalance += amount;
    }
    
    boolean debit( double amount ) {
        if ( amount < accountBalance ) {
            accountBalance -= amount;
            return true;
        } else {
            System.out.println( "Debit amount exceeded account balance. " );
            return false;
        }
    }
    
    double getBalance() {
        return accountBalance;
    }  
    
}
