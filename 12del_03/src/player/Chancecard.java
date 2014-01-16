package player;

public class Chancecard {
	TUI tui = new TUI();
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
		result = tui.summenEr() + sum + tui.beskrivelse() + description
				+ tui.typen() + type;
		return result;
	}

}
