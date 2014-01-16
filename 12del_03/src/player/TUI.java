package player;

public class TUI {
	private String result;

	public TUI() {

	}
	public String Winner() {
		result="The winner is: "; 
		return result;
	}

	public String Tower() {
		result = " You entered the tower, and at the the top you found a chest full of gold. you recieve 250 gold";
		return result;

	}

	public String Crater() {
		result = "You fell into the deep crater and while you tumbled down you lost 200 gold";
		return result;

	}

	public String PalaceGates() {
		result = "You have arrived at the Palace gates, however while you admire the gates a thief steal 100 gold from you";
		return result;

	}

	public String ColdDessert() {
		result = " you went into the Cold Dessert, but before you ventured into the Dessert you bought materials for a fire. you spent 20 gold";
		return result;

	}

	public String WalledCity() {
		result = "While you were in the Walled city a guy approached you and said he had waited for you, he gave you a bag full of useless items, but you also found 180 gold";
		return result;

	}

	public String Monastery() {
		result = "You stayed for a while at the peacefull Monastery, the hospitality of the monks are free";
		return result;

	}

	public String BlackCave() {
		result = "While searching in the mountains you saw a black cave, however bandits were hiding in the cave, they robbed you for 70 gold";
		return result;

	}

	public String HutsInTheMountains() {
		result = "You stayed for the night at the huts, the stay cost you 60 gold";
		return result;

	}

	public String Wearwall() {
		result = "Hvad faen er en Wearwall";
		return result;

	}

	public String Pit() {
		result = " You fell into the Pit and had to pay 90 gold to be helped up";
		return result;

	}

	public String Goldmine() {
		result = "You found an abandoned Goldmine, inside was a cart full of gold, you sold the gold and earned 650 gold";
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

	public String depositError() {
		result = "You are not able to deposit a negativ amount!";
		return result;
	}

	public String depositSuccess() {
		result = "Your money was successfully deposit";
		return result;
	}

	public String withdrawError() {
		result = "Your withdraw value exceeds the amount currently available";
		return result;
	}

	public String withdrawSuccess() {
		result = "your money was succesfully withdrawn";
		return result;
	}

	public String withdrawNegative() {
		result = "You are trying to withdraw a negative amount";
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
