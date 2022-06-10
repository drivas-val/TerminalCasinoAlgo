package leinad;

public class StratR {
	Roulette roul = new Roulette();
	Account acc = new Account();
	
	
	public void martingale() {
		acc.setStartingSalary();
		acc.setInitialBet();
		acc.setMoney();
		
		Integer money = acc.getMoney();
		Integer bet = acc.getBet();
		Integer count = 0;
		Integer max = 0;
		
		while (money > 0) {
		
			String[] ball = roul.spinWheel();
			
			//Win
			if (ball[1] == "r") {
				count++;
				money += bet;
				if (money > max) {
					max = money;
				}
				System.out.println(count + "." + " W - " + money);
				bet = acc.getBet();
			}
			//Loss
			else {
				count++;
				money -= bet;
	
				System.out.println(count + "." + " L - " + money);
				
				if(money < bet*2) {
					bet = money;
				}
				else {
				bet = bet*2;
				}
			}
	    }
		
		System.out.println("\nMax: " + max);
	}
}
