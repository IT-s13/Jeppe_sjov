package player;

public class Account {
	private int money;
	private String result;
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
	public String depositMoney(int deposit) {
//		if (deposit < 0) {
//			result = tui.depositError();
//			return result;
//		} else {

			money = money + deposit;
			result = tui.depositSuccess();

			return result;
		}
	

	// metoden til at h�ve penge fra kontoen
	public String withdrawMoney(int withdraw) {
		if (withdraw >= 0) {
			if (money - withdraw < 0) {
					money=-1;
				result = tui.withdrawError();
				return result;

			} else {
				money = money - withdraw;
				result = tui.withdrawSuccess();
				return result;
			}
		} else {
			result = tui.withdrawNegative();
			return result;
		}
	}
	
	// obligatorisk toString metode
	public String toString() {


		String stringresult;

		stringresult = money + "   ";

		return stringresult;
	}

}
