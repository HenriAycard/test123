package blackjack;

import java.util.Scanner;

public class JoueurHumain extends Joueur{

	public JoueurHumain(Main m) {
		super(m);
		// TODO Auto-generated constructor stub
	}
	
	public boolean prendreCarte() {
		System.out.println("	voulez vous piochez ? (o/n)");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		//scanner.close();
		if(str.equals("o")) {
			return true;
		}else{
			return false;
		}

	}

	@Override
	public String toString() {
		return " " + m;
	}
	
	
	
//	public void ajouter(Talon t, int nbcarte) {
//		m.PrendCarte(t, nbcarte);
//	}

}
