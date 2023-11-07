package dao;

import java.util.List;

import dds.BankAccount;

public interface BankAccountDAO {
    List<BankAccount> getAllAccounts();
}
