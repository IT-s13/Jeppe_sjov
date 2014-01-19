package player;


public abstract class Field {
	

	

	// konstruktør til Field klassen
	public Field() {

	}
	
	public abstract void landOnField(Player player,int fieldnum,Field field,boolean prison,int drawncard,boolean ownsall);

	public abstract void releaseFields(Player player);

	public abstract String getType();
	public abstract Player getOwner();
	public abstract int getHouseCount();

	public abstract int upHouseCount();

	public abstract int getHousePrice();

	public abstract int getHouseRent(int houseCount);

	

}
