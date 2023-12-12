package com.javaAssignment;

import java.util.Scanner;

//W.A.J.P. to create a custom exception if Customer withdraw amount
//which is greater than account balance then program will show custom 
//exception otherwise amount will deduct from account balance.
//Account balance is:2000 Enter withdraw
//amount:2500
//Sorry, insufficient balance, you need more 500 Rs.To perform
//this transaction.



class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int accountBalance;

    public BankAccount(int initialBalance) {
        this.accountBalance = initialBalance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > accountBalance) {
            int requiredAmount = amount - accountBalance;
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + requiredAmount + " Rs. to perform this transaction.");
        } else {
            accountBalance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully. Remaining balance: " + accountBalance + " Rs.");
        }
    }
}

public class qution27 {
public static void main(String[] args) {
	
	        BankAccount account = new BankAccount(2000);
	        int withdrawAmount = 2500;

	        try {
	            account.withdraw(withdrawAmount);
	        } catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
	
 
