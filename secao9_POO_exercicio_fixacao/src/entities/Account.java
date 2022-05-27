package entities;

public class Account {

	//atributos:
	private int number;
	private String holder;
	private double balance;
	
	//construtores:
	public Account() {
	}
	
	public Account(int number, String holder, double inicialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(inicialDeposit);
	}

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	//getters and setters:
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	//metodos:
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= (amount + 5);
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " 
				+ String.format("%.2f", balance);
	}
}
