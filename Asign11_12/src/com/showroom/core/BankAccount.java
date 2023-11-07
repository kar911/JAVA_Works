package com.showroom.core;

import java.time.LocalDate;



/*
 * Objective : Accept vehicle details : chasisNo(string) : 
 * Unique ID, color(enum) , basePrice(double) , 
 * manufactureDate(LocalDate),company,isAvailable

 */
public class BankAccount implements Comparable<BankAccount>{
//	private static double MINBAL;
//	static {
//		MINBAL=0;
//	}
	private String pin;
	private Acctype acctype;
	private double accBal;
	private LocalDate accCreatDate;
	private int accNo;

	public BankAccount(String pin, Acctype acctype, double accBal, LocalDate accCreatDate, int accNo) {
		this.pin = pin;
		this.acctype = acctype;
		this.accBal = accBal;
		this.accCreatDate = accCreatDate;
		this.accNo = accNo;
	}
	//add overloaded ctor to wrap PK(UID)
	public BankAccount(String pinNo,int accNo)
	{
		pin=pinNo;
		this.accNo=accNo;
	}
	//toString


	//override equals method to replace ref equality by chasis no equality
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in vehicle's equals");
		if(o instanceof BankAccount) {
			BankAccount v =(BankAccount)o;
			return this.pin.equals(v.pin) && (this.accNo == v.accNo) ;
		}
		return false;
	}
	@Override
	public String toString() {
		return "BankAccount [pin=" + pin + ", acctype=" + acctype + ", accBal=" + accBal + ", accCreatDate="
				+ accCreatDate + ", accNo=" + accNo + "]";
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	@Override
	public int compareTo(BankAccount o) {
		if ( accNo > o.accNo) 
			return 1;
		if (accNo < o.accNo)
			return -1;
		return  0;
	}
	public LocalDate getAccCreatDate() {
		return accCreatDate;
	}
	public Acctype getAcctype() {
		return acctype;
	}



	

	
	
}
//3. Solve  (with lab faculty help)
//Create Java application for Banking System (Fresh scenario)
//
//Every Bank Account must have acct number(int) , customer name(string), pin (string) account type (enum : SAVING,CURRENT,FD,LOAN) , account balance(double) , creation date(localdate)
//
//
//Validation rules 
//1. account balance > min balance
//2. account type can be either : SAVING | CHECKING | LOAN | FD 
//Add validation methods . In case of failures , throw the custom exception.
//
//Save Bank account details in the growable dynamic data structure : ArrayList
//
//
//Options
//1. Create Bank Account
//Accept all i/ps , validate . In case of success , create bank acct object n store it's reference in the ArrayList.
//
//
//2. View account summary
//i/p : acct no
//o/p : In case of valid acct no , display account details , otherwisw raise custom exception with suitable err message.
//
//3. Withdraw funds
//i/p : acct no , amount to withdraw 
//o/p : In case of valid acct no n sufficient balance withdraw , otherwisw raise custom exception with suitable err message.
//
//4. Deposit funds
//i/p :acct no , amount to deposit 
//o/p : In case of valid acct no  deposit  , otherwisw raise custom exception with suitable err message.
//
//
//
//6. Close Account
//i/p :acct no 
//o/p : In case of valid acct no  delete account details  , otherwisw raise custom exception with suitable err message.
//
//0. Exit.