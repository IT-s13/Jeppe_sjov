package player;

import boundaryToMatador.GUI;

public class Chance extends Field {

	private int length = 42; 
	private int arrayLength = 43; 
	private Chancecard[] chancecards = new Chancecard[arrayLength];

	public Chance() {
		
		//betal penge chance kort
		Chancecard chance1 = new Chancecard(-200,"du har smuglet smøger betal 200",1);
		Chancecard chance2 = new Chancecard(-3000,"betal kr. 3.000 for reparation af Deres vogn",1);
		Chancecard chance3 = new Chancecard(-3000,"betal kr. 3.000 for reparation af Deres vogn",1);
		Chancecard chance4 = new Chancecard(-2000,"De har modtaget Deres tandlægeregning. Betal 2.000",1);
		Chancecard chance5 = new Chancecard(-200,"De har fået en parkeringsbøde betal kr. 200 i bøde",1);
		Chancecard chance6 = new Chancecard(-200,"Betal kr.200 for levering af 2 kasser øl",1);
		Chancecard chance7 = new Chancecard(-1000,"Betal deres bilforsikring - kr. 1.000",1);
		Chancecard chance8 = new Chancecard(-300,"Betal for vognvask og smøring kr.300",1);
		Chancecard chance9 = new Chancecard(-1000,"De har købt 4 nye dæk til Deres vogn. Betal kr.1.000",1);
		Chancecard chance10 = new Chancecard(-1000,"De har kørt frem for Fuldt stop. Betal kr. 1.000 i bøde",1);
		

		// modtag penge chance kort
		Chancecard chance11 = new Chancecard(1000,"Mod udbytte af deres aktier. 1.000kr",1);
		Chancecard chance12 = new Chancecard(500,"De har vundet i klasselotteriet. Modtag kr. 500.",1);	
		Chancecard chance13 = new Chancecard(3000,"Kommunen har eftergivet et kvartals skat. Hæv i banken kr. 3.000",1);	
		Chancecard chance14 = new Chancecard(1000,"De modtager deres aktieudbytte. Modtag kr. 1.000 af banken",1);	
		Chancecard chance15 = new Chancecard(1000,"De modtager deres aktieudbytte. Modtag kr. 1.000 af banken",1);
		Chancecard chance16 = new Chancecard(1000,"Grundet dyrtiden har de fået gageforhøjelse Modtag kr. 1.000",1);	
		Chancecard chance17 = new Chancecard(1000,"De havde en række med elleve rigtige i tipning. Modtag kr. 1.000",1);	
		Chancecard chance18 = new Chancecard(1000,"De har solgt nogle gamle møbler på auktion modtag kr. 1.000 af banken",1);	
		Chancecard chance19 = new Chancecard(1000,"Deres præmieobligation er udtrukket. De modtager kr. 1.000 af banken",1);	
		Chancecard chance20 = new Chancecard(500,"De har vundet i Klasselotteriet. Modtag kr.500",1);	
		Chancecard chance21 = new Chancecard(200,"Vædien af egen avl fra nyttehaven udgø kr. 200,som de modtager af banken",1);	
		Chancecard chance22 = new Chancecard(1000,"Deres præmieobligation er udtrukket. De modtager kr. 1.000 af banken",1);
		
		
		// ryk frem til et bestemt felt chance kort 
		
		Chancecard chance23 = new Chancecard(6,"Tag med Øresundsbåden, hvis de passerer start indkasserer de kr.4.000",2);
		Chancecard chance24 = new Chancecard(31,"Gå i fængsel. Ryk direkte til fængslet, de får ikke penge selvom de passerer start indkasserer de ikke kr.4.000",5);
		Chancecard chance25 = new Chancecard(31,"Gå i fængsel. Ryk direkte til fængslet, de får ikke penge selvom de passerer start indkasserer de ikke kr.4.000",5);
		Chancecard chance26 = new Chancecard(40,"tag ind på rådhuspladsen",2);
		Chancecard chance27 = new Chancecard(20,"ryk frem til strandveje, modtag kr.4.000 hvis de passerer start",2); 
		Chancecard chance28 = new Chancecard(25,"Ryk frem til Grønningen. Hvis de passerer ”START” indkassér da kr. 4.000.",2);
		Chancecard chance29 = new Chancecard(33,"Ryk frem til Vimmelskaftet Hvis de passerer ”START” indkassér da kr.4.000.",2);
		Chancecard chance30 = new Chancecard(1,"Ryk frem til ”START”.",2);
		Chancecard chance31 = new Chancecard(1,"Ryk frem til ”START”.",2);
		Chancecard chance32 = new Chancecard(12,"Ryk frem til Frederiksberg Allé. Hvis de passerer ”START”, indkassér da kr. 4.000",2);
		
		
		// ryk frem eller tilbage
		Chancecard chance33 = new Chancecard(2,"Ryk 2 felter frem",3);
		Chancecard chance34 = new Chancecard(-1,"ryk 1 felt tilbage",3);
		Chancecard chance35 = new Chancecard(5,"ryk 5 frelter frem",3);
		Chancecard chance36 = new Chancecard(-3,"ryk 3 felter tilbage",3);
		Chancecard chance37 = new Chancecard(3,"ryk 3 felter frem",3);
		Chancecard chance38 = new Chancecard(-5,"ryk 5 felter tilbage",3);
		Chancecard chance39 = new Chancecard(-2,"ryk 2 felter tilbafe",3);
		Chancecard chance40 = new Chancecard(1,"ryk et felt frem",3);
				
		// ryk frem til det nærmeste rædderi
				
		Chancecard chance41 = new Chancecard(1,"ryk frem til det nærmeste rædderi",4);
		Chancecard chance42 = new Chancecard(1,"ryk frem til det nærmeste rædderi",4);
		
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
			boolean prison,int drawncard,boolean ownsall) {
		

		switch (chancecards[drawncard].chanceType()) {
		case 1: // er de chance kort hvor man modtager eller skal betale penge til banken

			int money = chancecards[drawncard].chanceSum();
			GUI.getUserButtonPressed("du modtager/betaler" + money, "ok");
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