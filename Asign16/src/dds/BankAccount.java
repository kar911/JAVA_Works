package dds;

public class BankAccount {
    private int ac_no;
    private int user_id;
    private String type;
    private double balance;
	public int getAc_no() {
		return ac_no;
	}
	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [ac_no=" + ac_no + ", user_id=" + user_id + ", type=" + type + ", balance=" + balance + "]";
	}
	
}
