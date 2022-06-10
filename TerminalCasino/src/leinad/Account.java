package leinad;

import java.util.Scanner;

public class Account {
	Scanner ask = new Scanner(System.in);
	
	private Integer startingSalary = 0;
	private Integer money = 0;
	private Integer bet = 0;
	
	public void setInitialBet() {
		System.out.println("Set initial bet: " );
		Integer bet = Integer.parseInt(ask.nextLine());
		this.bet = bet;
	}
	
	public void setStartingSalary() {
		System.out.println("Enter Starting Salary: " );
		Integer salary = Integer.parseInt(ask.nextLine());
		this.startingSalary = salary;
	}
	
	public Integer getStartingSalary() {
		return this.startingSalary;
	}
	
	public void setMoney() {
		this.money = startingSalary;
	}
	
	public Integer getMoney() {
		return this.money;
	}
	
	public Integer getBet() {
		return this.bet;
	}

}
