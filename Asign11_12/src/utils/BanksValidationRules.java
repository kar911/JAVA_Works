package utils;
import static java.lang.Enum.*;
import static java.time.LocalDate.of;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;

import com.showroom.core.Acctype;
import com.showroom.core.BankAccount;

import custom_exceptions.InvalidInputException;

public class BanksValidationRules {
//add a public static method to validate --
	// manufactureDate : must be after 1st Jan 2020
	public static LocalDate parseAndValidateManufactureDate(String date) throws InvalidInputException {
		LocalDate d1 = parse(date);
		if (d1.isBefore(LocalDate.now()))
			return d1;
		throw new InvalidInputException("opening date must be before today");
	}

	// add a static method for parsing n validation Acctype
	public static Acctype parseAndValidate(String clr) throws IllegalArgumentException {
//		return valueOf(Acctype.class,clr.toUpperCase());
		return Acctype.valueOf(clr.toUpperCase());
	}

	// add a static method for checking the dups
	public static void checkForDup(String newChNo,int accNo, ArrayList<BankAccount> BankAccounts) throws InvalidInputException {
		// create a new BankAccount instance : wrapping PK (prim key) : unique ID
		BankAccount newBankAccount = new BankAccount(newChNo,accNo);
		if(BankAccounts.contains(newBankAccount))
					throw new InvalidInputException("Dup ch no !!!!!!!!!!!");
		//=> no dup found...
		System.out.println("no dups ....");

	}
	public static void validateaccountType(String clr,double accBal) throws InvalidInputException {
		if(Acctype.valueOf(clr.toUpperCase()).getAcc_minbal()  >= accBal) {
			throw new InvalidInputException("not a vaild ballance for the account");
		}
	}
	//add a static method to validate all i/ps
	//In case of success -- return the BankAccount ref to the caller 
	//o.w throw the exception
	public static BankAccount validateAllInputs(String pin, String acctype, double accBal, 
			String accCreatDate, int accNo,ArrayList<BankAccount> accounts) throws InvalidInputException,IllegalArgumentException
	{
		checkForDup(pin, accNo,accounts);
		Acctype typ=parseAndValidate(acctype);
		validateaccountType(acctype,accBal);
		LocalDate date = parseAndValidateManufactureDate(accCreatDate);
		//=> all validations successful !
		return new BankAccount(pin,typ,accBal,date,accNo);
	}
}
