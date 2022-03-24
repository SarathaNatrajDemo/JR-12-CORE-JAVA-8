package com.demo.samples.day5.exception;

public class AccountInsufficientException extends Exception {
		private float accountBalance;

		public AccountInsufficientException(float f) {
			super();
			this.accountBalance = f;
		}

		public AccountInsufficientException(String message) {
			super(message);
		}

		public float getAccountBalance() {
			return accountBalance;
		}
}
