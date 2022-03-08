package inheritance;

public class CurrentAccount extends AccountType{
	CurrentAccount(double initialbalance){
    	this.initialbalance=initialbalance;
    	this.totalbalance=initialbalance;
}
}