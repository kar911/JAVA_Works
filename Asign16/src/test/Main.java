package test;

import java.util.List;

import dao.BankAccountDAO;
import dao.BankAccountDAOImpl;
import dds.BankAccount;


public class Main {
    public static void main(String[] args) {
        BankAccountDAO dao =  new BankAccountDAOImpl();
        List<BankAccount> accounts = dao.getAllAccounts();
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}
