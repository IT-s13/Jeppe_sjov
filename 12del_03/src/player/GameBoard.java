package player;

import boundaryToMatador.GUI;

public class GameBoard {
	private Field[] fields = new Field[41];

	public GameBoard() {

		Home Start = new Home();

		Territory Rødovrevej = new Territory(1200, null, 50, "blue", 1000, 250,
				750, 2250, 4000, 6000, 0);
		Chance chance1 = new Chance();
		Territory Hvidovrevej = new Territory(1200, null, 50, "blue", 1000,
				250, 750, 2250, 4000, 6000, 0);
		Tax tax1 = new Tax(4000);
		Fleet Øresund = new Fleet(4000, null);
		Territory Roskildevej = new Territory(2000, null, 100, "pink", 1000,
				600, 1800, 5400, 8000, 11000, 0);
		Chance chance2 = new Chance();
		Territory Valby_Langgade = new Territory(2000, null, 100, "pink", 1000,
				600, 1800, 5400, 8000, 11000, 0);
		Territory Allégade = new Territory(2400, null, 150, "pink", 1000, 800,
				2000, 6000, 9000, 12000, 0);
		Jail besøg = new Jail();
		Territory Frederiksberg_Allé = new Territory(2800, null, 300, "green",
				2000, 1000, 3000, 9000, 12500, 15000, 0);
		Brewery Tuborg = new Brewery(2500, null);
		Territory Bülowsvej = new Territory(2800, null, 200, "green", 2000,
				1000, 3000, 9000, 12500, 15000, 0);
		Territory Gl_Kongevej = new Territory(3200, null, 250, "green", 2000,
				1250, 3750, 10000, 14000, 18000, 0);
		Fleet dfds = new Fleet(4000, null);
		Territory Bernstorffsvej = new Territory(3800, null, 300, "grey", 2000,
				1400, 4000, 11000, 15000, 19000, 0);
		Chance chance3 = new Chance();
		Territory Hellerupvej = new Territory(3800, null, 300, "grey", 2000,
				1400, 4000, 11000, 15000, 19000, 0);
		Territory Strandvejen = new Territory(4000, null, 350, "grey", 2000,
				1600, 4400, 12000, 16000, 20000, 0);
		Refuge Parkering = new Refuge(4000);
		Territory Trianglen = new Territory(4400, null, 350, "red", 3000, 1800,
				5000, 14000, 17500, 21000, 0);
		Chance chance4 = new Chance();
		Territory Østerbrogade = new Territory(4400, null, 350, "red", 3000,
				1800, 5000, 14000, 17500, 21000, 0);
		Territory Grønningen = new Territory(4800, null, 400, "red", 3000,
				2000, 6000, 15000, 18500, 22000, 0);
		Fleet ø_s = new Fleet(4000, null);
		Territory Bredgade = new Territory(5200, null, 450, "white", 3000,
				2200, 6600, 16000, 19500, 23000, 0);
		Territory Kgs_Nytorv = new Territory(5200, null, 450, "white", 3000,
				2200, 6600, 16000, 19500, 23000, 0);
		Brewery Carlsberg = new Brewery(2500, null);
		Territory Østergade = new Territory(5600, null, 500, "white", 3000,
				2400, 7200, 17000, 20500, 24000, 0);
		Jail fængsel = new Jail();
		Territory Amagertorv = new Territory(6000, null, 550, "yellow", 4000,
				2600, 7800, 18000, 22000, 25000, 0);
		Territory Vimmelskaftet = new Territory(6000, null, 550, "yellow",
				4000, 2600, 7800, 18000, 22000, 25000, 0);
		Chance chance5 = new Chance();
		Territory Nygade = new Territory(6400, null, 600, "yellow", 4000, 3000,
				9000, 20000, 24000, 28000, 0);
		Fleet bornholm = new Fleet(4000, null);
		Chance chance6 = new Chance();
		Territory Frederiksberggade = new Territory(7000, null, 700, "purple",
				4000, 3500, 10000, 22000, 26000, 30000, 0);
		Tax tax2 = new Tax(2000);
		Territory Rådhuspladsen = new Territory(8000, null, 1000, "purple",
				4000, 4000, 12000, 28000, 34000, 40000, 0);

		fields[1] = Start;
		fields[2] = Rødovrevej;
		fields[3] = chance1;
		fields[4] = Hvidovrevej;
		fields[5] = tax1;
		fields[6] = Øresund;
		fields[7] = Roskildevej;
		fields[8] = chance2;
		fields[9] = Valby_Langgade;
		fields[10] = Allégade;
		fields[11] = besøg;
		fields[12] = Frederiksberg_Allé;
		fields[13] = Tuborg;
		fields[14] = Bülowsvej;
		fields[15] = Gl_Kongevej;
		fields[16] = dfds;
		fields[17] = Bernstorffsvej;
		fields[18] = chance3;
		fields[19] = Hellerupvej;
		fields[20] = Strandvejen;
		fields[21] = Parkering;
		fields[22] = Trianglen;
		fields[23] = chance4;
		fields[24] = Østerbrogade;
		fields[25] = Grønningen;
		fields[26] = ø_s;
		fields[27] = Bredgade;
		fields[28] = Kgs_Nytorv;
		fields[29] = Carlsberg;
		fields[30] = Østergade;
		fields[31] = fængsel;
		fields[32] = Amagertorv;
		fields[33] = Vimmelskaftet;
		fields[34] = chance5;
		fields[35] = Nygade;
		fields[36] = bornholm;
		fields[37] = chance6;
		fields[38] = Frederiksberggade;
		fields[39] = tax2;
		fields[40] = Rådhuspladsen;

	}

	public Field getField(int diceSum) {

		return fields[diceSum];

	}

	public boolean ownsall(int fieldnumber, Player player) {
		String currentType;
		Player currentOwner;
		int typeCounter, ownerCounter;
		typeCounter = 0;
		ownerCounter = 0;
		currentType = fields[fieldnumber].getType();
		currentOwner = fields[fieldnumber].getOwner();
		System.out.println(currentType);

		System.out.println(currentOwner);

		for (int i = 1; i <= 40; i++) {
			if (fields[i] instanceof Territory
					&& fields[i].getType() == currentType) {
				typeCounter++;
				System.out.println("typeCounter " + typeCounter);

			}
		}
		for (int i = 1; i <= 40; i++) {
			if (fields[i] instanceof Territory
					&& fields[i].getType() == currentType
					&& fields[i].getOwner() == currentOwner
					&& fields[i].getOwner() != null
					&& fields[i].getType() != null) {
				ownerCounter++;
				System.out.println(" ownerCounter " + ownerCounter);
			}
		}
		if (ownerCounter == typeCounter
				&& fields[fieldnumber] instanceof Territory
				&& currentOwner==player) {

			return true;
		} else {
			return false;
		}

	}

	public void buyHouse(Player player) {
		Field[] array = getArray(player.getFieldNum(), player);
		System.out.println(array);
		boolean choice1 = GUI.getUserLeftButtonPressed(
				"vil du bygge huse på dine grunde?", "ja", "nej");
		while (choice1 == true) {
			if (array.length == 2) {
				String choice = GUI.getUserButtonPressed(
						"hvilken grund vil du bygge et hus på?", "grund 1",
						"grund 2");
				if (choice == "grund 1") {
					if (array[0].getHouseCount() < 5) {
						array[0].upHouseCount();
						player.getPlayerAcc().changeBalance(
								-array[0].getHousePrice());
						GUI.setBalance(player.getPlayerName(), player
								.getPlayerAcc().getBalance());
					}
				} else if (choice == "grund 2") {
					if (array[1].getHouseCount() < 5) {
						array[1].upHouseCount();
						player.getPlayerAcc().changeBalance(
								-array[1].getHousePrice());
						GUI.setBalance(player.getPlayerName(), player
								.getPlayerAcc().getBalance());
					}
				}
			} else if (array.length == 3) {
				String choice = GUI.getUserButtonPressed(
						"hvilken grund vil du bygge et hus på?", "grund 1",
						"grund 2", "grund 3");
				if (choice == "grund 1") {
					if (array[0].getHouseCount() < 5) {

						array[0].upHouseCount();
						player.getPlayerAcc().changeBalance(
								-array[0].getHousePrice());
						GUI.setBalance(player.getPlayerName(), player
								.getPlayerAcc().getBalance());
					}
				}
				if (choice == "grund 2") {
					if (array[1].getHouseCount() < 5) {

						array[1].upHouseCount();
						player.getPlayerAcc().changeBalance(
								-array[1].getHousePrice());
						GUI.setBalance(player.getPlayerName(), player
								.getPlayerAcc().getBalance());
					}
				}
				if (choice == "grund 3") {
					if (array[2].getHouseCount() < 5) {

						array[2].upHouseCount();
						player.getPlayerAcc().changeBalance(
								-array[2].getHousePrice());
						GUI.setBalance(player.getPlayerName(), player
								.getPlayerAcc().getBalance());
					}
				}

			}

			choice1 = GUI.getUserLeftButtonPressed(
					"ønsker de at købe et hus mere?", "ja", "nej");
			for (int i = 1; i <= fields.length - 1; i++) {
				if (fields[i] instanceof Territory) {
					GUI.setHouses(i, fields[i].getHouseCount());
					if (fields[i].getHouseCount() == 5) {
						GUI.setHotel(i, true);
					}
				}
			}
		}
	}

	private Field[] getArray(int fieldnumber, Player player) {

		String currentType = fields[fieldnumber].getType();
		int typeCounter = 0;
		for (int i = 1; i <= fields.length - 1; i++) {

			if (currentType == fields[i].getType()) {
				typeCounter++;
			}
		}

		Field[] array = new Field[typeCounter];
		int u = 0;
		for (int i = 1; i <= fields.length - 1; i++) {
			if (fields[i].getType() == currentType
					&& fields[i].getOwner() == player) {
				array[u] = fields[i];
				u++;
			}

		}
		return array;

	}

}
