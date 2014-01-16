package player;

import boundaryToMatador.GUI;

public class Tax extends Field {
	private int taxAmount;
	TUI tui = new TUI();

	public Tax(int statAmount) {
		this.taxAmount=statAmount; 
		
		
	}

	@Override
	public void landOnField(Player player,int fieldnum,Field field, boolean prison,int drawncard,boolean ownsall) {
		if (taxAmount==4000){
			if(GUI.getUserLeftButtonPressed(tui.tax(), "4000", "10%")==true){
				player.getPlayerAcc().changeBalance(-taxAmount);
				GUI.setBalance(player.getPlayerName(), player.getPlayerAcc().getBalance());
			}
			else { 
				int payment =(player.getPlayerAcc().getBalance()/100)*10;
				player.getPlayerAcc().changeBalance(-payment);
				GUI.setBalance(player.getPlayerName(), player.getPlayerAcc().getBalance());
				
			}
		}
			else {
				player.getPlayerAcc().changeBalance(-taxAmount);
				GUI.setBalance(player.getPlayerName(), player.getPlayerAcc().getBalance());
				
			}
		}

	@Override
	public void releaseFields(Player player) {
		// TODO Auto-generated method stub
		
	}
	public String toString() {
		String result; 
		result=tui.landOnTax() + taxAmount; 
		return result; 
		
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

