package inheritance;

public class AccountType implements account {
	double totalbalance;
	double initialbalance;
	double rateofintrest=5;

	@Override
public void deposit(double amount) {
		// TODO Auto-generated method stub
		totalbalance=(totalbalance+amount);
		
	}

	@Override
public void withdraw(double amount) {

		// TODO Auto-generated method stub
		if(amount<=totalbalance) {
			totalbalance=(totalbalance-amount);
			}
			else {
				
				System.out.println("the amount is not sufficient");
			}
			
		
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return totalbalance;
	}

		
	}

