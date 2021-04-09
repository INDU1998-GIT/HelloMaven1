package com.valuemomentum.training.bank.HelloMaven1;

public class Customer {
	int acc;
	String name;
	double Balance;
	public Customer(int acc, String name, double balance) {
		super();
		this.acc = acc;
		this.name = name;
		Balance = balance;
	}
	
	void display()
	{
		System.out.println("customer details");
		System.out.println(this.acc+" "+this.name+" "+this.Balance);
		
	}
}
