package com.mmbms.framwork;

public class CurrentAcc extends BankAcc
{
	protected final float creditLimit = 500;


public CurrentAcc() {}
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal);
		
	}
	
	@Override
	public void withdraw(float accBal)
	{
		System.out.println("Dear Current account holder :-\n Your Current Account Balance are: "+accBal+"\n		And Credit limit  is: "+creditLimit);
		System.out.println("		Total charges :"+(accBal+creditLimit));
		
	}
	@Override
	public String toString() {
		return "CurrentAccc [creditLimit=" + creditLimit + "]";
	}
	public float getCreditLimit() 
	{
		return creditLimit;
	}
}
