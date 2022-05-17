package com.mmbms.application;

import com.mmbms.framwork.BankFactory;
import com.mmbms.framwork.CurrentAcc;
import com.mmbms.framwork.SavingAcc;


public class MMBankFactory implements BankFactory {

	
	@Override
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		MMSavingAcc mms = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return mms;
	}
	
	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		MMCurrentAcc mmc = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return mmc;
	}

}
