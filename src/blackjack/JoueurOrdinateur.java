package blackjack;

//import blackjack.*;

public class JoueurOrdinateur extends Joueur{
	
	public JoueurOrdinateur(Main m) {
		super(m);
		// TODO Auto-generated constructor stub
	}
	
	public boolean prendreCarte() {
		if(this.m.somme() <= 16) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "JoueurOrdinateur [m=" + m + "]";
	}
	
//	public void ajouter(Talon t, int nbcarte) {
//		m.PrendCarte(t, nbcarte);
//	}

	

}
