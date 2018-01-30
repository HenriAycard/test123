package blackjack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

	private List<Carte> mainCarte = new LinkedList<>();
	private int nbCarte;
	
	public Main(){
		nbCarte=0;
	}
	
	public void PrendCarte(Talon t, int nbajout) {
		for(int i=0; i<nbajout; i++) {
			mainCarte.add(t.DonneCarte());
			nbCarte++;
		}
	}

	@Override
	public String toString() {
		return "Main [mainCarte=" + mainCarte + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mainCarte == null) ? 0 : mainCarte.hashCode());
		return result;
	}
	
	public boolean compare(Main m) {
		
		if(somme() >= 21) {
			return false;
		}else if(m.somme() >= 21) {
			return true;
		}else if(somme()>m.somme()) {
			return true;
		}else {
			return false;
		}
	}
	
	public int somme() {
		int somme = 0;
		for(int i=0; i<nbCarte; i++) {
			somme = somme + mainCarte.get(i).getValeur().getNumVal();
		}
		return somme;
	}
	

	
	
	
	
	
	
	
}
