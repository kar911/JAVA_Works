package utils;

import java.util.ArrayList;

import com.showroom.core.BankAccount;

import custom_exceptions.InvalidInputException;
import static utils.BanksValidationRules.validateAllInputs;

public class BanksUtils {
//add public static method to get BankAccount details by it's PK (ch no)
	public static BankAccount findaccount(String pinNo,int accNo, ArrayList<BankAccount> list) throws InvalidInputException {
		BankAccount v = new BankAccount(pinNo, accNo);
		int index = list.indexOf(v);
		if (index == -1)
			throw new InvalidInputException("BankAccount not found!!!!");
		return list.get(index);
	}

	// add public static method to remove BankAccount details by it's PK (ch no)
	public static BankAccount deleteByChasisNo(String pinNo,int accNo, ArrayList<BankAccount> list) throws InvalidInputException {
		BankAccount v = new BankAccount(pinNo, accNo);
		int index = list.indexOf(v);
		if (index == -1)
			throw new InvalidInputException("BankAccount not found!!!!");
		// BankAccount found
		return list.remove(index);
	}

	// add public static method to return populated list of BankAccounts to the caller
	// use sample data
	public static ArrayList<BankAccount> populateShowroom() throws InvalidInputException ,IllegalArgumentException{
		// create empty AL
		ArrayList<BankAccount> list = new ArrayList<>();
//		String pin, String acctype, double accBal, String accCreatDate, int accNo
		list.add(validateAllInputs("abc-1001", 
				"SAVING", 300000, "2022-10-11",1, list));
		list.add(validateAllInputs("abc-1009", 
				"CURRENT", 340000, "2022-11-11",12, list));
		list.add(validateAllInputs("abc-1003", 
				"SAVING", 1, "2022-09-20",3, list));
		list.add(validateAllInputs("abc-1004", 
				"FD", 390000, "2023-01-15",2, list));
		list.add(validateAllInputs("abc-1007", 
				"FD", 670001, "2021-10-11",4, list));
		list.add(validateAllInputs("abc-1012", 
				"LOAN", 670000, "2021-10-11",6, list));
		list.add(validateAllInputs("abc-1013", 
				"LOAN", 670045, "2021-10-11",9,list));
		return list;//utils class rets populated showroom to tester
	}

}
