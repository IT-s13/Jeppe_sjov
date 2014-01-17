package player;

import boundaryToMatador.GUI;

public class Chance extends Field {

	private int length = 42; 
	private int arrayLength = 43; 
	private Chancecard[] chancecards = new Chancecard[arrayLength];

	public Chance() {
		TUI tui = new TUI();
		//betal penge chance kort
		Chancecard chance1 = new Chancecard(-200,tui.chance1(),1);
		Chancecard chance2 = new Chancecard(-3000,tui.chance2(),1);
		Chancecard chance3 = new Chancecard(-3000,tui.chance3(),1);
		Chancecard chance4 = new Chancecard(-2000,tui.chance4(),1);
		Chancecard chance5 = new Chancecard(-200,tui.chance5(),1);
		Chancecard chance6 = new Chancecard(-200,tui.chance6(),1);
		Chancecard chance7 = new Chancecard(-1000,tui.chance7(),1);
		Chancecard chance8 = new Chancecard(-300,tui.chance8(),1);
		Chancecard chance9 = new Chancecard(-1000,tui.chance9(),1);
		Chancecard chance10 = new Chancecard(-1000,tui.chance10(),1);
		

		// modtag penge chance kort
		Chancecard chance11 = new Chancecard(1000,tui.chance11(),1);
		Chancecard chance12 = new Chancecard(500,tui.chance12(),1);	
		Chancecard chance13 = new Chancecard(3000,tui.chance13(),1);	
		Chancecard chance14 = new Chancecard(1000,tui.chance14(),1);	
		Chancecard chance15 = new Chancecard(1000,tui.chance15(),1);
		Chancecard chance16 = new Chancecard(1000,tui.chance16(),1);	
		Chancecard chance17 = new Chancecard(1000,tui.chance17(),1);	
		Chancecard chance18 = new Chancecard(1000,tui.chance18(),1);	
		Chancecard chance19 = new Chancecard(1000,tui.chance19(),1);	
		Chancecard chance20 = new Chancecard(500,tui.chance20(),1);	
		Chancecard chance21 = new Chancecard(200,tui.chance21(),1);	
		Chancecard chance22 = new Chancecard(1000,tui.chance22(),1);
		
		
		// ryk frem til et bestemt felt chance kort 
		
		Chancecard chance23 = new Chancecard(6,tui.chance23(),2);
		Chancecard chance24 = new Chancecard(31,tui.chance24(),5);
		Chancecard chance25 = new Chancecard(31,tui.chance25(),5);
		Chancecard chance26 = new Chancecard(40,tui.chance26(),2);
		Chancecard chance27 = new Chancecard(20,tui.chance27(),2); 
		Chancecard chance28 = new Chancecard(25,tui.chance28(),2);
		Chancecard chance29 = new Chancecard(33,tui.chance29(),2);
		Chancecard chance30 = new Chancecard(1,tui.chance30(),2);
		Chancecard chance31 = new Chancecard(1,tui.chance31(),2);
		Chancecard chance32 = new Chancecard(12,tui.chance32(),2);
		
		
		// ryk frem eller tilbage
		Chancecard chance33 = new Chancecard(2,tui.chance33(),3);
		Chancecard chance34 = new Chancecard(-1,tui.chance34(),3);
		Chancecard chance35 = new Chancecard(5,tui.chance35(),3);
		Chancecard chance36 = new Chancecard(-3,tui.chance36(),3);
		Chancecard chance37 = new Chancecard(3,tui.chance37(),3);
		Chancecard chance38 = new Chancecard(-5,tui.chance38(),3);
		Chancecard chance39 = new Chancecard(-2,tui.chance39(),3);
		Chancecard chance40 = new Chancecard(1,tui.chance40(),3);
				
		// ryk frem til det nærmeste rædderi
				
		Chancecard chance41 = new Chancecard(1,tui.chance41(),4);
		Chancecard chance42 = new Chancecard(1,tui.chance42(),4);
		
		//det samlede array
		chancecards[1]=chance1;
		chancecards[2]=chance2;
		chancecards[3]=chance3;
		chancecards[4]=chance4;
		chancecards[5]=chance5;
		chancecards[6]=chance6;
		chancecards[7]=chance7;
		chancecards[8]=chance8;
		chancecards[9]=chance9;
		chancecards[10]=chance10;
		chancecards[11]=chance11;
		chancecards[12]=chance12;
		chancecards[13]=chance13;
		chancecards[14]=chance14;
		chancecards[15]=chance15;
		chancecards[16]=chance16;
		chancecards[17]=chance17;
		chancecards[18]=chance18;
		chancecards[19]=chance19;
		chancecards[20]=chance20;
		chancecards[21]=chance21;
		chancecards[22]=chance22;
		chancecards[23]=chance23;
		chancecards[24]=chance24;
		chancecards[25]=chance25;
		chancecards[26]=chance26;
		chancecards[27]=chance27;
		chancecards[28]=chance28;
		chancecards[29]=chance29;
		chancecards[30]=chance30;
		chancecards[31]=chance31;
		chancecards[32]=chance32;
		chancecards[33] = chance33;
		chancecards[34] = chance34;
		chancecards[35] = chance35;
		chancecards[36] = chance36;
		chancecards[37] = chance37;
		chancecards[38] = chance38;
		chancecards[39] = chance39;
		chancecards[40] = chance40;
		chancecards[41] = chance41;
		chancecards[42] = chance42;

	}


public int drawCard(){
	int drawncard = (int) (Math.random() * length + 1);
	
	GUI.setNextChanceCardText(chancecards[drawncard].chanceDesc());
	return drawncard;
}

	@Override
	public void landOnField(Player player, int fieldnum, Field field,
			boolean prison,int drawncard,boolean ownsall,Field[] array) {
		TUI tui = new TUI();
		

		switch (chancecards[drawncard].chanceType()) {
		case 1: // er de chance kort hvor man modtager eller skal betale penge til banken

			int money = chancecards[drawncard].chanceSum();
			GUI.getUserButtonPressed(tui.modtagbetal() + money, tui.ok());
			player.getPlayerAcc().changeBalance(money);
			GUI.setBalance(player.getPlayerName(), player.getPlayerAcc().getBalance());
			
			break;

		case 2: // er de chancekort hvor man skal flytte hen på et bestemt felt
			GUI.removeCar(player.getFieldNum(), player.getPlayerName());

			if(player.getFieldNum()> chancecards[drawncard].chanceSum()){
				player.getPlayerAcc().changeBalance(4000);
			}
			player.setFieldNum(chancecards[drawncard].chanceSum());
			GUI.setCar(player.getFieldNum(), player.getPlayerName());
			
			break;

		case 3: // er de chancekort hvor man skal flytte nogle få felter frem eller tilbage
			int move = chancecards[drawncard].chanceSum();
			
			if(player.getFieldNum()+chancecards[drawncard].chanceSum()>40){
				player.getPlayerAcc().changeBalance(4000);
				player.setFieldNum(player.getFieldNum()+chancecards[drawncard].chanceSum()-40);
			}
			else{
			player.setFieldNum(player.getFieldNum()+move);
			}
			
			break;

		case 4: // er det kort hvor man skal rykke frem til det nærmeste rædderi
			if(player.getFieldNum()==3){
				player.setFieldNum(6);
			}
			else if (player.getFieldNum()==8){
				player.setFieldNum(16);
			}
			else if (player.getFieldNum()==18||player.getFieldNum()==23){
				player.setFieldNum(26);
			}
			else if (player.getFieldNum()==34){
				player.setFieldNum(36);
			}
			else if (player.getFieldNum()==37){
				player.setFieldNum(6);
				player.getPlayerAcc().changeBalance(4000);
			}
		
			
			break;
		case 5: 
			GUI.removeAllCars(player.getPlayerName());
			player.setJailstate(true);
			player.setFieldNum(11);
			GUI.setCar(player.getFieldNum(), player.getPlayerName());
			break;
		}



	}

	@Override
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