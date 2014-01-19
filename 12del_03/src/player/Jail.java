package player;

import boundaryToMatador.*;

public class Jail extends Field {

	private int bailamount = 1000;
	TUI tui = new TUI();
	Dicecup diceCup = new Dicecup();

	public Jail() {
		

	}

	public void landOnField(Player player, int fieldnum, Field field,
			boolean prison, int drawncard, boolean ownsall) {
		if (fieldnum == 31) {
			GUI.getUserButtonPressed(tui.ryktilFængsel(), tui.ok());
			GUI.removeAllCars(player.getPlayerName());
			player.setFieldNum(11);
			GUI.setCar(player.getFieldNum(), player.getPlayerName());
		}

		if (player.getJailcount() <= 3 && prison == true) {

			if (GUI.getUserLeftButtonPressed(tui.PayorRoll(), tui.jailBetal(),
					tui.choiceRoll()) == true) {
				GUI.showMessage(tui.jailBetalt());
				player.getPlayerAcc().changeBalance(-bailamount);
				GUI.setBalance(player.getPlayerName(), player.getPlayerAcc()
						.getBalance());
				player.restartjailcount();
				player.setJailstate(false);
			} else {
				
				for (int i = 1; i <= 3; i++) {
					GUI.getUserButtonPressed(" ", tui.rollDice());
					diceCup.roll();
					
					if (diceCup.getfacevalue1() == diceCup.getfacevalue2()) {
						GUI.getUserButtonPressed(
								tui.slogToEns(),
								tui.ok());
						player.setJailstate(false);
						player.restartjailcount();
						i = 4;	
					} 
					
					else {
						player.updatejailcount();
						if (i == 3) {
							GUI.getUserButtonPressed(
									tui.slogikkeToEns(),
									tui.ok());
						} else {
							GUI.getUserButtonPressed(
									tui.prøvigen(), tui.ok());
						}
					}

				}

			}
		} else {
			player.restartjailcount();
		}
	}

	public void releaseFields(Player player) {
		// TODO Auto-generated method stub
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

	@Override
	public int getHouseCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int upHouseCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHousePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHouseRent(int houseCount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
