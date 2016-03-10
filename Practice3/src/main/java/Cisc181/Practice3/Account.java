package Cisc181.Practice3;

import java.sql.Date;
import Cisc181.Exceptions.*;

public class Account {
	private int id;
	private double balance;
	private double annualInterest;
	private Date dateCreated;

	public Account() {
		id = 0;
		balance = 0;
		annualInterest = 0;
	}

	public Account(int id, double balance, double annualInterest) {
		this.id = id;
		this.balance = balance;
		this.annualInterest = annualInterest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterest() {
		return annualInterest;
	}

	public void setAnnualInterest(double annualInterest) {
		this.annualInterest = annualInterest;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void widthdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException(amount);
		} else {
			balance -= amount;
		}
	}

}
