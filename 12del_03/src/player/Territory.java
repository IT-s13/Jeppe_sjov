package player;

public class Territory extends Ownable {

	private int rent, houseprice, house1, house2, house3, house4, hotel,
			houseCount;
	private String color;

	public Territory(int price, Player owner, int rent, String color,
			int houseprice, int house1, int house2, int house3, int house4,
			int hotel, int houseCount) {
		super(price, owner);
		this.rent = rent;
		this.color = color;
		this.houseprice = houseprice;
		this.house1 = house1;
		this.house2 = house2;
		this.house3 = house3;
		this.house4 = house4;
		this.hotel = hotel;
		this.houseCount = houseCount;
	}

	@Override
	public int getRent() {

		return rent;
	}

	public int getHouseCount() {
		return houseCount;
	}

	public int upHouseCount() {
		houseCount = houseCount + 1;
		return houseCount;
	}

	public int getHousePrice() {
		return houseprice;
	}

	public int getHouseRent(int houseCount) {
		int houseRent = 0;
		switch (houseCount) {

		case 0:
			break;
		case 1:
			houseRent = house1;
			break;
		case 2:
			houseRent = house2;
			break;
		case 3:
			houseRent = house3;
			break;
		case 4:
			houseRent = house4;
			break;
		case 5:
			houseRent = hotel;
			break;

		}
		return houseRent;

	}

	public String getType() {
		return color;
	}

	public Player getOwner() {

		return owner;
	}

}
