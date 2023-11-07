package utils;


import java.util.Comparator;

import com.showroom.core.BankAccount;

public class AccountSortbyDate  implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		// TODO Auto-generated method stub
		return o1.getAccCreatDate().compareTo(o2.getAccCreatDate());
		
	}
	

}
