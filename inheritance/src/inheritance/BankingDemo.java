package inheritance;

public class BankingDemo {
	public static void main (String args[]) {
		SavingAccount sav1= new SavingAccount(3000);
		sav1.deposit(4000);
		System.out.println(sav1.checkBalance());
		sav1.withdraw(2000);
		System.out.println(sav1.checkBalance());
		sav1.withdraw(5000);
		System.out.println(sav1.checkBalance());		
	}

}
