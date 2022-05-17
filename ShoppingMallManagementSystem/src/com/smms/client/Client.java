package com.smms.client;

import com.smms.application.*;
import com.smms.framework.*;

public class Client {

	public static void main(String[] args) {

				
				GSShopFactory gsfac = new GSShopFactory();
				gsfac.getNewPrimeAccount(001, "mohtasim", 400, true);
				gsfac.getNewNormalAccount(010, "aniket", 600, 170);
				
				
				
				GSPrimeAcc prime = new GSPrimeAcc();
				prime.getAccNm();
				prime.getAccNo();
				prime.getCharges();
				
				
				prime.bookProduct(2000);
				prime.toString();
				
				GSNormalAcc gsnormal = new GSNormalAcc(); 
				gsnormal.getAccNm();
				gsnormal.getAccNo();
				gsnormal.getCharges();
				gsnormal.getDeliveryCharge();
				
				
				gsnormal.bookProduct(2000);
				gsnormal.toString();
	}

}
