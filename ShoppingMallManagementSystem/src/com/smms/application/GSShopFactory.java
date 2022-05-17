package com.smms.application;

import com.smms.framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public GSPrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharge) 
	{
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, charges, deliveryCharge);
		return gsnormal;
	}
}
