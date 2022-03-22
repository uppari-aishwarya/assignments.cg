package inheritance;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//import java.util.TreeSet;

public class BankingDemo {
	public static void main (String args[]) {
		SavingAccount sav1= new SavingAccount(3000);

		sav1.deposit(4000);
		System.out.println(sav1.checkBalance());
		sav1.withdraw(2000);
		System.out.println(sav1.checkBalance());
		SavingAccount sav2= new SavingAccount(5000);
		sav2.deposit(4000);
		System.out.println(sav2.checkBalance());
		sav2.withdraw(3000);
		System.out.println(sav2.checkBalance());
		SavingAccount sav3= new SavingAccount(10000);
		sav3.deposit(1000);
		System.out.println(sav3.checkBalance());
		sav3.withdraw(9000);
		System.out.println(sav3.checkBalance());
		Set<SavingAccount> allSavingAccounts=new HashSet<SavingAccount>();
        allSavingAccounts.add(sav1);
		allSavingAccounts.add(sav2);
		allSavingAccounts.add(sav3);
Iterator<SavingAccount> it = allSavingAccounts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().checkBalance());

		}
		
	}

}
