package player;
import boundaryToMatador.GUI;

public class Dicecup {
	private int faceValue1, faceValue2;
	private final int MAX = 6;
	private int sum;
//	private boolean result;

	public Dicecup() {

	}

	// metoden til at rulle en terning, den returnerer faceValue.
	public void roll() {

		faceValue1 = (int) (Math.random() * MAX) + 1;
		faceValue2 = (int) (Math.random() * MAX) + 1;
		GUI.setDice(faceValue1, faceValue2);

	}


	// sum metoden som returnerer summen af de 2 terninger.
	public int getSum() {

		sum = faceValue1 + faceValue2;

		return sum;

	}
	public int getfacevalue1() {
		int facevalue11;
		facevalue11 = faceValue1;
		
		return facevalue11;
	}
	
	public int getfacevalue2() {
		int facevalue22; 
		facevalue22 = faceValue2; 
		
		return facevalue22;
		
	}


	// n�dvendig toString metode, for at kunne se output p� sk�rmen. ellers
	// kommer det ud i hexadecimal.
	public String toString() {
		String result = Integer.toString(faceValue1 + faceValue2);

		return result;
	}

}
