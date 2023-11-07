package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dds.BankAccount;

public class BankAccountDAOImpl implements BankAccountDAO {
    String url = "jdbc:mysql://localhost:3306/java";
    String username = "root";
    String password = "mansys";

    @Override
    public List<BankAccount> getAllAccounts() {
        List<BankAccount> accounts = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM bank_accounts");
            while (rs.next()) {
                BankAccount account = new BankAccount();
                account.setAc_no(rs.getInt("ac_no"));
                account.setUser_id(rs.getInt("user_id"));
                account.setType(rs.getString("type"));
                account.setBalance(rs.getDouble("balance"));
                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }
}