package player;

public class Account {
	private int money;
TUI tui = new TUI();

	// opretter en konstrukt�r
	public Account(int money) {

		this.money = money;

	}

	// metode til at hente ens score
	public int getBalance() {

		return money;

	}

	// metode til at inds�tte penge p� kontoen
	public void changeBalance(int change) {

			money = money + change;
			
		}
	

	
	// obligatorisk toString metode
	public String toString() {


		String stringresult;

		stringresult = money + "   ";

		return stringresult;
	}

}
