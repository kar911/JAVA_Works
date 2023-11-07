package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.showroom.core.BankAccount;

import custom_exceptions.InvalidInputException;
import utils.AccountSortbyDate;
import utils.AccountSortbyaccType;
import utils.BanksUtils;
import utils.BanksValidationRules;
import static utils.BanksValidationRules.validateAllInputs;
import static utils.BanksUtils.*;

public class BankManagement {

	public static void main(String[] args) {
		// create a scanner
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<BankAccount> accounts = populateShowroom();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options : 1. Add a account" + "2. Display all "
							+ "3. Display specific accountdetails 4. Update Price "
							+ "5. Delete accountdetails " + "6. Delete accountdetails " + "7. Delete accountdetails "+ "8. Delete accountdetails"  );
					System.out.println("Choose an option");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter accountdetails :  chasisNo,  vehicleColor	 basePrice"
								+ "  manufactureDate(yr-mon-day),  company,");
//						String pin, String acctype, double accBal, String accCreatDate, int accNo
						BankAccount account= validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.nextInt(),
								accounts);
						// success
						accounts.add(account);
						System.out.println("accountadded....");
						break;
					case 2:
						String pin = sc.next();
						int accNo = sc.nextInt();
						account= findaccount(pin, accNo,accounts);
						System.out.println(account);
					case 3:
						System.out.println("Enter chasis no n price offset");
						String pin1 = sc.next();
						int accNo1 = sc.nextInt();
						account= findaccount(pin1, accNo1,accounts);
						account.setAccBal(account.getAccBal() - sc.nextDouble());  
						
						System.out.println("Price updated....");
						break;

					case 4:
						System.out.println("Enter chasis no n price offset");
						String pin2 = sc.next();
						int accNo2 = sc.nextInt();
						account= findaccount(pin2, accNo2,accounts);
						account.setAccBal(account.getAccBal() + sc.nextDouble());  
						
						System.out.println("Price updated....");
						break;
					case 5:
						System.out.println("Enter chasis no to remove accountdetails");
						System.out.println(deleteByChasisNo(sc.next(),sc.nextInt(),accounts));
						break;

					case 6:
						Collections.sort(accounts);
						for(BankAccount b : accounts)
							System.out.println(b);
						break;
					case 7:
						Collections.sort(accounts, new AccountSortbyaccType());
						for(BankAccount b : accounts)
							System.out.println(b);
						break;
					case 8:
						Collections.sort(accounts, new AccountSortbyDate());
						for(BankAccount b : accounts)
							System.out.println(b);
						break;
					case 0:
						System.exit(0);
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Pls retry...");
					//read off pending tokens from the scanner
					sc.nextLine();
				}
			}
		} // JVM : sc.close()
		catch (Exception e) {
//			System.out.println(e);
			e.printStackTrace();
		}

	}

}
