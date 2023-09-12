package OopsPrograms;

import java.util.ArrayList;
import java.util.List;

class Bank{

	private List accounts;

	public  void bank() {
		accounts = new ArrayList<>();
	}
	
	public void addaccount(Account account) {
		accounts.add(account);
	}
}

interface Account{
	void deposit(double Amt);
	void withDraw(double Amt);
	double getBalance();
}

class SavingAccont implements Account{

	private double balance;
	private double interestRate;
	
	SavingAccont(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
		
	}
	
	@Override
	public void deposit(double Amt) {
		balance+= Amt;
	}

	@Override
	public void withDraw(double Amt) {
		balance-= Amt;
	}

	@Override
	public double getBalance() {
		return balance;
	}
	
	public void interest() {
		 balance += balance * interestRate/100;
	}

}

class CurrentAccount implements Account{

	private double balance;
	private double overdraftLimit;
	
	CurrentAccount(double balance, double overdraftLimit){
		this.balance = balance;
		this.overdraftLimit = overdraftLimit;
		
	}
	
	@Override
	public void deposit(double Amt) {
		balance+=Amt;
		
	}
	@Override
	public void withDraw(double Amt) {
		if(balance+overdraftLimit>=Amt) {
			balance-=Amt;
		}
	}
	@Override
	public double getBalance() {
		return balance;
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

public class DemoBankApp {

	public static void main(String[] args) {

	}

}
