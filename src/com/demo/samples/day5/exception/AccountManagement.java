package com.demo.samples.day5.exception;

import java.util.Scanner;

public class AccountManagement {
	private float currentBalance = 6000f;

	public static void main(String[] args) {
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Please enter amount to add / withdraw in your balance: ");
		System.out.println("Please enter your choice: ");
		
		int choice = inputDevice.nextInt();
		float newAmount = inputDevice.nextFloat();
		
		switch (choice) {
		case 1: {
			try {
				float totalAmount = new AccountManagement().AddAmount(newAmount);
				System.out.println("Total Account Balance = " + totalAmount);
			} catch (AccountBalanceException a) {
				float fdAmount = a.getAccountBalance() - 20000;
				System.out.println("Your account balance is more than 20K now, So creating FD of Amount: " + fdAmount);
				new AccountManagement().createFixDeposit(fdAmount);
				System.out.println("Account Balance = " + 20000);
			}
			break;
			
		}
		case 2: {
			float totalAmount=0.0f;
			try {
				 totalAmount= new AccountManagement().withdrawAmount(newAmount);
					
					
			//	System.out.println("Total Account Balance = " + totalAmount);
			} catch (AccountInsufficientException a) {
			//	 totalAmount = a.getAccountBalance() - newAmount;
				System.out.println("Your account balance is reached the minimum level " );
				System.out.println("Account Balance = " + a.getAccountBalance());
			}
			break;
		}
		default:
		//	throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
	}

	public float AddAmount(float amount) throws AccountBalanceException {
		float total = currentBalance + amount;
		if (total > 20000) {
			throw new AccountBalanceException(total);
		}
		return total;
	}


	//TODO - this will be implemented later
	public void createFixDeposit(float fxAmount) {
		// Implimentation of FD creation
		
		
	}
	
	public float withdrawAmount(float amount)throws AccountInsufficientException {
		float total = currentBalance - amount;
		System.out.println(total);
		if (total < 5000) {
			throw new AccountInsufficientException(total);
		}
		return total;
		
	}
}
