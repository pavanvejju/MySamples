package com.langpack.PolymorphismTest;

public class SavingAccount extends Account{
	public void withdraw(){
		System.out.println("Saving Account withdraw");
	}
	
	public void deposit(){
		System.out.println("Saving Account deposit");
	}
}
