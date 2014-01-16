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
			player.setFieldNum(11);
			GUI.setCar(player.getFieldNum(), player.getPlayerName());
		}

		if (player.getJailcount() < 3 && prison == true) {

			if (GUI.getUserLeftButtonPressed(tui.PayorRoll(), tui.jailBetal(),
					tui.rollDice(player.getPlayerName())) == true) {
				GUI.showMessage(tui.jailBetal());
				player.getPlayerAcc().changeBalance(-bailamount);
				GUI.setBalance(player.getPlayerName(), player.getPlayerAcc()
						.getBalance());
				player.restartjailcount();
				player.setJailstate(false);
			} else {
				for (int i = 0; i <= 3; i++) {
					GUI.getUserButtonPressed(" ", tui.rollDice(player.getPlayerName()));
					diceCup.roll();
					if (diceCup.getfacevalue1() == diceCup.getfacevalue2()) {
						player.setJailstate(false);
						player.restartjailcount();
						i = 4;
						GUI.getUserButtonPressed(
								tui.slogToEns(),
								tui.ok());
					} else {
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

}
