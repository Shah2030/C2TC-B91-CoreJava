package com.Abhijit.Assignment3;

import java.util.Scanner;

@SuppressWarnings("serial")
class InsufficientFundsException extends Exception
{
	//Class to demonstrate user defined exception
	InsufficientFundsException()
	{
		System.err.println("Insufficient Balance");
	}
	InsufficientFundsException(String message)
	{
		System.err.println(message);
	}
}
class InvallidAmountException extends Exception
{
	//Class to demonstrate user defined exception
	InvallidAmountException()
	{
		System.err.println("\nInvallid Amount Entered");
	}
	InvallidAmountException(String message)
	{
		System.err.println(message);
	}
}

public class BankAccount 
{
	private int accountNumber;
	private double balance;
	public BankAccount(int accountNumber, double balance) 
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	boolean isValidWithdrawlAmt(double amt)
	{
		return this.balance<amt;
	}
	boolean isValidAmt(double amt)
	{
		return amt<=0;
	}
	public void deposit(double amt) throws InvallidAmountException
	{
		if(isValidAmt(amt))
			throw new InvallidAmountException();
		else
		{
			this.balance+=amt;
			System.out.println("After the deposit the account balance is: "+this.balance);
		}
	}
	public void withdraw(double amt) throws InsufficientFundsException
	{
		if(isValidWithdrawlAmt(amt))
			throw new InsufficientFundsException();
		else
		{
			this.balance-=amt;
			System.out.println("After the Withdrawl the account balance is: "+this.balance);
		}
	}
	public void display()
	{
		System.out.println("The account number of the customer is: "+this.accountNumber);
		System.out.println("Customer account balance is: "+this.balance);
	}

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Banking Service");
		Scanner s=new Scanner(System.in);
		int c=0;
		BankAccount c1=new BankAccount(85236412,5000.00);
		System.out.println("1. Withdraw\n2. Deposit\n3. Display");
		while(c!=4)
		{
			System.out.print("Enter your choice: ");
			c=s.nextInt();
			try
			{
				switch(c)
				{
					case 1: System.out.print("Enter amount to withdraw: "); c1.withdraw(s.nextDouble()); break;
					case 2: System.out.print("Enter amount to deposit: "); c1.deposit(s.nextDouble()); break;
					case 3: c1.display(); break;
					case 4: System.out.println("Thank You., Visit Again!\n"); break;
					default: System.out.println("Invallid Option entered\n");
				}
			}
			catch(InsufficientFundsException i)
			{
				i.getMessage();
			}
			catch(InvallidAmountException I)
			{
				I.getMessage();
			}
		}
		s.close();
	}

}
