package player;

public class TUI {
	private String result;

	public TUI() {

	}
	public String Winner() {
		result="The winner is: "; 
		return result;
	}

	public String rollDice(String playerName) {
		result = "It is " + playerName
				+ "'s turn. Press the button to roll the dice";
		return result;

	}

	public String currentBalance() {
		result = " Actual balance is ";
		return result;

	}

	public String numberOfPlayers() {
		result = "Enter the number of players, from 1 to 6";
		return result;
	}

	

	public String enterName() {
		result = "Enter your name player ";
		return result;
	}

	public String cantAfford() {
		result = "You can't afford this property";
		return result;
	}

	public String ok() {
		result = "ok";
		return result;
	}

	public String buyproperty() {
		result = "Do you want to buy this property?  The price is: ";
		return result;
	}

	public String yes() {
		result = "yes";
		return result;
	}

	public String no() {
		result = "no";
		return result;
	}

	public String theOwneris() {
		result = "The owner is: ";
		return result;
	}

	public String mustPay() {
		result = "you must pay: ";
		return result;
	}

	public String thePriceis() {
		result = "The price is: ";
		return result;
	}

	public String s() {
		result = "'s";
		return result;
	}

	public String refugeField() {
		result = "you landed on the refuge field and you recieve ";
		return result;
	}

	public String tax() {
		result = "do you want to pay 4000 or 10% of total assets";
		return result;
	}

	public String landOnTax() {
		result = "you landed on the tax field and you pay";
		return result;
	}
	public String buttondice(){
		result = "Roll dice";
		return result;
	}
	public String PayorRoll(){
		result = "do you want to pay 1000 or roll the dice";
		return result;
	}
}
