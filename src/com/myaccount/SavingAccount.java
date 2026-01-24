package com.myaccount;

public class SavingAccount extends Account {

	public SavingAccount() {
	}

	public SavingAccount(String accountHolderName, int accbalance) {
		super(accountHolderName, accbalance);
	}

	@Override
	public void deposit(int amount) {
		if (amount > 0) {
			int accbalance = getAccbalance();
			accbalance = accbalance + amount;
			setAccbalance(accbalance);
			System.out.println("Rupees:" + amount + " Deposited Successfully...");
		} else {
			throw new InvalidAmountException();
		}

	}

	@Override
	public void withdraw(int amount) {
		if (amount <= getAccbalance() && amount>0) {
			int accbalance = getAccbalance();
			accbalance = accbalance - amount;
			setAccbalance(accbalance);
			System.out.println("Rupees :" + amount + " WithDrawn Successfully");
		} else {
			throw new InSufficentBalanceExcepti();
		}

	}

	@Override
	public int showBalance() {
		return getAccbalance();
	}

	@Override
	public int calculateInterest() {
		return getAccbalance() * 2;
	}

	public void displaySavingAccount() {
		System.out.println("AccountNo:" + getAccountNo());
		System.out.println("AccountHolderName:" + getAccountHolderName());
		System.out.println("AccountBalance:" + getAccbalance());
		System.out.println("Interest:" + calculateInterest());
		System.out.println("--------------------------------------");
	}

	public SavingAccount getAccountDetails() {
		return new SavingAccount();
	}

}

