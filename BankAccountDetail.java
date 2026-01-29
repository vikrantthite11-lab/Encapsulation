package com.enc;

public class BankAccountDetail {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		System.out.println("BankAccount Detail..");
		b.setBalence(100000);
		b.setWithdraw(550000);
		System.out.println("BankAccount Initial Balence ="+ b.getBalence());
		System.out.println("BankAccount Withdraw "+ b.getWithdraw());
			
		
	}
}
