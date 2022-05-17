package com.mmbms.framwork;

public class SavingAcc extends BankAcc {

	private static final float minbal = 500;
	private boolean isSalaried;
	
	public SavingAcc() {}
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}

	@Override
	public void withdraw(float accBal)
	{
		
	}

	@Override
	public String toString() {
		return "SavingAcc [minbal=" + minbal + "]";
	}
	public boolean isSalaried() 
	{
		return isSalaried;
	}

	public void setSalaried(boolean isPrime) 
	{
		this.isSalaried = isPrime;
	}
	public static float minbal() 
	{
		return minbal;
	}

	/**
	 * @param isSalaried
	 */
	public SavingAcc(boolean isSalaried) {
		super();
		this.isSalaried = isSalaried;
	}

	
	
}
