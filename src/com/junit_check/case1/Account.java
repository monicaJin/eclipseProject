package com.junit_check.case1;

public class Account {

	protected int balance;

	public int balance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}

}
