package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory sf = new GSShopFactory();
		PrimeAcc pa = new GSPrimeAcc(123,"Rahul",500, true);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		
		NormalAcc na = new GSNormalAcc(455,"Kumar",1000,70);
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
		

	}

}
