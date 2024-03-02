package com.cg.application;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {
	
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm,float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return gsprime;
		
	}
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm,float charges, float deliveryCharge) {
		GSNormalAcc gsnormal= new GSNormalAcc(accNo,  accNm, charges,  deliveryCharge);
		return gsnormal;
		
	}
}
