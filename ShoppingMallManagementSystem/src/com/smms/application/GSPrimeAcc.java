package com.smms.application;

import com.smms.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{

private static final float charges=0; 
	
	
	public float getCharges() {
		return charges;
	}

	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
		
	}
	
	public void bookProduct(float charges)
	{
		
		
		System.out.println("Dear Prime User: \n 		Free Delivery \n		Your Product Charges are:"+charges);
	}

	
	
	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}
}
