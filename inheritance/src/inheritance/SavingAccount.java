package inheritance;
public class SavingAccount extends AccountType {
	// double initialbalance;
	//double totalbalance;
   final double rateofintrest=5;
    SavingAccount(double initialbalance){
    	this.initialbalance=initialbalance;
    	this.totalbalance=initialbalance;
    	
    }
}
