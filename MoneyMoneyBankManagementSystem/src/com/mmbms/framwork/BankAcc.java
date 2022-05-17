package com.mmbms.framwork;

public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;
	/**
	 * @param accNo
	 * @param accNm
	 * @param accBal
	 */
	public BankAcc() {}
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public void withdraw(float accBal)
	{
		
	}
	public void deposite(float accBal)
	{
		
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
}
