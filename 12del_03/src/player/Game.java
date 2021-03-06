package player;

import boundaryToMatador.GUI;

public class Game {

	public Game() {

	}

	public void playGame() {
		
GUI.create("Fields1.txt");


		// initialiserer alle mine klasser som skal bruges for at køre
		// spillet.
		GameBoard gameBoard = new GameBoard();
		Dicecup diceCup = new Dicecup();
		Chance chance = new Chance(); 
		
		TUI tui = new TUI();

		// sp�rger om hvor mange spillere, der skal være med
		int a = GUI.getUserInteger(tui.numberOfPlayers(), 2, 6);

		// bruger det tal som brugeren har tastet ind, og reservere a pladser i
		// et array af typen Player som vi kalder player[]
		Player player[] = new Player[a];

		iniName(a, player);
		
		int i = 0, count = 0, counter = 0;
		while (i <= a) {
			int drawncard=chance.drawCard();
			boolean ownsall = gameBoard.ownsall(player[i].getFieldNum(), player[i]);
			if (player[i].getPlayerAcc().getBalance() > 0) {
				GUI.getUserButtonPressed(tui.rollDice(player[i].getPlayerName()), tui.buttondice());
				diceCup.roll();
				if(player[i].getJailstate()==true){
					gameBoard.getField(player[i].getFieldNum()).landOnField(
							player[i], player[i].getFieldNum(),
							gameBoard.getField(player[i].getFieldNum()),player[i].getJailstate(),drawncard,ownsall);
				}
				else {

				GUI.removeAllCars(player[i].getPlayerName());
				GUI.setCar(player[i].updateFieldNum(diceCup.getSum()),
						player[i].getPlayerName());
				
				if(player[i].getFieldNum()==31){
					player[i].setJailstate(true); 
				}
				gameBoard.getField(player[i].getFieldNum()).landOnField(
						player[i], player[i].getFieldNum(),
						gameBoard.getField(player[i].getFieldNum()),player[i].getJailstate(),drawncard,ownsall);

			}
			}
			if (player[i].getPlayerAcc().getBalance() <= 0) {
				GUI.removeAllCars(player[i].getPlayerName());
				for (int u = 1; u <= 41; u++) {
					Field field = gameBoard.getField(u);
					if (field instanceof Ownable) {
						field.releaseFields(player[i]);
					}
				}
			
			}

			// logisk funktion til at finde en vinder af spillet.
			Player[] winner = new Player[a];
			if (player[i].getPlayerAcc().getBalance() > 0) {

				count++;
				counter++;
				winner[i] = player[i];

			} else {
				counter++;
			}

			if (counter == a && count == 1) {
				i = a + 1;
				GUI.showMessage(tui.Winner() + winner);
			}

			i++;
			if (i == a) {
				i = 0;
			}

		}

	}

	private void iniName(int a, Player[] player) {
		for (int i = 0; i < a; i++) {
			Account player_Account = new Account(30000);

			Player Player = new Player(
					GUI.getUserString("Please enter your name"),
					player_Account, 0);
			player[i] = Player;
			GUI.addPlayer(player[i].getPlayerName(), player[i].getPlayerAcc()
					.getBalance());
		}
	}
}
