package com.mmbms.application;

import com.mmbms.framwork.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc() {}
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	{
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public void withdraw(float accBal)
	{
		System.out.println("Dear Mohtasim : \n Your Current Account Balance are: "+accBal+"\n             And Credit limit  is: "+creditLimit);
		System.out.println("		    Total Amount : " +(accBal+creditLimit));
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"MMCurrentAcc []";
	}	
}
