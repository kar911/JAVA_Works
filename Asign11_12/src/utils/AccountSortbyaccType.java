package utils;


import java.util.Comparator;

import com.showroom.core.Acctype;
import com.showroom.core.BankAccount;

public class AccountSortbyaccType  implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		// TODO Auto-generated method stub
		return o1.getAcctype().name().compareTo(o2.getAcctype().name());
		
	}

}
