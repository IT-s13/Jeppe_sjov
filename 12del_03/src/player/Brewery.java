package player;

public class Brewery extends Ownable {
	private int baseRent;

	public Brewery(int price, Player owner) {
		super(price, owner);
		baseRent = 100;
	}

	@Override
	public int getRent() {
		Dicecup dicecup = new Dicecup();
		int rent = 1;
		if (owner.getLabor() == 1) {
			dicecup.roll();
			rent = baseRent * dicecup.getSum();
		}
		if (owner.getLabor() == 2) {
			dicecup.roll();
			rent = baseRent * dicecup.getSum() * 2;
		}
		return rent;

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return null;
	}


}
