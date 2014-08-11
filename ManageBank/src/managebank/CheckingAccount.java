package managebank;

/**
 *
 * @author Tony Thomas
 */
public class CheckingAccount extends Account {
    public double feePerTransaction;
    
    public CheckingAccount(double initialBalance, double transactionFee ) {
        super(initialBalance);
        feePerTransaction = transactionFee;
    }
    
    public void credit( double amount ) {
       super.credit( amount - feePerTransaction );      
    }
    
    public boolean debit( double amount ){
        if ( super.accountBalance > amount + feePerTransaction ) {
            if ( super.debit( amount ) ) {
                super.accountBalance-= feePerTransaction;
            }
            return true;
        } else {
            return false;
        }
       
    }
    
       
}
