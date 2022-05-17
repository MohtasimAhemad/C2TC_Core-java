package com.smms.application;
import com.smms.framework.*;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		
	}
	
	public GSNormalAcc() {
		super(accNo, accNm, deliveryCharge, deliveryCharge);
		
	}
  
	public void bookProduct(float charges)
	{
		System.out.println("Dear Normal User:-\n	Your product Charges are: "+charges+"\n	 And Delivery Charges is: "+deliveryCharge);
		System.out.println("	           Total charges: "+(charges+deliveryCharge));
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + getAccNo() + ", charges=" + getCharges() + ", toString()=" + super.toString()
				+ ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
