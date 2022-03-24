package com.demo.samples.day5.exception;

public class AccountBalanceException extends Exception {
	private float accountBalance;

	public AccountBalanceException(float f) {
		super();
		this.accountBalance = f;
	}

	public AccountBalanceException(String message) {
		super(message);
	}

	public float getAccountBalance() {
		return accountBalance;
	}
}
