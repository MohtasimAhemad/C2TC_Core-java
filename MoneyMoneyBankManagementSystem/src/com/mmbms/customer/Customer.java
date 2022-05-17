package com.mmbms.customer;

import com.mmbms.application.MMBankFactory;
import com.mmbms.application.MMCurrentAcc;
import com.mmbms.application.MMSavingAcc;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MMBankFactory mmb = new MMBankFactory();
		mmb.getNewSavingAcc(01,"Alia", 1000, true);
		mmb.getNewCurrentAcc(02,"Ritika" , 1000, 500);
		
		 
		MMSavingAcc mms = new MMSavingAcc();
		mms.getAccNm();
		mms.getAccNo();
		mms.getAccBal();
		
		mms.withdraw(20000);
		mms.toString();
		
		MMCurrentAcc mmc = new MMCurrentAcc();
		mmc.getAccNm();
		mmc.getAccNo();
		mmc.getAccBal();
		mmc.getCreditLimit();
		
		mmc.withdraw(80000);
		mmc.toString(); 
	}

}
