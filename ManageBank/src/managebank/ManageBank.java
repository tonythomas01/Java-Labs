package managebank;

/**
 *
 * @author Tony Thomas <01tonythomas@gmail.com>
 * @lisence GPLv2.0+ 
 */
public class ManageBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(5000, 10.0 );
        System.out.println( " The balance in the savings A/C is " + s1.getBalance() );
        s1.credit(1000);
        System.out.println( " The new balance in the savings A/C is " + s1.getBalance() );
        s1.debit(500);
        System.out.println( " The new balance in the savings A/C is " + s1.getBalance() );
        
        CheckingAccount c1 = new CheckingAccount( 3000, 10 );
        System.out.println( " The balance in the checkings A/C is " + c1.getBalance() );
        c1.credit(1000);
        System.out.println( " The new balance in the checkings A/C is " + c1.getBalance() );
        c1.debit( 350 );
        System.out.println( " The new balance in the checkings A/C is " + c1.getBalance() );
  
    }
}
