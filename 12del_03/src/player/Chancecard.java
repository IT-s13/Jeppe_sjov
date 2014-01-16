package player;

public class Chancecard {
	
	private int sum, type;
	private String description;

	public Chancecard(int number, String description, int type) {
		this.sum = number;
		this.description = description;
		this.type = type;
	}

	public int chanceType() {
		return type;
	}

	public int chanceSum() {
		return sum;
	}

	public String chanceDesc() {
		return description;
	}

	public String toString() {
		String result;
		result = "summen er " + sum + " beskrivelsen er " + description
				+ " typen er " + type;
		return result;
	}

}
