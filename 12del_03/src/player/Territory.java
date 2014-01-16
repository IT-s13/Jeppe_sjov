package player;

public class Territory extends Ownable {
	
	private int rent,houseprice,house1,house2,house3,house4,hotel;
	private String color; 
	
	public Territory(int price,Player owner,int rent,String color,int houseprice,int house1,int house2,int house3,int house4,int hotel) {
		super(price,owner);
		this.rent = rent;
		this.color=color; 
		this.houseprice=houseprice; 
		this.house1=house1; 
		this.house2=house2; 
		this.house3=house3; 
		this.house4=house4; 
		this.hotel=hotel; 
	}

	@Override
	public int getRent() {
		
		return rent;
	}
	
	public int getHousePrice(){
		return houseprice; 
	}
	
	public int getHouse1(){
		return house1; 
	}
	
	public int getHouse2(){
		return house2; 
	}
	
	public int getHouse3(){
		return house3; 
	}
	
	public int getHouse4(){
		return house4; 
	}
	
	public int getHotel(){
		return hotel; 
	}
	
	public String getType(){
		return color;
	}
	public Player getOwner(){
		
		return owner; 
	}
	


}
