package player;

import boundaryToMatador.GUI;

abstract class Ownable extends Field {
	protected int price;
	protected Player owner;
	TUI tui = new TUI();

	public Ownable(int price, Player owner) {
		this.price = price;
		this.owner = owner;

	}

	@Override
	public void landOnField(Player player, int fieldnum, Field field,
			boolean prison, int drawncard, boolean ownsall) {

		if (owner == null) {
			boolean choice = GUI.getUserLeftButtonPressed(tui.buyproperty(),
					tui.yes(), tui.no());
			if (choice == true) {
				if (player.getPlayerAcc().getBalance() > price) {
					player.getPlayerAcc().changeBalance(-price);
					owner = player;
					if (field instanceof Fleet) {
						player.updateFleet();
					}
					if (field instanceof Brewery) {
						owner.updateLabor();
					}
					GUI.setBalance(player.getPlayerName(), player
							.getPlayerAcc().getBalance());
					GUI.setOwner(fieldnum, player.getPlayerName());
				} else {
					GUI.showMessage(tui.cantAfford());

				}
			}

		}
		if (owner != null && owner != player) {
			if (ownsall == true) {
				owner.getPlayerAcc().changeBalance(getRent() * 2);
				player.getPlayerAcc().changeBalance(-getRent() * 2);
				GUI.setBalance(player.getPlayerName(), player.getPlayerAcc()
						.getBalance());
				GUI.setBalance(owner.getPlayerName(), owner.getPlayerAcc()
						.getBalance());
				GUI.getUserButtonPressed(
						tui.theOwneris() + owner.getPlayerName()
								+ tui.mustPay() + getRent(), tui.ok());

			}
			owner.getPlayerAcc().changeBalance(getRent());
			player.getPlayerAcc().changeBalance(-getRent());
			GUI.setBalance(player.getPlayerName(), player.getPlayerAcc()
					.getBalance());
			GUI.setBalance(owner.getPlayerName(), owner.getPlayerAcc()
					.getBalance());
			GUI.getUserButtonPressed(tui.theOwneris() + owner.getPlayerName()
					+ tui.mustPay() + getRent(), tui.ok());

		}

	}

	public void releaseFields(Player player) {
		if (player.equals(owner)) {
			owner = null;
			System.out.println(owner);

		}

	}

	public abstract int getHouseCount();

	public abstract int upHouseCount();

	public abstract int getHousePrice();

	public abstract int getHouseRent(int houseCount);

	public abstract int getRent();

	public String toString() {
		String result;
		result = tui.thePriceis() + price + tui.theOwneris() + owner;
		return result;

	}

}
